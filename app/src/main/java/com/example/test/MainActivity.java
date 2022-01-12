package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
Log.e(String, String) // Error
Log.w(String, String) // Warning
Log.i(String, String) // Information
Log.d(String, String) // Debug
Log.v(String, String) // Verbose
*/


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String CONTACT_1 = "jay";
    private static final String CONTACT_2 = "day";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView contactName1= findViewById(R.id.incl_cardview_contact_card_main_1).findViewById(R.id.tv_contact_card);
        contactName1.setText(CONTACT_1);

        TextView contactName2= findViewById(R.id.incl_cardview_contact_card_main_2).findViewById(R.id.tv_contact_card);
        contactName2.setText(CONTACT_2);

        ((ImageView)findViewById(R.id.incl_cardview_contact_card_main_1).findViewById(R.id.iv_avatar_card)).setImageResource(R.drawable.yami);
        ((ImageView)findViewById(R.id.incl_cardview_contact_card_main_2).findViewById(R.id.iv_avatar_card)).setImageResource(R.drawable.yami2);

    }

}

