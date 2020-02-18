package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class KabitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabita);


        //ListView of Kabita
        String[] kabitaList = getResources().getStringArray(R.array.kabitaList);

        ArrayAdapter<String> ad12 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,kabitaList);

        ListView list12 = (ListView) findViewById(R.id.listView12);
        list12.setAdapter(ad12);


        //Button's of Kabita
        ImageButton btn12_call = (ImageButton) findViewById(R.id.kabita_call_Button);
        ImageButton btn12_sms = (ImageButton) findViewById(R.id.kabita_sms_Button);
        ImageButton btn12_fb = (ImageButton) findViewById(R.id.kabita_fb_Button);
        ImageButton btn12_gmail = (ImageButton) findViewById(R.id.kabita_mail_Button);


        btn12_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent12_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01749411684"));
                startActivity(intent12_call);
            }
        });

        btn12_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent12_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01749411684"));
                startActivity(intent12_sms);
            }
        });

        btn12_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent12_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/kamrunnahar.kabita.9?fref=ts"));
                startActivity(intent12_fb);
            }
        });

        btn12_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent12_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:kabita.hstu22@yahoo.com"));
                startActivity(intent12_gmail);
            }
        });
    }
}
