package com.example.teclearner_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class konwledge_to_choose extends AppCompatActivity implements View.OnClickListener {

    private TextView achi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_to_choose);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }

        // 进入biology讲解知识界面
        init();


    }

    private void init() {
        String score = String.valueOf(MainActivity.achievement);
        achi = findViewById(R.id.achieve);
        achi.setText(score);

        findViewById(R.id.btn_biology).setOnClickListener(this);
        findViewById(R.id.btn_astronomy1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_biology:
                //跳转biology界面
                Intent intent1 =new Intent();
                intent1.setClass(getApplicationContext(), biologyActivity.class);
                this.startActivity(intent1);
                break;

            case R.id.btn_astronomy1:
                //跳转astronaut界面
                Intent intent2 =new Intent();
                intent2.setClass(getApplicationContext(), astronomyActivity.class);
                this.startActivity(intent2);
        }
    }
}
