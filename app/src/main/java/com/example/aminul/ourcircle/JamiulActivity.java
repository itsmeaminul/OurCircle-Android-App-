package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class JamiulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamiul);


        //ListView of Jami
        String[] jamiList = getResources().getStringArray(R.array.jamiulList);

        ArrayAdapter<String> adJami = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,jamiList);

        ListView listJami = (ListView) findViewById(R.id.listViewJami);
        listJami.setAdapter(adJami);


        //Button's of Jami
        ImageButton btnJami_call = (ImageButton) findViewById(R.id.jami_call_Button);
        ImageButton btnJami_sms = (ImageButton) findViewById(R.id.jami_sms_Button);
        ImageButton btnJami_fb = (ImageButton) findViewById(R.id.jami_fb_Button);
        ImageButton btnJami_gmail = (ImageButton) findViewById(R.id.jami_mail_Button);


        btnJami_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentJami_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01737367874"));
                startActivity(intentJami_call);
            }
        });

        btnJami_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentJami_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01737367874"));
                startActivity(intentJami_sms);
            }
        });

        btnJami_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentJami_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/jamiul.hasan.75?fref=ts"));
                startActivity(intentJami_fb);
            }
        });

        btnJami_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentJami_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:jamiulhasan12@gmail.com"));
                startActivity(intentJami_gmail);
            }
        });
    }
}
