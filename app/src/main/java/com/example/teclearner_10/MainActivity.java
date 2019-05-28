package com.example.teclearner_10;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static int achievement = 0;
    public String testContent = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        //初始化方法
        initUI();
    }

    private void initUI() {
        findViewById(R.id.start).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start:
                //跳转到选择知识类别界面
                Intent intent =new Intent();
                intent.setClass(getApplicationContext(),konwledge_to_choose.class);
                this.startActivity(intent);
                break;
        }
    }
}
