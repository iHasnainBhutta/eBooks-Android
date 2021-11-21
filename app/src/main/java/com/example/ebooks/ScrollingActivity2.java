package com.example.ebooks;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ScrollingActivity2 extends AppCompatActivity {
    Button button10,button11,button12,button13,button6,button8,button4,button31,button32,button33,button3,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling2);

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

        button10 =(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook1();
            }


        });
        button11= (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook2();
            }
        });
        button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openBook3();
            }
        });
        button13=(Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook4();
            }
        });
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook5();
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook6();
            }
        });
        button4 =  findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook7();
            }
        });
        button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook8();
            }
        });
        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook9();
            }
        });
        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook10();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook11();
            }
        });


    }
    public void openBook1() {
        Intent intent01 = new Intent(ScrollingActivity2.this,book1.class);
        startActivity(intent01);

    }

    public void openBook2() {
        Intent intent02 = new Intent(this,Book2.class);
        startActivity(intent02);
    }
    public void openBook3() {
        Intent intent03 = new Intent(this,book3.class);
        startActivity(intent03);
    }

    public void openBook4() {
        Intent intent04 = new Intent(this,book4.class);
        startActivity(intent04);
    }

    public void openBook5() {
        Intent intent05 = new Intent(this,book5.class);
        startActivity(intent05);
    }
    public void openBook6() {
        Intent intent06 = new Intent(this,book6.class);
        startActivity(intent06);
    }
    public void openBook7() {
        Intent intent07 = new Intent(this,book7.class);
        startActivity(intent07);
    }
    public void openBook8() {
        Intent intent08 = new Intent(this,book8.class);
        startActivity(intent08);
    }
    public void openBook9() {
        Intent intent09 = new Intent(this,book9.class);
        startActivity(intent09);
    }
    public void openBook10() {
        Intent intent10 = new Intent(this,book10.class);
        startActivity(intent10);
    }
    public void openBook11() {
        Intent intent11 = new Intent(this,book11.class);
        startActivity(intent11);
    }


}

