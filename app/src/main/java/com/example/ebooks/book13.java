package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book13 extends AppCompatActivity {
    PDFView pdfView13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book13);
        pdfView13=(PDFView)findViewById(R.id.pdfView13);
        pdfView13.fromAsset("book13.pdf")
                .load();
    }
}
