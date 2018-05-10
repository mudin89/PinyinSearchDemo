package com.example.mudin89.pinyinsearchdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements net.HeZi.Android.HeInputLibrary.HeInput_Activation_Fragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    //OnFragmentInteractionListener
    public void onFragmentInteraction(Uri uri)
    {}

    @Override
    public String getHostApplicationName(){
        return getPackageName();
    }
}
