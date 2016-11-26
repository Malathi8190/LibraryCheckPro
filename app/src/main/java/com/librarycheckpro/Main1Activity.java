package com.librarycheckpro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class Main1Activity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("https://goo.gl/images/h7bg4m")
              //  .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ex)
                .into(imageView);
    }
}