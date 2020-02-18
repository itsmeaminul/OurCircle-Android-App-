package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class SizaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siza);


        //ListView of Siza
        String[] sizaList = getResources().getStringArray(R.array.sizaList);

        ArrayAdapter<String> ad11 = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,sizaList);

        ListView list11 = (ListView) findViewById(R.id.listView11);
        list11.setAdapter(ad11);


        //Button's of Siza
        ImageButton btn11_call = (ImageButton) findViewById(R.id.siza_call_Button);
        ImageButton btn11_sms = (ImageButton) findViewById(R.id.siza_sms_Button);
        ImageButton btn11_fb = (ImageButton) findViewById(R.id.siza_fb_Button);
        ImageButton btn11_gmail = (ImageButton) findViewById(R.id.siza_mail_Button);


        btn11_call.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent11_call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01705808656"));
                startActivity(intent11_call);
            }
        });

        btn11_sms.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent11_sms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:01705808656"));
                startActivity(intent11_sms);
            }
        });

        btn11_fb.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent11_fb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/sazia.haider.96?fref=ts"));
                startActivity(intent11_fb);
            }
        });

        btn11_gmail.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent11_gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:saziahaidersizu50@gmail.com"));
                startActivity(intent11_gmail);
            }
        });
    }
}
