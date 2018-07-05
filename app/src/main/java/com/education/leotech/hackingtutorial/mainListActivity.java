package com.education.leotech.hackingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class mainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

      // Create the arraylist of content

      ArrayList<content> Content = new ArrayList<content>();

      Content.add(new content("Overview", R.drawable.hackingicon));
      Content.add(new content("Hacker Type", R.drawable.hackingicon));
      Content.add(new content("Terminologies", R.drawable.hackingicon));
      Content.add(new content("Tools", R.drawable.hackingicon));
      Content.add(new content("Skills", R.drawable.hackingicon));
      Content.add(new content("Footprinting", R.drawable.hackingicon));
      Content.add(new content("Fringerprinting", R.drawable.hackingicon));
      Content.add(new content("Sniffing", R.drawable.hackingicon));
      Content.add(new content("Sniffing Tools", R.drawable.hackingicon));
      Content.add(new content("ARP Poisoning", R.drawable.hackingicon));
      Content.add(new content("DNS Poisoning", R.drawable.hackingicon));
      Content.add(new content("Exploitation", R.drawable.hackingicon));
      Content.add(new content("Enumeration", R.drawable.hackingicon));
      Content.add(new content("Metasploih", R.drawable.hackingicon));
      Content.add(new content("Trojan Attacks", R.drawable.hackingicon));
      Content.add(new content("TCP/IP Hijacking", R.drawable.hackingicon));
      Content.add(new content("Email Hijacking", R.drawable.hackingicon));
      Content.add(new content("Password Hacking", R.drawable.hackingicon));
      Content.add(new content("Wireless Hacking", R.drawable.hackingicon));
      Content.add(new content("Social Engineering", R.drawable.hackingicon));
      Content.add(new content("DDOS Attacks", R.drawable.hackingicon));
      Content.add(new content("Cross Site Scripting", R.drawable.hackingicon));
      Content.add(new content("SQL Injection", R.drawable.hackingicon));
      Content.add(new content("PenTesting", R.drawable.hackingicon));


      // Linking ArrayList to ContentAdapter

        ContentAdapter Adapter = new ContentAdapter(this,Content);
        ListView listView =  findViewById(R.id.content);
        listView.setAdapter(Adapter);
    }


}
