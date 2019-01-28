package com.example.chemcalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	
	Button flowButton1;
    Button chlorineButton2;
    Button breakPointbutton1;
		
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menue);
		
		
		
		
		
		flowButton1=(Button)findViewById(R.id.flowButton1);
		flowButton1.setOnClickListener(this);
		
		chlorineButton2=(Button)findViewById(R.id.chlorinebutton2);
		chlorineButton2.setOnClickListener(this);
		
		breakPointbutton1=(Button)findViewById(R.id.breakPointbutton1);
		breakPointbutton1.setOnClickListener(this);
	
		
		
		
		
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menue, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_main_menue,
					container, false);
			return rootView;
		}
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		
		case R.id.flowButton1:
			
			Intent flow = new Intent(MainActivity.this,FlowActivity.class);
			startActivity(flow);
			
			break;
			
			
		case R.id.chlorinebutton2:
			
			Intent chlorine= new Intent (MainActivity.this,Chlorine.class);
			startActivity(chlorine);
			
			
			
       case R.id.breakPointbutton1:
			
			Intent Bp= new Intent (MainActivity.this,BreakPoint.class);
			startActivity(Bp);
			
			
			default:
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
