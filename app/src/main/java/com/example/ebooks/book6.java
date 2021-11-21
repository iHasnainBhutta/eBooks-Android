package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book6 extends AppCompatActivity {
    PDFView pdfView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book6);
        pdfView6=(PDFView)findViewById(R.id.pdfView6);
        pdfView6.fromAsset("book6.pdf")
                .load();
    }
}
