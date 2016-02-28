package com.example.android.simpletexter;

//Jeremy Manthey
//Simple Texter

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String outputString = "Kara";
    String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
//Fix this

    }

    public void onClickKara(View view) {
        outputString = "Kara";
        phoneNumber = "2182131225";

        Intent startIntent = new Intent(getApplicationContext(),
                Main2Activity.class);
        startIntent.putExtra("edu.css.MESSAGE", outputString);
        startIntent.putExtra("edu.css.MESSAGE2", phoneNumber);
        startActivity(startIntent);
    }

    public void onClickOliver(View view) {
        outputString = "Oliver";
        phoneNumber = "2185551234";

        Intent startIntent = new Intent(getApplicationContext(),
                Main2Activity.class);
        startIntent.putExtra("edu.css.MESSAGE", outputString);
        startIntent.putExtra("edu.css.MESSAGE2", phoneNumber);
        startActivity(startIntent);
    }

    public void onClickSeagull(View view) {
        outputString = "Seagull";
        phoneNumber = "2185554321";
        Intent startIntent = new Intent(getApplicationContext(),
                Main2Activity.class);
        startIntent.putExtra("edu.css.MESSAGE", outputString);
        startIntent.putExtra("edu.css.MESSAGE2", phoneNumber);
        startActivity(startIntent);
    }
}
