package com.alcphase1.alcphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void aboutALC(View view) {
        Intent aboutALC = new Intent(getApplicationContext(),AboutALC.class);
        startActivity(aboutALC);
    }

    public void myProfile(View view) {
        Intent myProf = new Intent(getApplicationContext(),MyProfile.class);
        startActivity(myProf);
    }
}
