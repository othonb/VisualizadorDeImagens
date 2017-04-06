package com.example.professor.visualizadordeimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick (View v) {

        ImageView imagem = (ImageView) findViewById(R.id.imageView);
        TextView texto = (TextView) findViewById(R.id.textView);

        switch (v.getId())
        {
            case R.id.button1:
                imagem.setImageResource(R.drawable.image1);
                texto.setText("Imagem 1");
                break;
            case R.id.button2:
                imagem.setImageResource(R.drawable.image2);
                texto.setText("Imagem 2");
                break;
            case R.id.button3:
                imagem.setImageResource(R.drawable.image3);
                texto.setText("Imagem 3");
                break;
        }

    }
}
