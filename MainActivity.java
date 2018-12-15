package com.teknodate.dnyamutfagi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public Button trBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trBtn = findViewById(R.id.tr);

        trBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Intent gecis = new Intent(MainActivity.this ,TurkishActivity.class);

                startActivity(gecis);
            }
        });






    }
}
