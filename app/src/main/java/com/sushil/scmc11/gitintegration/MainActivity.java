package com.sushil.scmc11.gitintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void pushMethod(){

        Log.e("Test","To push project on Github");

        String name="Test for git";

    }
}
