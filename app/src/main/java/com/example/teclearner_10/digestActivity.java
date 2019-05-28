package com.example.teclearner_10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class digestActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_digest);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
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
        findViewById(R.id.xiaohuaxitong).setOnClickListener(this);
        findViewById(R.id.btn_digest_test).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nose: new AlertDialog.Builder(digestActivity.this)
                             .setTitle("鼻腔")
                             .setMessage("鼻腔主要通过嗅觉，辅助消化。")
                             .setPositiveButton("OK",null)
                             .show();
                break;
            case R.id.kouqiang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("口腔")
                    .setMessage("口腔（oral cavity）是消化道的起始部分\n" +
                            "口腔的消化作用主要体现在:\n" +
                            "1. 牙齿的咀嚼\n" +
                            "2. 唾液的消化")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.yan:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("咽")
                    .setMessage("咽：指口腔、鼻腔之后，食管以上的空腔处。\n咽主要的消化作用是食物和水的通道（和呼吸系统共用的部分）\n")
                    .setPositiveButton("OK",null)
                    .show();
                break;

            case R.id.qiguan:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("气管")
                    .setMessage("\n气管虽然也是消化系统的一部分，但是没有消化功能，也是食物水的通道")
                    .setPositiveButton("OK",null)
                    .show();
                break;

            case R.id.saixian:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("腮腺")
                    .setMessage("唾液腺有3对，腮腺、舌下腺和颌下腺，其中最大的一对是腮腺。\n" +
                            "主要起到分泌唾液的作用，是消化腺。")
                    .setPositiveButton("OK",null)
                    .show();
                break;

            case R.id.gan:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("肝")
                    .setMessage("肝（liver），人体脏器名，五脏之一。是脊椎动物身体内以代谢功能为主的一个器官，并在身体里面充分扮演着去氧化，储存肝糖，分泌性蛋白质的合成等等。肝脏也制造消化系统中之胆汁\n" +
                            "具体的功能上：\n" +
                            "1.  a.维生素代谢：如A、B、C、D和K的合成与储存均与肝脏密切相关。\n" +
                            "    b.激素代谢:肝脏参与激素的灭活。\n" +
                            "    c.肝脏通过神经及体液的作用参与水的代谢过程，抵消脑下垂体后叶抗利尿激素的作用，以保持正常的排尿量。肝脏还有调酸碱平衡及矿物质代谢的作用，又是重要的热能供给器官。\n" +
                            "2.分泌和排泄胆汁的功能：胆汁可以促进脂肪在小肠内的消化和吸收。\n" +
                            "3.解毒功能：外来的或体内代谢产生的有毒物质，均要在肝脏解毒变为无毒的或溶解度大的物质，随胆汁或尿液排出体外。\n" +
                            "4.有关血液方面的功能：\n" +
                            "    a.胎儿时肝脏为主要造血器官，至成人时由骨髓取代.\n" +
                            "    b.几乎所有的凝血因子都由肝脏制造。\n" +
                            "    c.在人体凝血和抗凝两个系统的动态平衡中，肝脏起着重要的调节作用。")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.wei:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("胃")
                    .setMessage("胃是食道的扩大部分,位于膈下,上接食道,下通小肠。\n" +
                            "胃是食物的贮运场和加工厂，是食物消化的主要器官。\n" +
                            "1.胃能分泌大量强酸性的胃液(pH0.9～1.5)，胃液的主要成分是：能分解蛋白质的胃蛋白酶、能促进蛋白质消化的盐酸和具有保护胃粘膜不被自身消化的粘液。\n" +
                            "经过胃的蠕动搅拌和混合，加上胃内消化液里大量酶的作用，最后使食物变成粥状的混合物。")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.yi:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("胰")
                    .setMessage("胰是人体内仅次于肝的大腺体\n" +
                            "胰腺由外分泌部和内分泌部两部分组成。\n" +
                            "1.外分泌部分泌胰液，含有胰蛋白酶、胰脂肪酶、胰淀粉酶和核糖核酸酶等多种消化酶，对消化食物起重要作用。\n" +
                            "2.内分泌腺部是散在于外分泌部之间的细胞团，称胰岛，它分泌的激素，进入血液或淋巴，主要参与糖代谢的调节。")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.shierchang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("十二指肠")
                    .setMessage("十二指肠介于胃与空肠之间,由于相当于十二个横指并列的长度而得名,全长约25cm。\n" +
                            "它既接受胃液，又接受胰液和胆汁的注入，所以十二指肠的消化功能十分重要。\n" +
                            "食物经过胃的物理化学消化，到十二指肠，再经过其理化作用，吸收食物营养成分。")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.shengjiechang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("升结肠")
                    .setMessage("升结肠的功能是推动食物消化吸收。\n")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.jiangjiechang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("降结肠")
                    .setMessage("消化道\n")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.shiguan:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("食管")
                    .setMessage("食管：上接咽部，下与胃的贲门相连的一条细长管道，是饮食入胃的通道，亦称“食道”。\n")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.xiaochang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("小肠")
                    .setMessage("小肠位于腹中，上端接幽门与胃相通，下端通过阑门与大肠相连，是食物消化吸收的主要场所。（是消化道）" +
                            "小肠的组织结构学特点为小肠的吸收创造了良好的条件，小肠的生理功能表现毛小肠的运动、分泌、消化及吸收等方面，并且与药物代谢密切相关。如小肠平滑肌的各种形式的运动可以完成对食糜的研磨、混合、搅拌等机械消化，小肠腺分泌的小肠液与小肠内胆汁、胰液一起完成食糜的化学消化，小肠粘膜分泌内分散存在有许多内分泌细胞，可分泌多种消化道激素，如促胰液素、胆囊收缩素、抑胃肽和胃动素等，它们对胃肠运动和分泌有重要的调节作用。\n")
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.mangchang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("盲肠")
                    .setMessage("盲肠：大肠的起始段，也是大肠中最短的一段(也是消化道)\n")
                            .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.lanwei:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("阑尾")
                    .setMessage("阑尾在腹部的右下方，位于盲肠与回肠之间，它是细长而弯曲的盲管，远端闭锁。\n" +
                            "阑尾在胎儿和青少年时期起有重要的作用。" )
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.zhichang:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("直肠")
                    .setMessage("直肠为消化管的最末一段。\n" )
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.xiaohuaxitong:    new AlertDialog.Builder(digestActivity.this)
                    .setTitle("直肠")
                    .setMessage("直肠为消化管的最末一段。\n" )
                    .setPositiveButton("OK",null)
                    .show();
                break;
            case R.id.btn_digest_test:
                Intent intent1 =new Intent();
                intent1.setClass(getApplicationContext(), testActivity.class);
                this.startActivity(intent1);
                break;



        }
    }
}
