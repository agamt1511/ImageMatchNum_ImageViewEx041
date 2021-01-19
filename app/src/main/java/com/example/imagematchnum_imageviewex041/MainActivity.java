package com.example.imagematchnum_imageviewex041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button btn;
    Random rnd = new Random();
    int hagrla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        btn = (Button) findViewById(R.id.btn);
    }

    public void showing(View view) {
        rnd = new Random();
        hagrla = rnd.nextInt(3);
        hagrla++;

        if (hagrla == 1) {
            iv.setImageResource(R.drawable.numone);
            btn.setText(""+hagrla);
        }
        if (hagrla == 2) {
            iv.setImageResource(R.drawable.numtwo);
            btn.setText(""+hagrla);
        }
        if (hagrla == 3) {
            iv.setImageResource(R.drawable.numthree);
            btn.setText(""+hagrla);
        }
    }
}