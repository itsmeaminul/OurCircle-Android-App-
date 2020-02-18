package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class ShahinurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahinur);

        //ListView of Shahinur
        String[] shahinurList = getResources().getStringArray(R.array.shahinurList);

        ArrayAdapter<String> ad5 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,shahinurList);

        ListView list5 = (ListView) findViewById(R.id.listView5);
        list5.setAdapter(ad5);


        //Button's of Shahinur
        ImageButton btn5_call = (ImageButton) findViewById(R.id.shahinur_call_Button);
        ImageButton btn5_sms = (ImageButton) findViewById(R.id.shahinur_sms_Button);
        ImageButton btn5_fb = (ImageButton) findViewById(R.id.shahinur_fb_Button);
        ImageButton btn5_gmail = (ImageButton) findViewById(R.id.shahinur_mail_Button);


        btn5_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent5_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01721385642"));
                startActivity(intent5_call);
            }
        });

        btn5_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent5_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01721385642"));
                startActivity(intent5_sms);
            }
        });

        btn5_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent5_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/real.shahin.96?fref=ts"));
                startActivity(intent5_fb);
            }
        });

        btn5_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent5_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:shahinislam.btec7thbatch@gmail.com"));
                startActivity(intent5_gmail);
            }
        });
    }
}
