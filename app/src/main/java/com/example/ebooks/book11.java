package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book11 extends AppCompatActivity {
    PDFView pdfView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book11);
        pdfView11=(PDFView)findViewById(R.id.pdfView11);
        pdfView11.fromAsset("book11.pdf")
                .load();
    }
}
