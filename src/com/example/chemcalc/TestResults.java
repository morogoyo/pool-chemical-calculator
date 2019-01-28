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

public class TestResults extends ActionBarActivity {

	Double chlo;
	Double ph;
	Double alk;
	Double ca;
	Double ch;

	EditText chloED;
	EditText phED;
	EditText alkED;
	EditText caED;
	EditText chED;
	EditText galED;

	Button btr;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_results);

		galED = (EditText)findViewById(R.id.galED);
		chloED = (EditText) findViewById(R.id.chloED);
		phED = (EditText) findViewById(R.id.phED);
		alkED = (EditText) findViewById(R.id.alkED);
		caED = (EditText) findViewById(R.id.caED);
		chED = (EditText) findViewById(R.id.chED);
		
		
		

		
			
		 
		

		btr = (Button) findViewById(R.id.btr1);
		btr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			  Intent test = new Intent (TestResults.this ,BreakPoint.class);
			 chlo = Double.parseDouble( chloED.getText().toString());
			  test.putExtra("chlorine", chlo);
			  startActivity(test);
			  
				
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
		getMenuInflater().inflate(R.menu.test_results, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_test_results,
					container, false);
			return rootView;
		}
	}

	
	
}
