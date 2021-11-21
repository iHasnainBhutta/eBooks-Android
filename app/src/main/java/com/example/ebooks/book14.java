package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book14 extends AppCompatActivity {
    PDFView pdfView14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book14);
        pdfView14=(PDFView)findViewById(R.id.pdfView14);
        pdfView14.fromAsset("book14.pdf")
                .load();
    }
}
