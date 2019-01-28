package com.example.chemcalc;

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
import android.widget.EditText;

public class BreakPoint extends ActionBarActivity implements OnClickListener {

	
	EditText freeChlorineED;
	EditText totalChlorineED;
	EditText combinedChlorineED;
	Button calculate;
	Button resetbp;
	TestResults tr;
	Double totalChlorine= 0.0;
	Double freeChlorine =0.0;
	Double cc =0.0;
	Double chlorineTest;
	Double bp;
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_break_point_chlorination);
		
		//passin vaiables from first activity
		
		Bundle extra = getIntent().getExtras();
		chlorineTest =extra.getDouble("chlorine");
		
		
		tr = new TestResults();
		
		
		
		freeChlorineED =(EditText)findViewById(R.id.freeChlorineED);
		totalChlorineED=(EditText)findViewById(R.id.totalChlorineED);
		combinedChlorineED=(EditText)findViewById(R.id.combinedChlorineED);
		calculate=(Button)findViewById(R.id.calculate);
		calculate.setOnClickListener(this);
		
		
		totalChlorineED.setText(chlorineTest+"");
		
		 

resetbp=(Button)findViewById(R.id.resetbp);
		resetbp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				freeChlorineED.setText("");
				totalChlorineED.setText("");
				combinedChlorineED.setText("");
				
			}
		});
		
		
		
	
		
		
		

		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.break_point_chlorination, menu);
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
			View rootView = inflater.inflate(
					R.layout.fragment_break_point_chlorination, container,
					false);
			return rootView;
		}
	}

	@Override
	public void onClick(View v) {
		
		if (chlorineTest != null){
			
			
			totalChlorineED.setText(chlorineTest+"");
			
		}
		
		else{
		
	       totalChlorine = Double.parseDouble( totalChlorineED.getText().toString());
	       freeChlorine =  Double.parseDouble(freeChlorineED.getText().toString());
		   
		}
		
		
		cc= totalChlorine - freeChlorine;
		
		 bp = (cc * 10)- freeChlorine;
		
		combinedChlorineED.setText(bp +" ppm");
		
		
		
	


	}
	
	
}
