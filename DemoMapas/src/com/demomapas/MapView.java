package com.demomapas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.demomapas.messageEndpoint.model.CollectionResponseMessageData;
import com.demomapas.model.agenteendpoint.Agenteendpoint;
import com.demomapas.model.agenteendpoint.model.Agente;
import com.demomapas.model.rutaendpoint.Rutaendpoint;
import com.demomapas.model.rutaendpoint.model.CollectionResponseRuta;
import com.demomapas.model.rutaendpoint.model.Ruta;
import com.demomapas.model.tareaendpoint.Tareaendpoint;
import com.demomapas.model.tareaendpoint.model.CollectionResponseTarea;
import com.demomapas.model.tareaendpoint.model.Tarea;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MapView extends FragmentActivity implements LocationListener,OnMarkerClickListener{
	static SharedPreferences.Editor editor;
	static SharedPreferences Preferences;
	 GoogleMap mMap;
	 
	 SupportMapFragment mMapFragment;
	 private LocationManager mLocationManager;
	 public Location location;
	 RelativeLayout contenedor;
	 Long usuario;
	 AlertDialog.Builder dialog ;
	 Rutaendpoint rutaEndpoint = null;
	Ruta ruta = new Ruta();
	Tareaendpoint tareaEndpoint;

//	List<Tarea>tareas;
//	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 dialog = new AlertDialog.Builder(this);
		 inicializaEndpoints();
		//LinearLayout rLGreen = ((LinearLayout) button.getParent());
		Preferences = getApplicationContext().getSharedPreferences(
				"settings", 0);
		 usuario = Preferences.getLong("idAgente", 0l);
		   Log.i("el id del usuario en el mapa es: ", usuario.toString());
		Display display = getWindowManager().getDefaultDisplay();
		contenedor = (RelativeLayout) findViewById(R.id.contenedorMain);
		//Point size = new Point();
		//display.getSize(size);
		//int width = size.x;
		//int height = size.y;
		LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
		locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);    
		Criteria criteria = new Criteria();
		String provider = null;
		provider = locationManager.getBestProvider(criteria, false);
		if(provider!=null && !provider.equals("")){
			
			// Get the location from the given provider 
		    location = locationManager.getLastKnownLocation(provider);
		                
		    locationManager.requestLocationUpdates(provider, 2000, 1, this);

		    
		    
		    if(location!=null)
		    	onLocationChanged(location);
		    else
		    	Toast.makeText(getBaseContext(), "Location can't be retrieved", Toast.LENGTH_SHORT).show();
		    
		}else{
			Toast.makeText(getBaseContext(), "No Provider Found", Toast.LENGTH_SHORT).show();
		}
		// Getting the name of the provider that meets the criteria
	
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		Log.i("latitud", latitude+"\n");
		Log.i("longitud", longitude+"\n");
		
		

		  
		CameraUpdate center=
		        CameraUpdateFactory.newLatLng(new LatLng(latitude,
		                                                 longitude));
		    CameraUpdate zoom=CameraUpdateFactory.zoomTo(17);

		 
		
		mMapFragment = (SupportMapFragment) (getSupportFragmentManager()
	            .findFragmentById(R.id.frag_ubicacion));
		
		if (mMap == null) {
		//mMap =((SupportMapFragment)  getSupportFragmentManager().findFragmentById(R.id.frag_ubicacion)).getMap();
		}

		//ViewGroup.LayoutParams params = mMapFragment.getView().getLayoutParams();
		//params.height = (int)height/2;
		//mMapFragment.getView().setLayoutParams(params);
		
		mMap=  mMapFragment.getMap();
		mMap.moveCamera(center);
		mMap.animateCamera(zoom);
		mMap.setMyLocationEnabled(true);
		mMap.setOnMarkerClickListener((OnMarkerClickListener) this);
		Geocoder geocoder;
		List<Address> addresses = null;
		geocoder = new Geocoder(this, Locale.getDefault());
		try {
			addresses = geocoder.getFromLocation(latitude, longitude, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		String address = addresses.get(0).getAddressLine(0);
		String city = addresses.get(0).getAddressLine(1);
		String country = addresses.get(0).getAddressLine(2);
		//TextView direccion = (TextView) findViewById(R.id.direccion);
		//direccion.setText(address+" "+city+" "+country);
		
		
	///////esto no lo ocupe
		//mMapFragment.getView().setLayoutParams(params);
	//ViewGroup.LayoutParams params = mMap.getView().getLayoutParams();

		//params.height = 900;
	//mMapFragment.getView().setLayoutParams(params);
		//mMap.getView()
		//mMapFragment.setMyLocationEnabled(true);
		///////// hasta aqui

	}
	private void inicializaEndpoints(){
		Rutaendpoint.Builder rutabuilder = new Rutaendpoint.Builder(
				AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
				new HttpRequestInitializer() {

					@Override
					public void initialize(HttpRequest arg0) {
						// TODO Auto-generated method stub
					}
				});
				rutaEndpoint = CloudEndpointUtils.updateBuilder(
				rutabuilder).build();
				
				////////////////////inicializacion de ruta
				Tareaendpoint.Builder tareabuilder = new Tareaendpoint.Builder(
						AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
						new HttpRequestInitializer() {

							@Override
							public void initialize(HttpRequest arg0) {
								// TODO Auto-generated method stub
							}
						});
						tareaEndpoint = CloudEndpointUtils.updateBuilder(
						tareabuilder).build();
		
	}

	private void pintarMarcadores() {
		// TODO Auto-generated method stub
		//LatLng parametros = new LatLng(latitude, longitude);
		LatLng parametros2 = new LatLng(19.428524, -99.170938);
		
	//	mMap.addMarker(new MarkerOptions().position(parametros).title("marcador1"));
		mMap.addMarker(new MarkerOptions().position(parametros2).title("marcador2") .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
		
	}

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onMarkerClick(Marker marker) {
		// TODO Auto-generated method stub
		Log.i("marker clicked", marker.getTitle());
		  Intent intent = new Intent(MapView.this,LevantarInformacion.class);
          startActivity(intent);

		return false;
	}
	public class validarUsuario extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			 
			    dialog.setIcon(R.drawable.ic_launcher);
			    dialog.setTitle("Descargando Informacion...."); 
			      dialog.show();
			super.onPreExecute();
		}
		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			
					Ruta rutaPropia = new Ruta();
					try {
						CollectionResponseRuta Rutas = rutaEndpoint.listRuta().execute();
						for (Ruta elementos : Rutas.getItems()) {
							if (elementos.getIdAgente() == usuario) {
								rutaPropia=elementos;
							}	
					}
						List<Long> tareas = rutaPropia.getTareasId();
						
					List<Tarea> tareasUsuario = new ArrayList<Tarea>();
					for (long item : tareas) {
						Tarea t = tareaEndpoint.getTarea(item).execute();
						tareasUsuario.add(t);
						Log.i("tarea",t.getId()+ "es el id de la tarea");
					}
					
					
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
//			for (int i = 0; i < tareas.size(); i++) {
//				Tarea t = tareas.get(i);
//				LatLng parametros2 = new LatLng(t.getLat(),t.getLongitud());
//				mMap.addMarker(new MarkerOptions().position(parametros2).title(t.getId().toString()) .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
//					
//				
//			}
			dialog.setCancelable(true);
		
			super.onPostExecute(result);
		}
		}
}
