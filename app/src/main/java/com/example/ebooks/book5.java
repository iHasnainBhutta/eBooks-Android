package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book5 extends AppCompatActivity {
    PDFView pdfView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book5);
        pdfView5=(PDFView)findViewById(R.id.pdfView5);
        pdfView5.fromAsset("book5.pdf")
                .load();
    }
}
