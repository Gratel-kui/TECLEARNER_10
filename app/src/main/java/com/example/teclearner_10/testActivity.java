package com.example.teclearner_10;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class testActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnA;
    private Button btnB;
    private Button btnC;
    private Button btnD;
    private int[] right;
    private String[][] qa;
    private TextView question;
    private int index;
    private int num;
    private int score;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        //初始化控件
        initView();
        //初始化数据
        initData();
/*,
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
*/
    }

    private void initData() {

        right = new int[]{1, 3, 2, 4,4,4,3,1,2,1};
        qa = new String[][]{{"下列哪个消化器官分泌盐酸？", "胃", "胰", "小肠", "口腔"},
                {"下列选项中，不仅仅是消化道的是", "器官", "咽", "口腔", "直肠"},
                {"消化系统总的来说由消化腺和什么组成？", "消化器官", "消化道", "消化液", "肠胃"},
                {"消化系统和呼吸系统公用的部分是：","小肠","胰","胃","食管"},
                {"胃中的ph在多少左右","7.3-8.3","11.5-12.3","2.6-3.3","0.9-1.5"},
                {"食物在身体的哪个部位变为糊状混合物？","十二指肠","小肠","直肠","胃"},
                {"唾液腺有几对","1","2","3","4"},
                {"消化道的起始部分是：","口腔","胃","气管","食管"},
                {"与解毒功能有关消化器官的是：","肾","肝","胰","腮"},
                {"消化系统中吸收铁的主要部分是","十二指肠","小肠","盲肠","胃"},
                {"","","","",""},};
        question.setText(qa[0][0]);
        btnA.setText(qa[0][1]);
        btnB.setText(qa[0][2]);
        btnC.setText(qa[0][3]);
        btnD.setText(qa[0][4]);

        num = qa.length;
        index = 0;
        score = 0;

        new AlertDialog.Builder(testActivity.this)
                .setTitle("read_me")
                .setMessage("本次测试共有10道题目，答对6道即为合格。")
                .setPositiveButton("OK",null)
                .show();



    }

    private void initView() {
        btnA = findViewById(R.id.A);
        btnB = findViewById(R.id.B);
        btnC = findViewById(R.id.C);
        btnD = findViewById(R.id.D);
        question = findViewById(R.id.TEXT);


        findViewById(R.id.A).setOnClickListener(this);
        findViewById(R.id.B).setOnClickListener(this);
        findViewById(R.id.C).setOnClickListener(this);
        findViewById(R.id.D).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.A:
                if(right[index] == 1){
                    score++;

                }
                if(index == num-1){
                    onBackPressed();
                }
                break;
            case R.id.B:
                if(right[index] == 2){
                    score++;

                }
                if(index == num-1){
                    onBackPressed();
                }
                break;
            case R.id.C:
                if(right[index] == 3){
                    score++;
                    break;
                }
                if(index == num-1){
                    onBackPressed();
                }
                break;
            case R.id.D:
                if(right[index] == 4){
                    score++;
                    break;
                }
                if(index == num-1){
                    onBackPressed();
                }
                break;
        }
        if(index<num) {
            index++;
        }
        if(index == num-1 ){
            String messages = new String();
            if(score >= 6){
                MainActivity.achievement ++;
                messages = "恭喜您通过测试，您的成绩是："+score;
            }
            else{
                messages = "您的成绩是"+score+",您没有通过测试。";
            }
            new AlertDialog.Builder(testActivity.this)
                    .setTitle("read_me")
                    .setMessage(messages)
                    .setPositiveButton("OK",null)
                    .show();

        }
        upData();


    }



    private void upData() {
        question.setText(qa[index][0]);
        btnA.setText(qa[index][1]);
        btnB.setText(qa[index][2]);
        btnC.setText(qa[index][3]);
        btnD.setText(qa[index][4]);
    }
}
