package com.name.interlockEmployer;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.name.internlock.R;

public class About extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);


        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void collapseToggle(View view){
        TextView text = (TextView) view;
        if( ! text.getText().equals(getString(R.string.about_filler))){
            text.setText(getString(R.string.about_filler));
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.About_filler));
            text.setGravity(Gravity.CENTER);
        }

        else if(text.getId() == R.id.FLSAc){
            text.setGravity(Gravity.LEFT);
            text.setText(getString(R.string.about_contents_FLSA));
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.About_contents));
        }
        else if(text.getId() == R.id.IvSc){
            text.setGravity(Gravity.LEFT);
            text.setText(getString(R.string.about_contents_IvS));
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.About_contents));
        }
        else if(text.getId() == R.id.nDc){
            text.setGravity(Gravity.LEFT);
            text.setText(getString(R.string.about_contents_nD));
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.About_contents));
        }
        else if(text.getId() == R.id.SHc){
            text.setGravity(Gravity.LEFT);
            text.setText(getString(R.string.about_contents_SH));
            text.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.About_contents));
        }
    }
}

