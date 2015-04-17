package com.name.interlockEmployer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.name.internlock.R;

public class SearchSkills extends Activity {

    Button  school, major,gpa, location, interests, search, buttonBack,buttonHome;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchskills);



        school = (Button) findViewById(R.id.buttonSchool);
        major = (Button) findViewById(R.id.buttonMajor);
        gpa = (Button) findViewById(R.id.buttonGPA);
        location = (Button) findViewById(R.id.buttonLocation);
        interests = (Button) findViewById(R.id.buttonInterest);
        search = (Button) findViewById(R.id.search);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonHome = (Button) findViewById(R.id.buttonHome);


        school.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), SearchSchool.class);
                startActivity(mIntent);

            }
        });
        
        

        major.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
        		Intent mIntent = new Intent(getApplicationContext(), SearchMajor.class);
                startActivity(mIntent);

            }
        });
        gpa.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  SearchGPA.class);
                startActivity(mIntent);

            }
        });

        
        

        location.setOnClickListener(new View.OnClickListener() {

        	public void onClick(View v) {
        		Intent mIntent = new Intent(getApplicationContext(), SearchLocation.class);
                startActivity(mIntent);;

            }
        });
        interests.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(),  SearchInterests.class);
                startActivity(mIntent);

            }
        });

        
        
        
        
        
        
        
        
        
        

       
        
        search.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), SearchResult.class);
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
