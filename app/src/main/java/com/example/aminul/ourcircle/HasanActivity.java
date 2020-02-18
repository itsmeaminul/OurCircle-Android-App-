package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class HasanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasan);


        //ListView of Hasan
        String[] hasanList = getResources().getStringArray(R.array.hasanList);

        ArrayAdapter<String> ad2 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,hasanList);

        ListView list2 = (ListView) findViewById(R.id.listView2);
        list2.setAdapter(ad2);


        //Button's of Hasan
        ImageButton btn2_call = (ImageButton) findViewById(R.id.hasan_call_Button);
        ImageButton btn2_sms = (ImageButton) findViewById(R.id.hasan_sms_Button);
        ImageButton btn2_fb = (ImageButton) findViewById(R.id.hasan_fb_Button);
        ImageButton btn2_gmail = (ImageButton) findViewById(R.id.hasan_mail_Button);


        btn2_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01762709782"));
                startActivity(intent2_call);
            }
        });

        btn2_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01762709782"));
                startActivity(intent2_sms);
            }
        });

        btn2_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/hasan.shah.1485?fref=ts"));
                startActivity(intent2_fb);
            }
        });

        btn2_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:hasanshahoria@gmail.com"));
                startActivity(intent2_gmail);
            }
        });
    }
}
