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

        Log.e("Test2","To push project on Github");

        String name="Test for git integration";  // comment to test2

      //  String name2="Test for git2";  // comment to test2

    }

    private void complexMerge2(){

        Log.e("complexMerge","New complex method");

    }
}
