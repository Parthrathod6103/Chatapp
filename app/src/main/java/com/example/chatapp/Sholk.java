package com.example.chatapp;

        import androidx.appcompat.app.AppCompatActivity;

        import com.example.chatapp.R;
        import com.github.barteksc.pdfviewer.PDFView;
        import android.os.Bundle;



public class Sholk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholk);

        PDFView pdfView = findViewById(R.id.pdf);
        pdfView.fromAsset("Techlife_News_-_20_02_2021.pdf").load();
        pdfView.getPageCount();
        pdfView.fitToWidth();
        pdfView.getZoom();
        pdfView.enableAnnotationRendering(true);
        pdfView.getMaxZoom();


    }
}