package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book4 extends AppCompatActivity {
    PDFView pdfView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book4);
        pdfView4=(PDFView)findViewById(R.id.pdfView4);
        pdfView4.fromAsset("book4.pdf")
                .load();
    }
}
