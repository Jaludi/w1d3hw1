package com.example.android.w1d3hw1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d(TAG, "????");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        String potato = "";
        if(newConfig.orientation == 2)
            potato = "Horizontal";
        if(newConfig.orientation == 1)
            potato = "Vertical";
        Log.d(TAG, potato);
        //Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();

    }
}
