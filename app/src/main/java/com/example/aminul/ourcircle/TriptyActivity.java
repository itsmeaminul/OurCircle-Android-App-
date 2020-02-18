package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class TriptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripty);


        //ListView of Tripty
        String[] triptyList = getResources().getStringArray(R.array.triptyList);

        ArrayAdapter<String> ad10 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,triptyList);

        ListView list10 = (ListView) findViewById(R.id.listView10);
        list10.setAdapter(ad10);


        //Button's of Tripty
        ImageButton btn10_call = (ImageButton) findViewById(R.id.tripty_call_Button);
        ImageButton btn10_sms = (ImageButton) findViewById(R.id.tripty_sms_Button);
        ImageButton btn10_fb = (ImageButton) findViewById(R.id.tripty_fb_Button);
        ImageButton btn10_gmail = (ImageButton) findViewById(R.id.tripty_mail_Button);


        btn10_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent10_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01521547775"));
                startActivity(intent10_call);
            }
        });

        btn10_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent10_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01521547775"));
                startActivity(intent10_sms);
            }
        });

        btn10_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent10_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/triptripty"));
                startActivity(intent10_fb);
            }
        });

        btn10_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent10_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"));
                startActivity(intent10_gmail);
            }
        });
    }
}
