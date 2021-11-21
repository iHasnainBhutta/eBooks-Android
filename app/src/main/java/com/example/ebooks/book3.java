package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book3 extends AppCompatActivity {
    PDFView pdfView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
        pdfView3=(PDFView)findViewById(R.id.pdfView3);
        pdfView3.fromAsset("book3.pdf")
                .load();
    }
}
