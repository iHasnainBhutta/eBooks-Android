package com.example.ebooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book1 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
  
        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("book1.pdf")
                .load();
    }

}
