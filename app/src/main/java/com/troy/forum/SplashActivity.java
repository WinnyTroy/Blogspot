package com.troy.forum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        onClickButtonListener();
    }

    //    create a method with instructions on what should happen after button is pressed
    public void onClickButtonListener(){
//      CASTING THIS INSTANCE TO ITS ID
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        create an object of the Intent class
//                        constructor of this intent object is the package name of the activity you wish to open by pressing the button
                        Intent intent = new Intent("com.troy.forum.MainActivity");
                        startActivity(intent);
                    }

                }
        );


    }
}




