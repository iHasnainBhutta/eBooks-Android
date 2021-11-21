package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book10 extends AppCompatActivity {
    PDFView pdfView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book10);
        pdfView10=(PDFView)findViewById(R.id.pdfView10);
        pdfView10.fromAsset("book10.pdf")
                .load();
    }
}
