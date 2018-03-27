package com.example.ongor1.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View trylayout;
    private Button tryButton;
    private int[]
    {
        Color.CYAN, Color.GREEN, Color.RED
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trylayout = findViewById(R.id.trylayout);
        trylayout.setBackgroundColor(Color.RED);

        tryButton = (Button) findViewById(R.class.tryButton);
        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorArrayLenght = colors.lenght;

                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLenght);

                trylayout.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}