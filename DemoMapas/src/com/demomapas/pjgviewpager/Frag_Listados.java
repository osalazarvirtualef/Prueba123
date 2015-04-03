package com.demomapas.pjgviewpager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.ls.LSInput;









import com.demomapas.Pagina1;
import com.demomapas.R;
import com.demomapas.adapters.Adp_Base_ListaReferencia;
import com.virtualef.pgj.service.commandmentService.CommandmentService;
import com.virtualef.pgj.service.commandmentService.model.CollectionResponseCommandmentDto;
import com.virtualef.pgj.service.commandmentService.model.CommandmentDto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class Frag_Listados extends Fragment {
	private int Tipo;
	private static ListView lista;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
 		Bundle args = getArguments();
	//	this.Padre = args.getInt("Padre");
		this.Tipo = args.getInt("Tipo");
	//	this.Estatus = args.getInt("Estatus");
		ViewGroup root = (ViewGroup) inflater.inflate(
		R.layout.lyt_listados_referencias, null);
		
	
	
	
	return root;
	}
	@Override
	public void setRetainInstance(boolean retain) {
		// TODO Auto-generated method stub
		super.setRetainInstance(false);
	}
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	
		lista = (ListView) getView().findViewById(R.id.lstv_listadosItems);
		CollectionResponseCommandmentDto MandamientosJudiciales = MainActivityPager.Mandamientos;
		for (CommandmentDto  elemento : MandamientosJudiciales.getItems()) {
			
		//	if(elemento.get)
			System.out.println();
		}
		
		Referencia referencia = new Referencia();
		referencia.setIdEstatus(1);
		referencia.setNombre("Referencia");
		referencia.setNoReferencia(4564564);
		Referencia referencia1 = new Referencia();
		referencia1.setIdEstatus(1);
		referencia1.setNombre("Referencia");
		referencia1.setNoReferencia(4564564);
		Referencia referencia2 = new Referencia();
		referencia2.setIdEstatus(3);
		referencia2.setNombre("Referencia");
		referencia2.setNoReferencia(4564564);
		Referencia referencia3 = new Referencia();
		referencia3.setIdEstatus(2);
		referencia3.setNombre("Referencia");
		referencia3.setNoReferencia(4564564);
		Referencia referencia4 = new Referencia();
		referencia4.setIdEstatus(2);
		referencia4.setNombre("Referencia");
		referencia4.setNoReferencia(4564564);
		Referencia referencia5 = new Referencia();
		referencia5.setIdEstatus(2);
		referencia5.setNombre("Referencia");
		referencia5.setNoReferencia(4564564);
		Referencia referencia6 = new Referencia();
		referencia6.setIdEstatus(3);
		referencia6.setNombre("Referencia");
		referencia6.setNoReferencia(4564564);
		Referencia referencia7 = new Referencia();
		referencia7.setIdEstatus(1);
		referencia7.setNombre("Referencia");
		referencia7.setNoReferencia(4564564);
		Referencia referencia8 = new Referencia();
		referencia8.setIdEstatus(1);
		referencia8.setNombre("Referencia");
		referencia8.setNoReferencia(4564564);
		Referencia referencia9 = new Referencia();
		referencia9.setIdEstatus(3);
		referencia9.setNombre("Referencia");
		referencia9.setNoReferencia(4564564);
		Referencia referencia10 = new Referencia();
		referencia10.setIdEstatus(2);
		referencia10.setNombre("Referencia");
		referencia10.setNoReferencia(4564564);
		Referencia referencia11 = new Referencia();
		referencia11.setIdEstatus(2);
		referencia11.setNombre("Referencia");
		referencia11.setNoReferencia(4564564);
		Referencia referencia12 = new Referencia();
		referencia12.setIdEstatus(2);
		referencia12.setNombre("Referencia");
		referencia12.setNoReferencia(4564564);
		Referencia referencia13 = new Referencia();
		referencia13.setIdEstatus(3);
		referencia13.setNombre("Referencia");
		referencia13.setNoReferencia(4564564);
		List<Referencia> listaReferencia = new ArrayList<Referencia>();
		listaReferencia.add(referencia);
		listaReferencia.add(referencia1);
		listaReferencia.add(referencia2);
		listaReferencia.add(referencia3);
		listaReferencia.add(referencia4);
		listaReferencia.add(referencia5);
		listaReferencia.add(referencia6);
		listaReferencia.add(referencia7);
		listaReferencia.add(referencia8);
		listaReferencia.add(referencia9);
		listaReferencia.add(referencia10);
		listaReferencia.add(referencia11);
		listaReferencia.add(referencia12);
		listaReferencia.add(referencia13);
		List<Referencia> listaFiltrada = new ArrayList<Referencia>();

//		if (Estatus != 0) {
//			for (int i = 0; i < listaReferencia.size(); i++) {
//				Referencia referenciaFiltrada = listaReferencia.get(i);
//
//				if (referenciaFiltrada.getIdEstatus() == Estatus)
//					listaFiltrada.add(referenciaFiltrada);
//			}
//		} else {
//			listaFiltrada = listaReferencia;
//		}
		Adp_Base_ListaReferencia adapter = new Adp_Base_ListaReferencia(
				listaFiltrada, getActivity().getBaseContext());
		lista.setAdapter(adapter);
		adapter.notifyDataSetChanged();

		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				// String item = arg0.getItemAtPosition(arg2).toString();
				// Toast.makeText(getActivity().getBaseContext(),"You selected : "
				// + item,Toast.LENGTH_SHORT).show();
				switch (arg2) {

				default:
					FragmentTransaction tx = getFragmentManager()
							.beginTransaction();
					tx.setCustomAnimations(R.animator.enter, R.animator.exit,
							R.animator.pop_enter, R.animator.pop_exit);
				//	Frag_Factura remplazo = new Frag_Factura();
					Pagina1 remplazo = new Pagina1();
//					if(Act_Main.current!=null)
//						tx.remove(Act_Main.current);
//					Act_Main.current=remplazo;
					tx.replace(R.id.frm_lyt_mainMenu,MainActivityPager.fragmentos.push(remplazo));
					MainActivityPager.elementos.push("remplazo");
			
					//Act_Main.elementos.push("getFragmentManager");
					tx.commit();
				
					break;
				}

			}
		});
		onStop();
	}
//@Override
//public void onStop() {
//	// TODO Auto-generated method stub
//	super.onStop();
//}
//
//@Override
//public void onPause() {
//	// TODO Auto-generated method stub
//	super.onPause();
//onDestroy();	
//	Log.i("estoy ern onpause de frag listados","onpause");
//}
//@Override
//public void onDestroy() {
//	// TODO Auto-generated method stub
//	Log.i("entre al ondestroy", "entre al ondestroy");
//	super.onDestroy();
//}
//	@Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onActivityCreated(savedInstanceState);
////		lista = (ListView) getView().findViewById(R.id.lstv_listadosItems);
////		Referencia referencia = new Referencia();
////		referencia.setIdEstatus(1);
////		referencia.setNombre("Referencia");
////		referencia.setNoReferencia(4564564);
////		Referencia referencia1 = new Referencia();
////		referencia1.setIdEstatus(1);
////		referencia1.setNombre("Referencia");
////		referencia1.setNoReferencia(4564564);
////		Referencia referencia2 = new Referencia();
////		referencia2.setIdEstatus(3);
////		referencia2.setNombre("Referencia");
////		referencia2.setNoReferencia(4564564);
////		Referencia referencia3 = new Referencia();
////		referencia3.setIdEstatus(2);
////		referencia3.setNombre("Referencia");
////		referencia3.setNoReferencia(4564564);
////		Referencia referencia4 = new Referencia();
////		referencia4.setIdEstatus(2);
////		referencia4.setNombre("Referencia");
////		referencia4.setNoReferencia(4564564);
////		Referencia referencia5 = new Referencia();
////		referencia5.setIdEstatus(2);
////		referencia5.setNombre("Referencia");
////		referencia5.setNoReferencia(4564564);
////		Referencia referencia6 = new Referencia();
////		referencia6.setIdEstatus(3);
////		referencia6.setNombre("Referencia");
////		referencia6.setNoReferencia(4564564);
////		Referencia referencia7 = new Referencia();
////		referencia7.setIdEstatus(1);
////		referencia7.setNombre("Referencia");
////		referencia7.setNoReferencia(4564564);
////		Referencia referencia8 = new Referencia();
////		referencia8.setIdEstatus(1);
////		referencia8.setNombre("Referencia");
////		referencia8.setNoReferencia(4564564);
////		Referencia referencia9 = new Referencia();
////		referencia9.setIdEstatus(3);
////		referencia9.setNombre("Referencia");
////		referencia9.setNoReferencia(4564564);
////		Referencia referencia10 = new Referencia();
////		referencia10.setIdEstatus(2);
////		referencia10.setNombre("Referencia");
////		referencia10.setNoReferencia(4564564);
////		Referencia referencia11 = new Referencia();
////		referencia11.setIdEstatus(2);
////		referencia11.setNombre("Referencia");
////		referencia11.setNoReferencia(4564564);
////		Referencia referencia12 = new Referencia();
////		referencia12.setIdEstatus(2);
////		referencia12.setNombre("Referencia");
////		referencia12.setNoReferencia(4564564);
////		Referencia referencia13 = new Referencia();
////		referencia13.setIdEstatus(3);
////		referencia13.setNombre("Referencia");
////		referencia13.setNoReferencia(4564564);
////		List<Referencia> listaReferencia = new ArrayList<Referencia>();
////		listaReferencia.add(referencia);
////		listaReferencia.add(referencia1);
////		listaReferencia.add(referencia2);
////		listaReferencia.add(referencia3);
////		listaReferencia.add(referencia4);
////		listaReferencia.add(referencia5);
////		listaReferencia.add(referencia6);
////		listaReferencia.add(referencia7);
////		listaReferencia.add(referencia8);
////		listaReferencia.add(referencia9);
////		listaReferencia.add(referencia10);
////		listaReferencia.add(referencia11);
////		listaReferencia.add(referencia12);
////		listaReferencia.add(referencia13);
////		List<Referencia> listaFiltrada = new ArrayList<Referencia>();
////
////		if (Estatus != 0) {
////			for (int i = 0; i < listaReferencia.size(); i++) {
////				Referencia referenciaFiltrada = listaReferencia.get(i);
////
////				if (referenciaFiltrada.getIdEstatus() == Estatus)
////					listaFiltrada.add(referenciaFiltrada);
////			}
////		} else {
////			listaFiltrada = listaReferencia;
////		}
////		Adp_Base_ListaReferencia adapter = new Adp_Base_ListaReferencia(
////				listaFiltrada, getActivity().getBaseContext());
////		lista.setAdapter(adapter);
////
////		lista.setOnItemClickListener(new OnItemClickListener() {
////
////			@Override
////			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
////					long arg3) {
////				// TODO Auto-generated method stub
////				// String item = arg0.getItemAtPosition(arg2).toString();
////				// Toast.makeText(getActivity().getBaseContext(),"You selected : "
////				// + item,Toast.LENGTH_SHORT).show();
////				switch (arg2) {
////
////				default:
////					FragmentTransaction tx = getFragmentManager()
////							.beginTransaction();
////					tx.setCustomAnimations(R.animator.enter, R.animator.exit,
////							R.animator.pop_enter, R.animator.pop_exit);
////					Frag_Factura remplazo = new Frag_Factura();
////					tx.replace(R.id.frm_lyt_mainMenu, remplazo,"caso14").addToBackStack("caso14");
////					tx.commit();
////					break;
////				}
////
////			}
////		});
//
//	}
//
}
