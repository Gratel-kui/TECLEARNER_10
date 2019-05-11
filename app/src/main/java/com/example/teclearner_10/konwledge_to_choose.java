package com.example.teclearner_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class konwledge_to_choose extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_to_choose);

        // 进入biology讲解知识界面
        init();
    }

    private void init() {
        findViewById(R.id.btn_biology).setOnClickListener(this);

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
        }
    }
}
