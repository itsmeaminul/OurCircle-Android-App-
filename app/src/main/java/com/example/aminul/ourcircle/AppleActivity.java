package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class AppleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);


        //ListView of Apple
        String[] appleList = getResources().getStringArray(R.array.appleList);

        ArrayAdapter<String> ad9 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,appleList);

        ListView list9 = (ListView) findViewById(R.id.listView9);
        list9.setAdapter(ad9);


        //Button's of Mamun
        ImageButton btn9_call = (ImageButton) findViewById(R.id.apple_call_Button);
        ImageButton btn9_sms = (ImageButton) findViewById(R.id.apple_sms_Button);
        ImageButton btn9_fb = (ImageButton) findViewById(R.id.apple_fb_Button);
        ImageButton btn9_gmail = (ImageButton) findViewById(R.id.apple_mail_Button);


        btn9_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent10_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01734570388"));
                startActivity(intent10_call);
            }
        });

        btn9_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent9_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01734570388"));
                startActivity(intent9_sms);
            }
        });

        btn9_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent9_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mostafijur.rahman.14019"));
                startActivity(intent9_fb);
            }
        });

        btn9_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent9_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:Mostafij.tex@gmail.com"));
                startActivity(intent9_gmail);
            }
        });
    }
}
