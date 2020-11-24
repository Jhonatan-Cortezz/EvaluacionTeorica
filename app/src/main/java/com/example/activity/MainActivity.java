package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LOGCAT", "Activity Main entra en el metodo onCreate");
        btnNext = findViewById(R.id.button);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, SegundoActivity.class);
                startActivity(siguiente);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOGCAT", "Activity Main entra en el metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCAT", "Activity Main entra en el metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOGCAT", "Activity Main entra en el metodo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCAT", "Activity Main entra en el metodo onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LOGCAT", "Activity Main entra en el metodo onRestart");
    }
}