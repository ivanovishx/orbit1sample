package com.example.robbieapp;
/*
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;
*/

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import android.os.Build;
import android.provider.MediaStore;



public class MainActivity extends ActionBarActivity {
/*Declaracion de objetos botones*/
	ImageButton eduBoton; 
	ImageButton lampBoton; 
	ImageButton musicBoton; 
	ImageButton robieeBoton; 
	ImageButton papasBoton; 
	Button hola;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
/*
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
*/	
	
		/*the game starts here...*/
		
		// flash switch button
		//papasBoton = (ImageButton) findViewById(R.id.papasBoton);
		
		 eduBoton = (ImageButton) findViewById(R.id.eduBoton);
		 lampBoton = (ImageButton) findViewById(R.id.lampBoton);
		 musicBoton = (ImageButton) findViewById(R.id.musicBoton);
		 robieeBoton = (ImageButton) findViewById(R.id.robieeBoton);
		 papasBoton = (ImageButton) findViewById(R.id.papasBoton);
		
		 //Button botonLlamada = (Button) findViewById(R.id.botonSkype);
		// Button botonLlamada = (Button) findViewById(R.id.papasBoton);
		 
		// botonLlamada.setOnClickListener(new OnClickListener(){	
		 eduBoton.setOnClickListener(new OnClickListener(){	
	        	public void onClick(View v1) { 		  
	        		//Intent eduGame = new Intent("android.intent.action.VIEW");
	        		//eduGame.setData(Uri.parse("skype:" + /*"ivan.lozano_2"*/"isabel.miranda90" + "?call&video=true"));
	        		Intent eduGame = getPackageManager().getLaunchIntentForPackage("com.disney.wheresmywater2_goo");
	        		
	        		startActivity(eduGame);
	        }  });
		 
		 lampBoton.setOnClickListener(new OnClickListener(){	
	        	public void onClick(View v1) { 		  
	        		Intent face = new Intent(MainActivity.this, Lamp.class);
	        		startActivity(face);
	        }  });
		 
		 musicBoton.setOnClickListener(new OnClickListener(){	
	        	public void onClick(View v1) { 	
	        		Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
	        		startActivity(intent);

	        }     }     );
		 
		 robieeBoton.setOnClickListener(new OnClickListener(){	
	        	public void onClick(View v1) { 		  
	        		
	           		/*Intent intent = new Intent("com.example.robbieapp.Activity_CargarImagen");
	        		startActivity(intent);
	        		/*com.example.robbieapp.Activity_CargarImagen*/
	        		Intent face = new Intent(MainActivity.this, Activity_CargarImagen.class);
	        		startActivity(face);
	        }  });
		 
		 papasBoton.setOnClickListener(new OnClickListener(){	
	        	public void onClick(View v1) { 		  
	        		Intent skypeVideo = new Intent("android.intent.action.VIEW");
	        		skypeVideo.setData(Uri.parse("skype:" + /*"ivan.lozano_2isabel.miranda90"*/"USUARIO_DE_SKYPE_POR_LLAMAR" + "?call&video=true"));
	        		startActivity(skypeVideo);
	        }  });
		 /*...and finish here*/
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.activity_main, container,
					false);
			return rootView;
		}
	}

}
