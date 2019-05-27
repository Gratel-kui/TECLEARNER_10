package com.example.teclearner_10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class digestActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_digest);

        init();
    }

    private void init() {
        findViewById(R.id.nose).setOnClickListener(this);
        findViewById(R.id.kouqiang).setOnClickListener(this);
        findViewById(R.id.yan).setOnClickListener(this);
        findViewById(R.id.qiguan).setOnClickListener(this);
        findViewById(R.id.saixian).setOnClickListener(this);
        findViewById(R.id.shiguan).setOnClickListener(this);
        findViewById(R.id.gan).setOnClickListener(this);
        findViewById(R.id.wei).setOnClickListener(this);
        findViewById(R.id.yi).setOnClickListener(this);
        findViewById(R.id.shierchang).setOnClickListener(this);
        findViewById(R.id.hengjiechang).setOnClickListener(this);
        findViewById(R.id.shengjiechang).setOnClickListener(this);
        findViewById(R.id.jiangjiechang).setOnClickListener(this);
        findViewById(R.id.xiaochang).setOnClickListener(this);
        findViewById(R.id.mangchang).setOnClickListener(this);
        findViewById(R.id.zhichang).setOnClickListener(this);
        findViewById(R.id.lanwei).setOnClickListener(this);
        findViewById(R.id.yizhuangjiechang).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nose: new AlertDialog.Builder(digestActivity.this)
                             .setTitle("鼻腔")
                             .setMessage("内容")
                             .setPositiveButton("OK",null)
                             .show();
                break;
        }
    }
}
