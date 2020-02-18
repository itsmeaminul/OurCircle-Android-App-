package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class AmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ami);


        //ListView of Aminul
        String[] amiList = getResources().getStringArray(R.array.amiList);

        ArrayAdapter<String> adMe = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,amiList);

        ListView listMe = (ListView) findViewById(R.id.listViewMe);
        listMe.setAdapter(adMe);


        //Button's of Aminul
        ImageButton btnMe_call = (ImageButton) findViewById(R.id.me_call_Button);
        ImageButton btnMe_sms = (ImageButton) findViewById(R.id.me_sms_Button);
        ImageButton btnMe_fb = (ImageButton) findViewById(R.id.me_fb_Button);
        ImageButton btnMe_gmail = (ImageButton) findViewById(R.id.me_mail_Button);


        btnMe_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMe_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01746018788"));
                startActivity(intentMe_call);
            }
        });

        btnMe_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMe_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01746018788"));
                startActivity(intentMe_sms);
            }
        });

        btnMe_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMe_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/itsmeaminul"));
                startActivity(intentMe_fb);
            }
        });

        btnMe_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentMe_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:itsmeaminul@gmail.com"));
                startActivity(intentMe_gmail);
            }
        });
    }
}
