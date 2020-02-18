package com.example.aminul.ourcircle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo);


        ImageButton mamun_btn = (ImageButton) findViewById(R.id.start_mamun_button);
        ImageButton hasan_btn = (ImageButton) findViewById(R.id.start_hasan_button);
        ImageButton subbir_btn = (ImageButton) findViewById(R.id.start_subbir_button);
        ImageButton hinoy_btn = (ImageButton) findViewById(R.id.start_hinoy_button);

        ImageButton shahinur_btn = (ImageButton) findViewById(R.id.start_shahinur_button);
        ImageButton jami_btn = (ImageButton) findViewById(R.id.start_jami_button);
        ImageButton aminul_btn = (ImageButton) findViewById(R.id.start_aminul_button);
        ImageButton sumona_btn = (ImageButton) findViewById(R.id.start_sumona_button);

        ImageButton apple_btn = (ImageButton) findViewById(R.id.start_apple_button);
        ImageButton tripty_btn = (ImageButton) findViewById(R.id.start_tripty_button);
        ImageButton siza_btn = (ImageButton) findViewById(R.id.start_siza_button);
        ImageButton kabita_btn = (ImageButton) findViewById(R.id.start_kabita_button);


        mamun_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent mamun_intent = new Intent(MainActivity.this, MamunActivity.class);
                startActivity(mamun_intent);
            }
        });

        hasan_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent hasan_intent = new Intent(MainActivity.this, HasanActivity.class);
                startActivity(hasan_intent);
            }
        });

        subbir_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent subbir_intent = new Intent(MainActivity.this, SubbirActivity.class);
                startActivity(subbir_intent);
            }
        });

        hinoy_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent hinoy_intent = new Intent(MainActivity.this, HinoyActivity.class);
                startActivity(hinoy_intent);
            }
        });

        shahinur_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent shahinur_intent = new Intent(MainActivity.this, ShahinurActivity.class);
                startActivity(shahinur_intent);
            }
        });

        jami_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent jami_intent = new Intent(MainActivity.this, JamiulActivity.class);
                startActivity(jami_intent);
            }
        });

        aminul_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent aminul_intent = new Intent(MainActivity.this, AmiActivity.class);
                startActivity(aminul_intent);
            }
        });

        sumona_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent sumona_intent = new Intent(MainActivity.this, SumiActivity.class);
                startActivity(sumona_intent);
            }
        });

        apple_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent apple_intent = new Intent(MainActivity.this, AppleActivity.class);
                startActivity(apple_intent);
            }
        });

        tripty_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent tripty_intent = new Intent(MainActivity.this, TriptyActivity.class);
                startActivity(tripty_intent);
            }
        });

        siza_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent siza_intent = new Intent(MainActivity.this, SizaActivity.class);
                startActivity(siza_intent);
            }
        });

        kabita_btn.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent kabita_intent = new Intent(MainActivity.this, KabitaActivity.class);
                startActivity(kabita_intent);
            }
        });

    }


    //Action Bar

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent aboutIntent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(aboutIntent);
                return true;
            case R.id.suggestion:
                Intent actionIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:itsmeaminul@gmail.com"));
                startActivity(actionIntent);
                return true;
            case R.id.exit:
                Toast.makeText(getApplicationContext(),"Good Bye!",Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
