package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book8 extends AppCompatActivity {
    PDFView pdfView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book8);
        pdfView8=(PDFView)findViewById(R.id.pdfView8);
        pdfView8.fromAsset("book8.pdf")
                .load();
    }
}
