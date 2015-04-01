package com.demomapas;

import com.google.android.gms.maps.SupportMapFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adp_ViewPager extends FragmentStatePagerAdapter{

	public Adp_ViewPager(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		
		switch (arg0) {
		case 0:
			return SupportMapFragment.newInstance();
		case 1:
			return new Pagina1();
		case 2:
			return SupportMapFragment.newInstance();
		default:
			break;
		}
		
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		CharSequence ch = null;
		switch (position) {
		case 0:
			ch = "pagina 1";
			break;
		case 1:
			ch = "pagina 2";
			break;
		case 2: 
			ch = "pagina 3";
			break;

		default:
			break;
			
		}
		return ch;
	}
}
