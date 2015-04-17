package com.name.internlock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermsandConditionsEmp extends Activity {

    Button buttonReject, Accept, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.termsandcond_layout);



        buttonReject = (Button) findViewById(R.id.buttonReject);
        Accept = (Button) findViewById(R.id.buttonAccept);



        Accept.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),
                        If.class);
                startActivity(mIntent);

            }
        });



        buttonReject.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

}