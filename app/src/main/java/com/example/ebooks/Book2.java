package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Book2 extends AppCompatActivity {
    PDFView pdfView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        pdfView2=(PDFView)findViewById(R.id.pdfView2);
        pdfView2.fromAsset("book2.pdf")
                .load();
    }
}

