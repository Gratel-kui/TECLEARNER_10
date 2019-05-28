package com.example.teclearner_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class astronomyActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astronomy);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        init();
    }

    private void init() {
        findViewById(R.id.text_starry_sky).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_starry_sky:
                Intent intent1 = new Intent();
                intent1.setClass(getApplicationContext(), webActivity.class);
                this.startActivity(intent1);
                break;
        }
    }
}
