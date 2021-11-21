package com.example.ebooks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class onlineCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_courses);
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
                startActivity(Intent.createChooser(Email, "Contact Us"));
            }
        });
    }

    public void browser1(View view) {

        Intent intent011 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org"));
        startActivity(intent011);
    }

    public void browser2(View view) {

        Intent intent012 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com"));
        startActivity(intent012);

    }

    public void browser3(View view) {
        Intent intent013 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edx.org"));
        startActivity(intent013);
    }

    public void browser4(View view) {

        Intent intent014 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://online.stanford.edu"));
        startActivity(intent014);
    }

    public void browser5(View view) {

        Intent intent015 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khanacademy.org"));
        startActivity(intent015);


    }

    public void browser6(View view) {

        Intent intent016 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lynda.com"));
        startActivity(intent016);
    }

    public void browser7(View view) {

        Intent intent017 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ocw.mit.edu"));
        startActivity(intent017);

    }
}
