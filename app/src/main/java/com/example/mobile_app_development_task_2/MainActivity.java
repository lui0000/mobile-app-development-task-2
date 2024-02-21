package com.example.mobile_app_development_task_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    private void showToast(String activityCreated) {
        String message = "my massage";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show(); // Метод для отображения сообщения
    }
    private void setUpActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpActionBar();
        showToast("Activity created"); // Показываем сообщение при создании активности
        Log.d("messagee", "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("Activity started");
        Log.d("messagee", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("Activity resumed");
        Log.d("messagee", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("Activity paused");
        Log.d("messagee", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Activity stopped");
        Log.d("messagee", "OnStop");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("messagee", "onSaveInstanceState");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Activity destroyed");
        Log.d("messagee", "OnDestroy");
    }
}