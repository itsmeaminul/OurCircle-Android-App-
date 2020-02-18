package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class SumiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumi);


        //ListView of Nusrat
        String[] sumiList = getResources().getStringArray(R.array.sumiList);

        ArrayAdapter<String> adSumi = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,sumiList);

        ListView listSumi = (ListView) findViewById(R.id.listViewSumi);
        listSumi.setAdapter(adSumi);


        //Button's of Nusrat
        ImageButton btnSumi_call = (ImageButton) findViewById(R.id.sumi_call_Button);
        ImageButton btnSumi_sms = (ImageButton) findViewById(R.id.sumi_sms_Button);
        ImageButton btnSumi_fb = (ImageButton) findViewById(R.id.sumi_fb_Button);
        ImageButton btnSumi_mail = (ImageButton) findViewById(R.id.sumi_mail_Button);


        btnSumi_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentSumi_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01739770203"));
                startActivity(intentSumi_call);
            }
        });

        btnSumi_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentSumi_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01739770203"));
                startActivity(intentSumi_sms);
            }
        });

        btnSumi_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentSumi_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/nusratnigar.sumona"));
                startActivity(intentSumi_fb);
            }
        });

        btnSumi_mail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentSumi_mail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:nigar.sumona203@gmail.coom"));
                startActivity(intentSumi_mail);
            }
        });
    }
}
