package com.example.darkbook.cheeschaser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        play = findViewById(R.id.buttonPlay);
        play.setOnClickListener(myhandler);
    }


    View.OnClickListener myhandler = new View.OnClickListener() {
        public void onClick(View v) {
            startGame();
        }
    };
    public void startGame() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
        finish();
    }
}
