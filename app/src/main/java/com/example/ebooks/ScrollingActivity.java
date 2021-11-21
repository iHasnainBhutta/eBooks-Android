package com.example.ebooks;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {
    Button button2,button5,button7,button01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.setType("text/email");
                Email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"iHassnainBhutta@gmail.com"});  //developer 's email
                Email.putExtra(Intent.EXTRA_SUBJECT,
                        ""); // Email 's Subject
                Email.putExtra(Intent.EXTRA_TEXT, "Dear Developer Hasnain," + "");  //Email 's Greeting text
                startActivity(Intent.createChooser(Email, "Contact Us or Send Us any PDF Books"));
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook12();
            }
        });
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook13();
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook14();
            }
        });
        button01 = findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook15();
            }
        });

    }
    public void openBook12(){
        Intent intent12 = new Intent(this,book12.class);
        startActivity(intent12);
    }
    public void openBook13(){
        Intent intent13 = new Intent(this,book13.class);
        startActivity(intent13);
    }
    public void openBook14(){
        Intent intent14 = new Intent(this,book14.class);
        startActivity(intent14);
    }
    public void openBook15(){
        Intent intent15 = new Intent(this,book15.class);
        startActivity(intent15);
    }
}
