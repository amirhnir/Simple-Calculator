package ir.amirhn.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new CountDownTimer(2000,2000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {


                Intent intent = new Intent(splashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        }.start();


    }
}
