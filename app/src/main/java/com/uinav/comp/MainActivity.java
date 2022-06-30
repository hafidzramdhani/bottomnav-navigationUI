package com.uinav.comp;

import android.view.Menu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		
		Toolbar toolbar = findViewById(R.id.toolbar);
		toolbar.setTitleTextColor(getResources().getColor(R.color.black));
		setSupportActionBar(toolbar);
		BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
	
		//
		AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
		R.id.nav_home,R.id.nav_katalog,R.id.nav_chat,R.id.nav_promosi,R.id.nav_aplikasi).build();
		
		NavController navControl = Navigation.findNavController(this, R.id.navHost);
		NavigationUI.setupActionBarWithNavController(this, navControl,appBarConfiguration);
		NavigationUI.setupWithNavController(bottomNav,navControl);
		
		navControl.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener(){
			@Override
			public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments){
				int id = destination.getId();
				
				switch (id){
					case R.id.nav_home:
					toolbar.setTitle("BukaToko");
					
				}
			}
		});
		
    }
			
			// penutup onCreate
}