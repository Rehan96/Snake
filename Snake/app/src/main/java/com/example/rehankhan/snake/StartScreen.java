package com.example.rehankhan.snake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartScreen extends AppCompatActivity {
    private ImageButton startbtn;
    private ImageButton startlvl2btn;
    private ImageButton startlvl3btn;
    private ImageButton helpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        startbtn = (ImageButton) findViewById(R.id.startbtn);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        startlvl2btn = (ImageButton) findViewById(R.id.startlvl2btn);
        startlvl2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlvl2();
            }
        });

        startlvl3btn = (ImageButton) findViewById(R.id.startlvl3btn);
        startlvl3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlvl3();
            }
        });

        helpbtn = (ImageButton) findViewById(R.id.helpbtn);
        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });

    }

    public void openGame(){
        Intent intent = new Intent(this, SnakeActivity.class);
        startActivity(intent);
    }
    public void openlvl2(){
        Intent intent = new Intent(this, SnakeActivity2.class);
        startActivity(intent);
    }
    public void openlvl3(){
        Intent intent = new Intent(this, SnakeActivity3.class);
        startActivity(intent);
    }

    public void openHelp(){
        Intent intent = new Intent(this, HelpScreen.class);
        startActivity(intent);
    }

}
