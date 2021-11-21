package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book15 extends AppCompatActivity {
    PDFView pdfView15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book15);
        pdfView15=(PDFView)findViewById(R.id.pdfView15);
        pdfView15.fromAsset("book15.pdf")
                .load();
    }
}
