package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MamunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamun);


        //ListView of Mamun
        String[] mamunList = getResources().getStringArray(R.array.mamunList);

        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,mamunList);

        ListView list1 = (ListView) findViewById(R.id.listView1);
        list1.setAdapter(ad1);


        //Button's of Mamun
        ImageButton btn1_call = (ImageButton) findViewById(R.id.mamun_call_Button);
        ImageButton btn1_sms = (ImageButton) findViewById(R.id.mamun_sms_Button);
        ImageButton btn1_fb = (ImageButton) findViewById(R.id.mamun_fb_Button);
        ImageButton btn1_gmail = (ImageButton) findViewById(R.id.mamun_mail_Button);


        btn1_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01745782321"));
                startActivity(intent1_call);
            }
        });

        btn1_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01745782321"));
                startActivity(intent1_sms);
            }
        });

        btn1_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/lan.mamun?ref=br_rs"));
                startActivity(intent1_fb);
            }
        });

        btn1_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:abmamun.cse@gmail.com"));
                startActivity(intent1_gmail);
            }
        });

    }

}
