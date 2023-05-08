package com.example.imageview112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isflag = true;
      public void change(View view){
          ImageView iv=findViewById(R.id.imageView);
          if(isflag) {
              iv.setImageResource(R.drawable.img_1);
              isflag = false;
          }else{
              iv.setImageResource(R.drawable.img_2);
              isflag = true;
          }
      }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}