package com.demomapas.adapters;



import com.demomapas.Constants;
import com.demomapas.pjgviewpager.Frag_Listados;
import com.google.android.gms.maps.SupportMapFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adp_StatePager_PagerMandamientos extends FragmentStatePagerAdapter {

	final int PAGE_COUNT = 6;
	int Tipo;
	int Padre;
	Context Contexto;

	/** Constructor of the class */
	public Adp_StatePager_PagerMandamientos(FragmentManager fm, Context contexto) {

		super(fm);
		this.Contexto = contexto;
//		this.Tipo = tipo;
//		this.Padre = padre;
	}

	/** This method will be invoked when a page is requested to create */
	@Override
	public Fragment getItem(int position) {
		Bundle bundle = new Bundle();
		Fragment retorna = null;
		switch (position) {
		case 0:
			//Frag_Listados lista = new Frag_Listados();
	Frag_Listados lista = new Frag_Listados();
			bundle.putInt("Tipo", Constants.OrdenesAprehension);
			lista.setArguments(bundle);
			retorna = lista;
			
			break;
		case 1:
			//retorna =  SupportMapFragment.newInstance();
			Frag_Listados lista1 = new Frag_Listados();
			bundle.putInt("Tipo", Constants.OrdenesReaprehension);
			lista1.setArguments(bundle);
			retorna = lista1;
			break;
		case 2:
			Frag_Listados lista3 = new Frag_Listados();
			bundle.putInt("Tipo", Constants.OrdenesPresentacion);
			lista3.setArguments(bundle);
			retorna = lista3;
			break;
		case 3:
			Frag_Listados lista4 = new Frag_Listados();
			bundle.putInt("Tipo", Constants.OrdenesComparecencia);

			lista4.setArguments(bundle);
			retorna = lista4;
			break;
		case 4:
			Frag_Listados lista5 = new Frag_Listados();
			bundle.putInt("Tipo", Constants.OficiosColaboracion);

			lista5.setArguments(bundle);
			retorna = lista5;
			break;
		case 5:
			Frag_Listados lista6 = new Frag_Listados();
			bundle.putInt("Tipo", Constants.Traslados);
			lista6.setArguments(bundle);
			retorna = lista6;
			break;
		default:
			break;
		}

		return retorna;

	}

	/** Returns the number of pages */
	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		CharSequence Titulo = null;
		switch (position) {
		case 0:
		Titulo="Ordenes de Aprehensión";

			break;
		case 1:
			Titulo = "Ordenes de Reaprehensión";
			break;
		case 2:
			Titulo = "Ordenes de Presentación";
			break;
		case 3:
			Titulo = "Ordenes de Comparecencía";
			break;
		case 4:
			Titulo = "Oficios de Colaboración";
			break;
		case 5:
			Titulo = "Traslados";
			break;
		}
		return Titulo;
	}

}
