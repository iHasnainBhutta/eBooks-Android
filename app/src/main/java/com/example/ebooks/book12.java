package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book12 extends AppCompatActivity {
    PDFView pdfView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book12);
        pdfView12=(PDFView)findViewById(R.id.pdfView12);
        pdfView12.fromAsset("book12.pdf")
                .load();
    }
}
