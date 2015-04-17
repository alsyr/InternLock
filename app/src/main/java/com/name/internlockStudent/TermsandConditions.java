package com.name.internlockStudent;

import com.name.internlock.If;
import com.name.internlock.R;
import com.name.internlock.R.id;
import com.name.internlock.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermsandConditions extends Activity {

    Button buttonReject, Accept;

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
                        CreateAc.class);
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