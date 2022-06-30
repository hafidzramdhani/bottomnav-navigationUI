package com.uinav.comp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
	View view = inflater.inflate(R.layout.fragment_home, container, false);
	setHasOptionsMenu(true);
	return view;
	
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu,MenuInflater inflater){
	inflater.inflate(R.menu.notifications_bar,menu);
	super.onCreateOptionsMenu(menu,inflater);
	}
	//
}