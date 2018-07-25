package co.com.softhouse.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creamos el intent para enviar al main activite al terminar el splashscreen
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        //Destruimos el activity del splashscreen
        finish();
    }
}
