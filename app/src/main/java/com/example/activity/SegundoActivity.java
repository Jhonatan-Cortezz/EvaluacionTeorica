package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LOGCAT", "Segundo Activity entra en el metodo onRestart");
    }
}