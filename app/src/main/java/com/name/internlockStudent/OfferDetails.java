package com.name.internlockStudent;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.MainActivity;
import com.name.internlock.R;

public class OfferDetails extends Activity {

    Button buttonAboutUs, buttonOfferDescription,  buttonContactUs, buttonInterest, buttonNotInterest,buttonBack,buttonHome;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offerdetails);



        buttonAboutUs = (Button) findViewById(R.id.buttonAboutUs);
        buttonOfferDescription = (Button) findViewById(R.id.buttonOfferDescription);
        buttonContactUs = (Button) findViewById(R.id.buttonContactUs);
        buttonInterest = (Button) findViewById(R.id.buttonInterest);
        buttonNotInterest = (Button) findViewById(R.id.buttonNotInterest);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);



        buttonAboutUs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), CompanyProfile.class);
                startActivity(mIntent);
                } });
        
        buttonOfferDescription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), OfferDescription.class);
                startActivity(mIntent);
                } });
        buttonContactUs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), Message.class);
                startActivity(mIntent);
                } });
        
        buttonInterest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
        				context);
         
        			// set title
        			alertDialogBuilder.setTitle("Would you like to accept this offer?");
         
        			// set dialog message
        			alertDialogBuilder
        				.setMessage("You'll lose all photos and media!")
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
        						// if this button is clicked
        						Intent mIntent = new Intent(getApplicationContext(), Confirmation.class);
        		                startActivity(mIntent);
        					}
        				  });
         
        				// create alert dialog
        				AlertDialog alertDialog = alertDialogBuilder.create();
         
        				// show it
        				alertDialog.show();
        			
        						
        						
        						
                } });
        buttonNotInterest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
        				context);
         
        			// set title
        			alertDialogBuilder.setTitle("Confirm?");
         
        			// set dialog message
        			alertDialogBuilder
        				.setMessage("This offer will be deleted from your list.")
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
                
                } });
        
        
        
        
        
        

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