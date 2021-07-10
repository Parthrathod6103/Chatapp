package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Vacubulery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacubulery);

        PDFView pdfView = findViewById(R.id.pdf2);
        pdfView.fromAsset("Sanskrit – English Dictionary.pdf").load();

    }
}