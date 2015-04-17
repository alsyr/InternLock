package com.name.internlockStudent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.R;

public class Confirmation extends Activity {

    Button buttonContinue;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation);



        buttonContinue = (Button) findViewById(R.id.buttonContinue);



        
        
        

        
        buttonContinue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  ProfilePreview.class);
                startActivity(mIntent);

            }
        });

    }

}