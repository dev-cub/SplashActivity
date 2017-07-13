package com.codenicely.cub.splashactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends Activity {
    public ProgressBar spinner;

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        spinner = (ProgressBar)findViewById(R.id.progressBar1);




        new Handler().postDelayed(new Runnable() {



            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                spinner.setVisibility(View.VISIBLE);


                // This method will be executed once the timer is over
                // Start your app main activity

                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();

            }
        }, SPLASH_TIME_OUT);

        spinner.setVisibility(View.GONE);

    }

}