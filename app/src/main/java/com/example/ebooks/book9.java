package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book9 extends AppCompatActivity {
    PDFView pdfView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book9);
        pdfView9=(PDFView)findViewById(R.id.pdfView9);
        pdfView9.fromAsset("book9.pdf")
                .load();
    }
}
