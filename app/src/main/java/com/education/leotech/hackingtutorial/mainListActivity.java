package com.education.leotech.hackingtutorial;

import android.content.Intent;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
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
    Content.add(new content("Footprinting", R.mipmap.ic_launcher_round,R.layout.activity_foot_printing));
    Content.add(new content("Fringerprinting", R.mipmap.ic_launcher_round,R.layout.activity_finger_printing));
    Content.add(new content("Sniffing", R.mipmap.ic_launcher_round,R.layout.activity_sniffing));
    Content.add(new content("Sniffing Tools", R.mipmap.ic_launcher_round,R.layout.activity_sniffing_tools));
    Content.add(new content("ARP Poisoning", R.mipmap.ic_launcher_round,R.layout.activity_arp_poisoning));
    Content.add(new content("DNS Poisoning", R.mipmap.ic_launcher_round,R.layout.activity_dns_poisoning));
    Content.add(new content("Exploitation", R.mipmap.ic_launcher_round,R.layout.activity_exploitation));
    Content.add(new content("Enumeration", R.mipmap.ic_launcher_round,R.layout.activity_enumeration));
    Content.add(new content("Metasploit", R.mipmap.ic_launcher_round,R.layout.activity_metasploit));
    Content.add(new content("Trojan Attacks", R.mipmap.ic_launcher_round,R.layout.activity_trojan_attacks));
    Content.add(new content("TCP/IP Hijacking", R.mipmap.ic_launcher_round,R.layout.activity_tcp_ip_hijacking));
    Content.add(new content("Email Hijacking", R.mipmap.ic_launcher_round,R.layout.activity_email_hijacking));
    Content.add(new content("Password Hacking", R.mipmap.ic_launcher_round,R.layout.activity_password_hacking));
    Content.add(new content("Wireless Hacking", R.mipmap.ic_launcher_round,R.layout.activity_wireless_hacking));
    Content.add(new content("Social Engineering", R.mipmap.ic_launcher_round,R.layout.activity_social_engineering));
    Content.add(new content("DDOS Attacks", R.mipmap.ic_launcher_round,R.layout.activity_ddos_attacks));
    Content.add(new content("Cross Site Scripting", R.mipmap.ic_launcher_round,R.layout.activity_cross_site_scripting));
    Content.add(new content("SQL Injection", R.mipmap.ic_launcher_round,R.layout.activity_sql_injection));
    Content.add(new content("PenTesting", R.mipmap.ic_launcher_round,R.layout.activity_pen_testing));


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
        else if (position == 5)
        {
          Intent i = new Intent(mainListActivity.this,FootPrinting.class);
          startActivity(i);
        }
        else if (position == 6)
        {
          Intent i = new Intent(mainListActivity.this,FingerPrinting.class);
          startActivity(i);
        }
        else if (position == 7)
        {
          Intent i = new Intent(mainListActivity.this,Sniffing.class);
          startActivity(i);
        }
        else if (position == 8)
        {
          Intent i = new Intent(mainListActivity.this,SniffingTools.class);
          startActivity(i);
        }
        else if (position == 9)
        {
          Intent i = new Intent(mainListActivity.this,ArpPoisoning.class);
          startActivity(i);
        }
        else if (position == 10)
        {
          Intent i = new Intent(mainListActivity.this,DnsPoisoning.class);
          startActivity(i);
        }
        else if (position == 11)
        {
          Intent i = new Intent(mainListActivity.this,Exploitation.class);
          startActivity(i);
        }
        else if (position == 12)
        {
          Intent i = new Intent(mainListActivity.this,Enumeration.class);
          startActivity(i);
        }
        else if (position == 13)
        {
          Intent i = new Intent(mainListActivity.this,Metasploit.class);
          startActivity(i);
        }
        else if (position == 14)
        {
          Intent i = new Intent(mainListActivity.this,TrojanAttacks.class);
          startActivity(i);
        }
        else if (position == 15)
        {
          Intent i = new Intent(mainListActivity.this,TcpIpHijacking.class);
          startActivity(i);
        }
        else if (position == 16)
        {
          Intent i = new Intent(mainListActivity.this,EmailHijacking.class);
          startActivity(i);
        }
        else if (position == 17)
        {
          Intent i = new Intent(mainListActivity.this,PasswordHacking.class);
          startActivity(i);
        }
        else if (position == 18)
        {
          Intent i = new Intent(mainListActivity.this,WirelessHacking.class);
          startActivity(i);
        }
        else if (position == 19)
        {
          Intent i = new Intent(mainListActivity.this,SocialEngineering.class);
          startActivity(i);
        }
        else if (position == 20)
        {
          Intent i = new Intent(mainListActivity.this,DDOsAttacks.class);
          startActivity(i);
        }
        else if (position == 21)
        {
          Intent i = new Intent(mainListActivity.this,CrossSiteScripting.class);
          startActivity(i);
        }
        else if (position == 22)
        {
          Intent i = new Intent(mainListActivity.this,SQlInjection.class);
          startActivity(i);
        }
        else if (position == 23)
        {
          Intent i = new Intent(mainListActivity.this,PenTesting.class);
          startActivity(i);
        }
      }
    });
  }

/*  public void didTapButton(View view) {
    Button button = (Button)findViewById(R.id.button);
    final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
    button.startAnimation(myAnim);
  }*/


}
