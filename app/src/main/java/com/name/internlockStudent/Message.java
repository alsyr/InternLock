package com.name.internlockStudent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.About;
import com.name.internlock.MainActivity;
import com.name.internlock.R;

public class Message extends Activity {

    Button button,buttonBack,buttonHome;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);



       // button = (Button) findViewById(R.id.button);
        
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);



      /*  button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), Inbox.class);
                startActivity(mIntent);

            }
        });
        
        */
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
