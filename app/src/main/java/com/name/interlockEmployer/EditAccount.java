package com.name.interlockEmployer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.R;

public class EditAccount extends Activity {

    Button  buttonSave, buttonBack,buttonHome;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editaccount);



        buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);



       
        
        buttonSave.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), SettingMenu.class);
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