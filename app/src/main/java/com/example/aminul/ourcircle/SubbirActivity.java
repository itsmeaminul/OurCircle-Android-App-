package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class SubbirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subbir);

        //ListView of Subbir
        String[] subbirList = getResources().getStringArray(R.array.subbirList);

        ArrayAdapter<String> ad3 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,subbirList);

        ListView list3 = (ListView) findViewById(R.id.listView3);
        list3.setAdapter(ad3);


        //Button's of Subbir
        ImageButton btn3_call = (ImageButton) findViewById(R.id.subbir_call_Button);
        ImageButton btn3_sms = (ImageButton) findViewById(R.id.subbir_sms_Button);
        ImageButton btn3_fb = (ImageButton) findViewById(R.id.subbir_fb_Button);
        ImageButton btn3_mail = (ImageButton) findViewById(R.id.subbir_mail_Button);


        btn3_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01755176332"));
                startActivity(intent3_call);
            }
        });

        btn3_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01755176332"));
                startActivity(intent3_sms);
            }
        });

        btn3_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/subbir.reza.9?fref=ts"));
                startActivity(intent3_fb);
            }
        });

        btn3_mail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"));
                startActivity(intent3_gmail);
            }
        });
    }
}
