package com.xterstar.www.placeholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_class);

        final Button math3Abutton = (Button) findViewById(R.id.math3Abutton);
        math3Abutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math3Bbutton = (Button) findViewById(R.id.math3Bbutton);
        math3Bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math4Abutton = (Button) findViewById(R.id.math4Abutton);
        math4Abutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math4Bbutton = (Button) findViewById(R.id.math4Bbutton);
        math4Bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math6Abutton = (Button) findViewById(R.id.math6Abutton);
        math6Abutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math6Bbutton = (Button) findViewById(R.id.math6Bbutton);
        math6Bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button math8button = (Button) findViewById(R.id.math8button);
        math8button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button PSTAT120Abutton = (Button) findViewById(R.id.PSTAT120Abutton);
        PSTAT120Abutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });

        final Button PSTAT120Bbutton = (Button) findViewById(R.id.PSTAT120Bbutton);
        PSTAT120Bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(mathClass.this, PostTest.class);
                mathClass.this.startActivity(registerIntent);
            }
        });
    }
}
