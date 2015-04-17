package com.name.interlockEmployer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.R;

public class SettingMenu extends Activity {

    Button buttonAccount,buttonEdit,buttonNotification;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingmenu);



        buttonAccount = (Button) findViewById(R.id.buttonAccount);
        buttonEdit = (Button) findViewById(R.id.buttonEdit);
        buttonNotification = (Button) findViewById(R.id.buttonNotification);



        
        
        buttonAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), EditAccount.class);
                startActivity(mIntent);

            }
        });

        buttonEdit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), EditProfile.class);
                startActivity(mIntent);

            }
        });
        buttonNotification.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  Notifications.class);
                startActivity(mIntent);

            }
        });

    }

}