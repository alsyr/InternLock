package com.name.interlockEmployer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.R;
public class OffersMenu extends Activity {

    Button ButtonOffer, button0, buttonCreateNew, buttonBack,buttonHome;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offermenu);



        ButtonOffer = (Button) findViewById(R.id.ButtonOffer);
        button0 = (Button) findViewById(R.id.button0);
        buttonCreateNew = (Button) findViewById(R.id.buttonCreateNew);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);



        ButtonOffer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), OfferPreview.class);
                startActivity(mIntent);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), EditOffer.class);
                startActivity(mIntent);

            }
        });
        
        buttonCreateNew.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), EditOffer.class);
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