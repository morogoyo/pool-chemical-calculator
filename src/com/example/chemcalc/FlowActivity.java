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
import android.widget.EditText;
import android.widget.Toast;


public  class FlowActivity   extends ActionBarActivity implements OnClickListener{

	
	EditText gallonsET;
	EditText flowET;
	Double flow = 360.00;
	Button calculateB , resetb ;
     Double gal ;
	Double reqFlow;
	Button chlorineB;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flow_main);
		
		//call the edit box
		
		gallonsET = (EditText)findViewById(R.id.gallonsET);
		flowET=(EditText)findViewById(R.id.flowET);
		calculateB=(Button)findViewById(R.id.calcualateB);
		resetb = (Button)findViewById(R.id.resetb);
		chlorineB=(Button)findViewById(R.id.chlorineB);
		
		calculateB.setOnClickListener(this);
		resetb.setOnClickListener(this);
		
		chlorineB.setOnClickListener(this);
		
		
		
		
			
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
			View rootView = inflater.inflate(R.layout.flow_main, container,
					false);
			return rootView;
		}
	}

	@Override
	public void onClick(View v) {
		 
		
		switch (v.getId()) {
		
		case R.id.calcualateB:
		
		try {
				gal = Double.parseDouble(gallonsET.getText().toString());

reqFlow = gal / flow;

 reqFlow = (double) Math.round(reqFlow);
flowET.setText(reqFlow+" GPM");
			} catch (NumberFormatException e) {
				Toast.makeText(getApplicationContext(), "yo te quiero mucho",Toast.LENGTH_LONG).show();
				e.printStackTrace();
			}
		
		break;
		
		case R.id.chlorineB:
			   Intent intent = new Intent (FlowActivity.this,Chlorine.class);
			   startActivity(intent);
			   
			   break;
			
			
			default:
			  gallonsET.setText("");
			   flowET.setText("");
			   break;
	         
			
			
		
	}
	}


}


	



