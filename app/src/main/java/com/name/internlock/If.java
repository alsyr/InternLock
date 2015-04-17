package com.name.internlock;
import com.name.internlockStudent.TermsandConditions;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class If extends Activity {

    Button buttonEmployer, buttonStudent, buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.if_layout);


        buttonEmployer = (Button) findViewById(R.id.buttonEmployer);
        buttonStudent = (Button) findViewById(R.id.buttonStudent);
        buttonBack = (Button) findViewById(R.id.buttonBack);


        buttonEmployer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),
                		com.name.interlockEmployer.TermsAndCond.class);
                startActivity(mIntent);

            }
        });
        buttonStudent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),
                		com.name.internlockStudent.TermsandConditions.class);
                startActivity(mIntent);

            }
        });



        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

}