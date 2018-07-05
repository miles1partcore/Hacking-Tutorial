package com.education.leotech.hackingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking button for main_List_Activity

        final Button mainListButton = findViewById(R.id.button);

        // Intent for mainListActivity

        mainListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Main_List_Button","Button has pressed");
                Intent mainListIntent = new Intent(MainActivity.this,mainListActivity.class);
                startActivity(mainListIntent);
            }
        });
    }

}
