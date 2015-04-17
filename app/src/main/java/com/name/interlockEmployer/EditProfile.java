package com.name.interlockEmployer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.name.internlock.R;

public class EditProfile extends Activity {

    Button Upload, buttonPreview, buttonSave, buttonBack,buttonHome;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofilee);



        Upload = (Button) findViewById(R.id.Upload);
        buttonPreview = (Button) findViewById(R.id.buttonPreview);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);



        
        Upload.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
        		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
        				context);
        		final CharSequence[] items = { "Take a Photo", "Choose from Gallery" };
         
        			// set title
        			alertDialogBuilder.setTitle("Upload a Picture...");
         
        			// set dialog message
        			alertDialogBuilder
        			.setSingleChoiceItems(items, -1,
        	                new DialogInterface.OnClickListener() {
        	                    public void onClick(DialogInterface dialog, int item) {
        	                        Toast.makeText(getApplicationContext(), items[item],
        	                                Toast.LENGTH_SHORT).show();
        	                    }
        	                })
        				.setCancelable(false)
        				.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
        					public void onClick(DialogInterface dialog,int id) {
        						// if this button is clicked, just close
        						// the dialog box and do nothing
        						dialog.cancel();
        					}
        				})
        				.setPositiveButton("Confirm",new DialogInterface.OnClickListener() {
        					public void onClick(DialogInterface dialog,int id) {
        						// if this button is clicked, close
        						// the dialog box and do nothing
        						dialog.cancel();
        					}
        				  });
         
        				// create alert dialog
        				AlertDialog alertDialog = alertDialogBuilder.create();
         
        				// show it
        				alertDialog.show();

            }
        });
        
        buttonPreview.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
        		Intent mIntent = new Intent(getApplicationContext(),  ProfilePreview.class);
                startActivity(mIntent);

            }
        });
        
        
        buttonSave.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
        		Intent mIntent = new Intent(getApplicationContext(),  SettingMenu.class);
                startActivity(mIntent);

            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
                finish();

            }
        });
        buttonHome.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  Home.class);
                startActivity(mIntent);

            }
        });

    }

}