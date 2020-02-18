package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class HinoyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinoy);


        //ListView of HInoy
        String[] hinoyList = getResources().getStringArray(R.array.hinoyList);

        ArrayAdapter<String> ad4 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,hinoyList);

        ListView list4 = (ListView) findViewById(R.id.listView4);
        list4.setAdapter(ad4);


        //Button's of Hinoy
        ImageButton btn4_call = (ImageButton) findViewById(R.id.hinoy_call_Button);
        ImageButton btn4_sms = (ImageButton) findViewById(R.id.hinoy_sms_Button);
        ImageButton btn4_fb = (ImageButton) findViewById(R.id.hinoy_fb_Button);
        ImageButton btn4_gmail = (ImageButton) findViewById(R.id.hinoy_mail_Button);


        btn4_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent4_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01823802904"));
                startActivity(intent4_call);
            }
        });

        btn4_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent4_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01823802904"));
                startActivity(intent4_sms);
            }
        });

        btn4_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent4_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/profile.php?id=100006158508374&fref=ts"));
                startActivity(intent4_fb);
            }
        });

        btn4_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent4_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:hinoyhabib@gmail.com"));
                startActivity(intent4_gmail);
            }
        });
    }
}
