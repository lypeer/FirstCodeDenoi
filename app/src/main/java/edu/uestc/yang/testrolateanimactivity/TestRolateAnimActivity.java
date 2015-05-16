package edu.uestc.yang.testrolateanimactivity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class TestRolateAnimActivity extends ActionBarActivity {


    MyImageView jianjie;
    MyImageView zhanshi;
    MyImageView guanzhu;
    MyImageView jiao;
    MyImageView tese;

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        jianjie = (MyImageView)findViewById(R.id.c1);
        jiao = (MyImageView)findViewById(R.id.c2);
        zhanshi = (MyImageView)findViewById(R.id.c3);
        tese = (MyImageView)findViewById(R.id.c4);
        guanzhu = (MyImageView)findViewById(R.id.c6);
        jianjie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TestRolateAnimActivity.this , Jianjie.class);
                startActivity(intent);

            }
        });

    }
}

