package com.demomapas;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.demomapas.model.agenteendpoint.Agenteendpoint;
import com.demomapas.model.detenidoendpoint.Detenidoendpoint;
import com.demomapas.model.detenidoendpoint.model.CollectionResponseDetenido;
import com.demomapas.model.detenidoendpoint.model.Detenido;
import com.demomapas.model.rutaendpoint.Rutaendpoint;
import com.demomapas.model.tareaendpoint.Tareaendpoint;
import com.demomapas.model.usuarioendpoint.Usuarioendpoint;
import com.demomapas.model.usuarioendpoint.model.CollectionResponseUsuario;
import com.demomapas.model.usuarioendpoint.model.Usuario;
import com.demomapas.model.zonaendpoint.Zonaendpoint;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.VideoView;

public class LevantarInformacion extends Activity{

	private EditText nombre;
	private EditText apm;
	private EditText app;
	private EditText delito;
	static Bitmap imagenphoto;
	LinearLayout contenedor;
	public static String path;
	private VideoView mVideoView;
	private Uri mVideoUri;
	private Bitmap mImageBitmap;
	private String mCurrentPhotoPath;
	static SharedPreferences.Editor editor;
	static SharedPreferences Preferences;
	Usuarioendpoint usuarioEndpoint;
	Detenidoendpoint detenidoEndpoint;
	
	private Long detenido;
	
	private static final int ACTION_TAKE_PHOTO_B = 1;
	
	private static final String JPEG_FILE_PREFIX = "IMG_";
	private static final String JPEG_FILE_SUFFIX = ".jpg";
	private static final int ACTION_TAKE_PHOTO_S = 2;
	private static final int ACTION_TAKE_VIDEO = 3;
	private static final String BITMAP_STORAGE_KEY = "viewbitmap";
	private static final String VIDEO_STORAGE_KEY = "viewvideo";
	private AlbumStorageDirFactory mAlbumStorageDirFactory = null;
	private static final String IMAGEVIEW_VISIBILITY_STORAGE_KEY = "imageviewvisibility";
	private static final String VIDEOVIEW_VISIBILITY_STORAGE_KEY = "videoviewvisibility";
	ImageView mImageView;
	static final int REQUEST_IMAGE_CAPTURE = 1;
	
	private void dispatchTakePictureIntent() {
	    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	    if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
	        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
	    }
	}
	
	private void inicializa_endpoints(){
		/*
		 * inicializamos los endpoints
		 */
		Usuarioendpoint.Builder usuariobuilder = new Usuarioendpoint.Builder(
				AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
				new HttpRequestInitializer() {

					@Override
					public void initialize(HttpRequest arg0) {
						// TODO Auto-generated method stub
					}
				});
				usuarioEndpoint = CloudEndpointUtils.updateBuilder(usuariobuilder).build();
		
		/*
		 * 
		 * inicializacion endpoint detenido
		 */
				
		Detenidoendpoint.Builder detenidobuilder = new Detenidoendpoint.Builder(
				AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
				new HttpRequestInitializer() {

					@Override
					public void initialize(HttpRequest arg0) {
						// TODO Auto-generated method stub
					}
		      	});
				detenidoEndpoint = CloudEndpointUtils.updateBuilder(detenidobuilder).build();
		
	}
	
	
	private void setPic() {

		/* There isn't enough memory to open up more than a couple camera photos */
		/* So pre-scale the target bitmap into which the file is decoded */

		/* Get the size of the ImageView */
		int targetW = mImageView.getWidth();
		int targetH = mImageView.getHeight();

		/* Get the size of the image */
		BitmapFactory.Options bmOptions = new BitmapFactory.Options();
		bmOptions.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(mCurrentPhotoPath, bmOptions);
		int photoW = bmOptions.outWidth;
		int photoH = bmOptions.outHeight;
		
		/* Figure out which way needs to be reduced less */
		int scaleFactor = 1;
		if ((targetW > 0) || (targetH > 0)) {
			scaleFactor = Math.min(photoW/targetW, photoH/targetH);	
		}

		/* Set bitmap options to scale the image decode target */
		bmOptions.inJustDecodeBounds = false;
		bmOptions.inSampleSize = scaleFactor;
		bmOptions.inPurgeable = true;

		/* Decode the JPEG file into a Bitmap */
		Bitmap bitmap = BitmapFactory.decodeFile(mCurrentPhotoPath, bmOptions);
		imagenphoto = bitmap;
		path = mCurrentPhotoPath;
		
		/* Associate the Bitmap to the ImageView */
		
		mImageView.setImageBitmap(bitmap);
		mVideoUri = null;
		mImageView.setVisibility(View.VISIBLE);
		//mVideoView.setVisibility(View.INVISIBLE);
	}
	private void handleBigCameraPhoto() {

		if (mCurrentPhotoPath != null) {
			setPic();
			galleryAddPic();
			mCurrentPhotoPath = null;
		}

	}
	private void galleryAddPic() {
	    Intent mediaScanIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
		File f = new File(mCurrentPhotoPath);
	    Uri contentUri = Uri.fromFile(f);
	    mediaScanIntent.setData(contentUri);
	    this.sendBroadcast(mediaScanIntent);
}
	private void handleSmallCameraPhoto(Intent intent) {
		Bundle extras = intent.getExtras();
		mImageBitmap = (Bitmap) extras.get("data");
		mImageView.setImageBitmap(mImageBitmap);
		mVideoUri = null;
		mImageView.setVisibility(View.VISIBLE);
		//mVideoView.setVisibility(View.INVISIBLE);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case ACTION_TAKE_PHOTO_B: {
			if (resultCode == RESULT_OK) {
				handleBigCameraPhoto();
			}
			break;
		} // ACTION_TAKE_PHOTO_B

		case ACTION_TAKE_PHOTO_S: {
			if (resultCode == RESULT_OK) {
				handleSmallCameraPhoto(data);
			}
			break;
		} // ACTION_TAKE_PHOTO_S

//		case ACTION_TAKE_VIDEO: {
//			if (resultCode == RESULT_OK) {
//				handleCameraVideo(data);
//			}
//			break;
//		} // ACTION_TAKE_VIDEO
		} // switch
	}

	// Some lifecycle callbacks so that the image can survive orientation change
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		outState.putParcelable(BITMAP_STORAGE_KEY, mImageBitmap);
		outState.putParcelable(VIDEO_STORAGE_KEY, mVideoUri);
		outState.putBoolean(IMAGEVIEW_VISIBILITY_STORAGE_KEY, (mImageBitmap != null) );
		outState.putBoolean(VIDEOVIEW_VISIBILITY_STORAGE_KEY, (mVideoUri != null) );
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		mImageBitmap = savedInstanceState.getParcelable(BITMAP_STORAGE_KEY);
		mVideoUri = savedInstanceState.getParcelable(VIDEO_STORAGE_KEY);
		mImageView.setImageBitmap(mImageBitmap);
		mImageView.setVisibility(
				savedInstanceState.getBoolean(IMAGEVIEW_VISIBILITY_STORAGE_KEY) ? 
						ImageView.VISIBLE : ImageView.INVISIBLE
		);
		mVideoView.setVideoURI(mVideoUri);
		mVideoView.setVisibility(
				savedInstanceState.getBoolean(VIDEOVIEW_VISIBILITY_STORAGE_KEY) ? 
						ImageView.VISIBLE : ImageView.INVISIBLE
		);
	}
	Button.OnClickListener mTakePicOnClickListener = 
			new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				dispatchTakePictureIntent(ACTION_TAKE_PHOTO_B);
			}
		};
		private File getAlbumDir() {
			File storageDir = null;

			if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
				String name = getAlbumName();
				
				storageDir = mAlbumStorageDirFactory.getAlbumStorageDir(name);

				if (storageDir != null) {
					if (! storageDir.mkdirs()) {
						if (! storageDir.exists()){
							Log.d("CameraSample", "failed to create directory");
							return null;
						}
					}
				}
				
			} else {
				Log.v(getString(R.string.app_name), "External storage is not mounted READ/WRITE.");
			}
			
			return storageDir;
		}
		private File createImageFile() throws IOException {
			// Create an image file name
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			//String imageFileName = JPEG_FILE_PREFIX + timeStamp;
			String imageFileName = "vfdc";
			File albumF = getAlbumDir();
			File imageF = File.createTempFile(imageFileName, JPEG_FILE_SUFFIX, albumF);
			return imageF;
		}
		private File setUpPhotoFile() throws IOException {
			
			File f = createImageFile();
			mCurrentPhotoPath = f.getAbsolutePath();
			
			return f;
		}
		private String getAlbumName() {
			return "vfd";
		}
		private void dispatchTakePictureIntent(int actionCode) {

			Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

			switch(actionCode) {
			case ACTION_TAKE_PHOTO_B:
				File f = null;
				
				try {
					f = setUpPhotoFile();
					mCurrentPhotoPath = f.getAbsolutePath();
					takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
				} catch (IOException e) {
					e.printStackTrace();
					f = null;
					mCurrentPhotoPath = null;
				}
				break;

			default:
				break;			
			} // switch

			startActivityForResult(takePictureIntent, actionCode);
		}
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setTitle("Informacion Detenido");
			inicializa_endpoints();
			Bundle bundle = getIntent().getExtras();
			String Detenido = bundle.getString("idDetenido");
			Log.i("id de la tarea", Detenido);
			setContentView(R.layout.infouser);
			Preferences = getApplicationContext().getSharedPreferences("settings", 0);
			detenido = Preferences.getLong("idAgente", 0l);
			Log.i("el id del usuario en el mapa es: ", detenido.toString());
			contenedor = (LinearLayout)findViewById(R.id.contenedorInfo);
			nombre = (EditText)findViewById(R.id.nombre);
			app = (EditText)findViewById(R.id.app);
			apm = (EditText)findViewById(R.id.apm);
			delito = (EditText)findViewById(R.id.delito);
			mImageView = (ImageView)findViewById(R.id.foto);
			Button picBtn = (Button) findViewById(R.id.boton);
			setBtnListenerOrDisable( 
					picBtn, 
					mTakePicOnClickListener,
					MediaStore.ACTION_IMAGE_CAPTURE
					);
			Button enviar = new Button(getApplicationContext());
			enviar.setText("enviar informacion");
			enviar.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "listo para enviar informacion", Toast.LENGTH_LONG).show();
					new EnviarInformacion().execute();

				}
			});
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
				mAlbumStorageDirFactory = new FroyoAlbumDirFactory();
			} else {
				mAlbumStorageDirFactory = new BaseAlbumDirFactory();
			}
			contenedor.addView(enviar);





		}
	public static boolean isIntentAvailable(Context context, String action) {
		final PackageManager packageManager = context.getPackageManager();
		final Intent intent = new Intent(action);
		List<ResolveInfo> list =
			packageManager.queryIntentActivities(intent,
					PackageManager.MATCH_DEFAULT_ONLY);
		return list.size() > 0;
	}
	private void setBtnListenerOrDisable( 
			Button btn, 
			Button.OnClickListener onClickListener,
			String intentName
	) {
		if (isIntentAvailable(this, intentName)) {
			btn.setOnClickListener(onClickListener);        	
		} else {
			btn.setText( 
				 "can not " + btn.getText());
			btn.setClickable(false);
		}
	}
	public class EnviarInformacion extends AsyncTask<Void, Void, Void> {

		
		private EnviarInformacion() {
	      
	    }
		@Override
		protected Void doInBackground(Void... params) {
			Long idUsuario = 0l;
			Long idDetenido = 0l;
			
			//Obtencion de el ultimo usuario registrado
			try {
				CollectionResponseUsuario lastUser = usuarioEndpoint.getLast().execute();
				if(lastUser != null && lastUser.getItems().size() > 0 ){
					idUsuario =  lastUser.getItems().get(0).getId();
				}
				
				Usuario user = new Usuario();
				user.setApm("app materno");
				user.setApp("appelido paterno");
				user.setEdad(35l);
				user.setId(idUsuario+1);
				user.setName("nombre");
				user.setSexo("masculino");
				usuarioEndpoint.insertUsuario(user).execute();
				
				
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			


			
			Utl_HttpClient resposeGson = new Utl_HttpClient();
			String urlBlobStore = resposeGson.getUrlBlobStore("http://1-dot-civic-athlete-851.appspot.com/blob/androidserveurl");
			Utl_Imagen.procesarImagen(path);
			Log.i("la url para insertar es: +",urlBlobStore);
			if(urlBlobStore != null){
				try {
				//	int formato = Utl_Imagen.getFormatoInt(imagen.getFormato());
					String blobkey =  resposeGson.setMultimedia(urlBlobStore, path,
							new String(),new String(), 
							new String(), new String(), 
							new String(), new String());

					Detenido detenidoInf = new Detenido();
					detenidoInf.setCargo("pasarse un alto");
					detenidoInf.setDelito("delito 2");
					try {
						CollectionResponseDetenido lastDetenido =  detenidoEndpoint.getLast().execute();
						if (lastDetenido!=null && lastDetenido.getItems().size() > 0) {
							idDetenido = lastDetenido.getItems().get(0).getId();
						}
						detenidoInf.setId(idDetenido+1);
						detenidoInf.setEvidencia(blobkey);
						detenidoInf.setIdUsuario(idUsuario);
						detenidoEndpoint.insertDetenido(detenidoInf).execute();
						Log.i("insercion del detenido", "detenido insertado correctamente");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						Log.i("BlobStore","null");
			
					// Actualizar BD
				} catch (UnsupportedEncodingException e) {
				
				}
			}
		

		

			return null;
		}
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			
			
				
			
			
			super.onPostExecute(result);
		}

	}


}
