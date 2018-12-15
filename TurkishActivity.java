package com.teknodate.dnyamutfagi;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TurkishActivity extends AppCompatActivity {
    FloatingActionButton fab;

    public TextView metinAlani;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        metinAlani= findViewById(R.id.metin);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            metinAlani.setText(Html.fromHtml("<h2>Başlık</h2><br><p>Yazı</p>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            metinAlani.setText(Html.fromHtml("<h2>Yazı</h2><br><p>Yazı</p>"));
        }


        fab= findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri pdf = Uri.parse("http://www.megep.meb.gov.tr/mte_program_modul/moduller_pdf/Mayaland%C4%B1r%C4%B1larak%20Haz%C4%B1rlanan%20Hamur.pdf");

                Intent pdfD  =new Intent(Intent.ACTION_VIEW,pdf);

                startActivity(pdfD);
            }
        });
    }
}
