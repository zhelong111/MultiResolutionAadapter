package com.etmay.multiresolutionaadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.etmay.multiresadapter.MultiResolutionUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiResolutionUtil.adapterActivity(this);
    }
}
