package com.example.projectinfovalley;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establece la duración de la pantalla de bienvenida
        int SPLASH_SCREEN_TIME_OUT = 5000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Inicia la siguiente actividad
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);

                // Cierra la actividad de la pantalla de bienvenida
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}