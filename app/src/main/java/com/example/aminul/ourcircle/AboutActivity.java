package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String[] aboutList = getResources().getStringArray(R.array.about);

        ArrayAdapter<String> adAbout = new ArrayAdapter<String>(this, android.R.layout.
                simple_list_item_1,aboutList);

        ListView listAbout = (ListView) findViewById(R.id.listViewAbout);
        listAbout.setAdapter(adAbout);


        ImageButton schoolBtn = (ImageButton) findViewById(R.id.schoolButton);
        schoolBtn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent schoolIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.stphilipssc.edu.bd/index.php?go=47"));
                startActivity(schoolIntent);
            }
        });
    }
}
