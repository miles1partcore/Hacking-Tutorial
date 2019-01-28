package com.education.leotech.hackingtutorial;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class mainListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    setContentView(R.layout.activity_main_list);

    // Create the arraylist of content

    final ArrayList<content> Content = new ArrayList<content>();
    Content.add(new content("Overview", R.mipmap.ic_launcher_round,R.layout.activity_overview));
    Content.add(new content("Hacker Type", R.mipmap.ic_launcher_round,R.layout.activity_type_of_hacker));
    Content.add(new content("Terminologies", R.mipmap.ic_launcher_round,R.layout.activity_terminologies));
    Content.add(new content("Tools", R.mipmap.ic_launcher_round,R.layout.activity_tools));
    Content.add(new content("Skills", R.mipmap.ic_launcher_round,R.layout.activity_skills));
    Content.add(new content("Footprinting", R.mipmap.ic_launcher_round));
    Content.add(new content("Fringerprinting", R.mipmap.ic_launcher_round));
    Content.add(new content("Sniffing", R.mipmap.ic_launcher_round));
    Content.add(new content("Sniffing Tools", R.mipmap.ic_launcher_round));
    Content.add(new content("ARP Poisoning", R.mipmap.ic_launcher_round));
    Content.add(new content("DNS Poisoning", R.mipmap.ic_launcher_round));
    Content.add(new content("Exploitation", R.mipmap.ic_launcher_round));
    Content.add(new content("Enumeration", R.mipmap.ic_launcher_round));
    Content.add(new content("Metasploih", R.mipmap.ic_launcher_round));
    Content.add(new content("Trojan Attacks", R.mipmap.ic_launcher_round));
    Content.add(new content("TCP/IP Hijacking", R.mipmap.ic_launcher_round));
    Content.add(new content("Email Hijacking", R.mipmap.ic_launcher_round));
    Content.add(new content("Password Hacking", R.mipmap.ic_launcher_round));
    Content.add(new content("Wireless Hacking", R.mipmap.ic_launcher_round));
    Content.add(new content("Social Engineering", R.mipmap.ic_launcher_round));
    Content.add(new content("DDOS Attacks", R.mipmap.ic_launcher_round));
    Content.add(new content("Cross Site Scripting", R.mipmap.ic_launcher_round));
    Content.add(new content("SQL Injection", R.mipmap.ic_launcher_round));
    Content.add(new content("PenTesting", R.mipmap.ic_launcher_round));


    // Linking ArrayList to ContentAdapter

    ContentAdapter Adapter = new ContentAdapter(this,Content);
    ListView listView =  findViewById(R.id.content);
    listView.setAdapter(Adapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.v("setItemon clicklistner","button has been clicked");


        if(position == 0)
        {
          Intent i = new Intent(mainListActivity.this,overviewActivity.class);
          startActivity(i);
        }
        else if (position == 1)
        {
          Intent i = new Intent(mainListActivity.this,typeOfHackerActivity.class);
          startActivity(i);
        }
        else if (position == 2)
        {
          Intent i = new Intent(mainListActivity.this,terminologiesActivity.class);
          startActivity(i);
        }
        else if (position == 3)
        {
          Intent i = new Intent(mainListActivity.this,ToolsActivity.class);
          startActivity(i);
        }
        else if (position == 4)
        {
          Intent i = new Intent(mainListActivity.this,skillsActivity.class);
          startActivity(i);
        }
      }
    });
  }


}
