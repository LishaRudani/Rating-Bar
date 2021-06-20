package com.example.ratingbarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.rate1);
        button=findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = String.valueOf(ratingBar.getRating());//getRating()call
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();

            }
        });

    }
}