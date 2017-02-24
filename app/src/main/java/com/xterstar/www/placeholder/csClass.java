package com.xterstar.www.placeholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_class);

        final Button cs8button = (Button) findViewById(R.id.cs8button);
        cs8button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs16button = (Button) findViewById(R.id.cs16button);
        cs16button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs24button = (Button) findViewById(R.id.cs24button);
        cs24button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs130Abutton = (Button) findViewById(R.id.cs130Abutton);
        cs130Abutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs130Bbutton = (Button) findViewById(R.id.cs130Bbutton);
        cs130Bbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs32button = (Button) findViewById(R.id.cs32button);
        cs32button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs48button = (Button) findViewById(R.id.cs48button);
        cs48button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs56button = (Button) findViewById(R.id.cs56button);
        cs56button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });

        final Button cs64button = (Button) findViewById(R.id.cs64button);
        cs64button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(csClass.this, PostTest.class);
                csClass.this.startActivity(registerIntent);
            }
        });
    }
}
