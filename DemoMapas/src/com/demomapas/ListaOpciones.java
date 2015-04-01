package com.demomapas;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ListaOpciones extends Activity implements android.view.View.OnClickListener {

	RelativeLayout principal;
	LinearLayout lista;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_opciones);
		setTitle("Policía de Investigación");
		//inicializamos los layouts
		principal =  (RelativeLayout) findViewById(R.id.RelativeListaOpciones);
		lista =  (LinearLayout) findViewById(R.id.ListaElementos);
		LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
	    llp.setMargins(0, 30, 0, 0);
		
		
		
		TextView MandamientosJudiaciales = new TextView(getApplicationContext());
		MandamientosJudiaciales.setText("Mandamientos Judiciales");
		MandamientosJudiaciales.setTextSize(25);
		MandamientosJudiaciales.setGravity(Gravity.CENTER);
		MandamientosJudiaciales.setOnClickListener(this);
		MandamientosJudiaciales.setId(Constants.MandamientosJudiciales);
		
		TextView Documentos = new TextView(getApplicationContext());
		Documentos.setLayoutParams(llp);
		Documentos.setText("Documentos");
		Documentos.setTextSize(25);
		Documentos.setGravity(Gravity.CENTER);
		Documentos.setOnClickListener(this);
		Documentos.setId(Constants.Documentos);
		
		
		
		TextView Emergencias = new TextView(getApplicationContext());
		Emergencias.setText("Emergencias");
		Emergencias.setLayoutParams(llp);
		Emergencias.setTextSize(25);
		Emergencias.setGravity(Gravity.CENTER);
		Emergencias.setOnClickListener(this);
		Emergencias.setId(Constants.Emergencias);
		
		
		TextView TransmitirBitacora = new TextView(getApplicationContext());
		TransmitirBitacora.setText(" Transmitir Bitacora");
		TransmitirBitacora.setLayoutParams(llp);
		TransmitirBitacora.setTextSize(25);
		TransmitirBitacora.setGravity(Gravity.CENTER);
		TransmitirBitacora.setOnClickListener(this);
		TransmitirBitacora.setId(Constants.TransmitirBitacora);
		
		lista.addView(MandamientosJudiaciales);
		lista.addView(Documentos);
		lista.addView(Emergencias);
		lista.addView(TransmitirBitacora);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_opciones, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case Constants.MandamientosJudiciales:
			Log.i("Mandamientos Judiciales", "Mandamientos Judiaciales");
			startActivity(new Intent(ListaOpciones.this,MandamientosJudicialesList.class));
			break;
		case Constants.Documentos:
			Log.i("Documentos", "Documentos");
			break;
		case Constants.Emergencias:
			Log.i("Emergencia", "Emergencia");
			break;
		case Constants.TransmitirBitacora:
			Log.i("Transmitir Bitacora", "Transmitir Bitacora");
			break;

		default:
			break;
		}
		
		
	}




}
