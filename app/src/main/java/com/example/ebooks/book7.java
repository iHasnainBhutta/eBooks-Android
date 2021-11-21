package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book7 extends AppCompatActivity {
    PDFView pdfView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book7);
        pdfView7=(PDFView)findViewById(R.id.pdfView7);
        pdfView7.fromAsset("book7.pdf")
                .load();
    }
}
