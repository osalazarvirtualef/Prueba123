package com.demomapas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.app.Fragment;;

public class Pagina1 extends Fragment{
	
	LinearLayout ListaOrdenesAprehension;
	TextView elementos1;
	TextView elementos2;
	 ViewGroup rootView ;
	

	  @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	         rootView = (ViewGroup) inflater.inflate(
	                R.layout.activity_pagina2, container, false);
	        ListaOrdenesAprehension = (LinearLayout) rootView.findViewById(R.id.ListaOrdenesAprehension);
	        elementos1 =  new TextView(getActivity());
	        elementos1.setText("hola");
	        ListaOrdenesAprehension.addView(elementos1);
	        

	        return rootView;
	    }

	  	@Override
	  	public void onActivityCreated(Bundle savedInstanceState) {
	  		// TODO Auto-generated method stub
	  		super.onActivityCreated(savedInstanceState);
	  		elementos1.setText("cabiado en el created");
	  	}
	
}
