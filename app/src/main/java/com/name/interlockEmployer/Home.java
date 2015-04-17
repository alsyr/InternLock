package com.name.interlockEmployer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.MainActivity;
import com.name.internlock.R;

public class Home extends Activity {

    Button buttonInbox, buttonOffers,buttonFind, buttonSettings,buttonLogout,buttonAbout;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homee);



        buttonInbox = (Button) findViewById(R.id.buttonInbox);
        buttonOffers = (Button) findViewById(R.id.buttonOffers);
        buttonFind = (Button) findViewById(R.id.buttonFind);
        buttonSettings = (Button) findViewById(R.id.buttonSettings);
        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        buttonAbout = (Button) findViewById(R.id.buttonAbout);



        buttonInbox.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), Inbox.class);
                startActivity(mIntent);

            }
        });
        buttonOffers.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  OffersMenu.class);
                startActivity(mIntent);

            }
        });
        
        buttonFind.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  Search.class);
                startActivity(mIntent);

            }
        });


        buttonSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent mIntent = new Intent(getApplicationContext(),  SettingMenu.class);
                startActivity(mIntent);

            }
        });
        
        buttonLogout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mIntent);

            }
        });
        buttonAbout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  About.class);
                startActivity(mIntent);

            }
        });

    }
}