package com.example.chemcalc;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Chlorine extends ActionBarActivity implements OnClickListener {
	// declaration of components

	// initialize all the widgest

	ArrayList<String> chlorineArray;

	EditText gallonsChlorineED;
	EditText chlorineMeasurementET;
	EditText adjustementChlorine;
	Spinner chlorineSpinner;
	ArrayAdapter<String> chlorineAdapter;
	Button resetB;

	Double adjustment;
	Double gallon;
	Double cg;
	Double ga = 10000.00;
	public Double cglb;

	// Spinner items

	String chlorineGas = "Chlorine Gas";
	String calciumHypochlorite = "Calcium Hypochlorite 67%";
	String sodiumHypochlorite = "Sodium Hypochlorite 12%";
	String lithiumHypochlorite = "Lithium Hypochlorite";
	String dichlor = "Dichlor 62%";
	String dichlor5 = "Dichlor 56%";
	String trichlor = "Trichlor";

	// variable that stores the value of the spinner to be use in the switch
	// statement

	String chemical;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chlorine);
		// calling the components
		chlorineArray = new ArrayList<String>();
		gallonsChlorineED = (EditText) findViewById(R.id.gallonsChlorineED);
		chlorineMeasurementET = (EditText) findViewById(R.id.chlorineMeasurementET);
		adjustementChlorine = (EditText) findViewById(R.id.adjustementChlorine);
		chlorineSpinner = (Spinner) findViewById(R.id.chlorineSpiner);
		resetB = (Button) findViewById(R.id.resetB);
		resetB.setOnClickListener(this);

		//
		chlorineArray.add("");
		chlorineArray.add(chlorineGas);
		chlorineArray.add(calciumHypochlorite);
		chlorineArray.add(sodiumHypochlorite);
		chlorineArray.add(lithiumHypochlorite);
		chlorineArray.add(dichlor);
		chlorineArray.add(dichlor5);
		chlorineArray.add(trichlor);

		chlorineAdapter = new ArrayAdapter<String>(Chlorine.this,
				android.R.layout.simple_spinner_item, chlorineArray);

		chlorineSpinner.setAdapter(chlorineAdapter);

		chlorineSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent,
					android.view.View view, int i, long id) {
				// TODO Auto-generated method stub

				Toast.makeText(Chlorine.this,
						"You Selected :  " + chlorineArray.get(i),
						Toast.LENGTH_SHORT).show();

				// amount of chemical * (pool volume/10000)*(desiered chemical
				// change /1ppm)

				chemical = chlorineArray.get(i);

				switch (chemical) {

				case "Chlorine Gas":

					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 1.30 * (gallon / ga) * adjustment;
						 cglb = cg / 16;

						adjustementChlorine.setText( cg
								+ " oz " + cglb + " lb");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case "Calcium Hypochlorite 67%":
					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 2.0 * (gallon / ga) * adjustment;
						 cglb = cg / 16;

						adjustementChlorine.setText(cg
								+ " oz or " + cglb + " lb");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case "Sodium Hypochlorite 12%":
					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 10.7 * (gallon / ga) * adjustment;
						 cglb = cg / 128;

						adjustementChlorine.setText( cg
								+ " floz " + cglb + " lb");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case "Lithium Hypochlorite":
					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 3.8 * (gallon / ga) * adjustment;
						 cglb = cg / 16;

						adjustementChlorine.setText( cg
								+ " oz " + cglb + " lb");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case "Dichlor 62%":

					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 2.1 * (gallon / ga) * adjustment;
					 cglb = cg / 16;

						adjustementChlorine.setText( cg
								+ " oz " + cglb + " lb");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;

				case "Dichlor 56%":

					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 2.4 * (gallon / ga) * adjustment;
				 cglb = cg / 16;

						adjustementChlorine.setText( cg
								+ " oz " + cglb + " lb");
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}

					break;

				case "Trichlor":

					try {
						gallon = Double.parseDouble(gallonsChlorineED.getText()
								.toString());
						adjustment = Double.parseDouble(chlorineMeasurementET
								.getText().toString());

						cg = 1.5 * (gallon / ga) * adjustment;
						
						 cglb = cg / 16;
						 
						

						adjustementChlorine.setText(cg
								+ " oz " + cglb + " lb");
					} catch (NumberFormatException e) {
						
						e.printStackTrace();
					}

					break;

				default:
					

				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
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
		getMenuInflater().inflate(R.menu.chlorine, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_chlorine,
					container, false);
			return rootView;
		}
	}

	// reset button method
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
			if(v == resetB){
		
		
		gallonsChlorineED.setText("");
			chlorineMeasurementET.setText("");
			adjustementChlorine.setText("");
			chlorineSpinner.setSelection(0);

			
			
			

		}
			
			

	}
	
	public void rounding(){
		
		 cglb = (double) Math.round(cglb*.100)/100;
	}

}
