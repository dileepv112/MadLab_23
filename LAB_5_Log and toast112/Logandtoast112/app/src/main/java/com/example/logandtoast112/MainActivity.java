package com.example.logandtoast112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void Disp(View view){
       Log.i("Disp","There is an error here");
         Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}