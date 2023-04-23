package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView baidu = findViewById(R.id.baidu);
        baidu.setMovementMethod(LinkMovementMethod.getInstance());
//        baidu.setLinkTextColor(Color.YELLOW);

        TextView bilibili = findViewById(R.id.bilibili);
        bilibili.setMovementMethod(LinkMovementMethod.getInstance());
//        bilibili.setLinkTextColor(Color.YELLOW);

        TextView qq = findViewById(R.id.qq);
        qq.setMovementMethod(LinkMovementMethod.getInstance());
//        qq.setLinkTextColor(Color.YELLOW);

        TextView music163 = findViewById(R.id.music163);
        music163.setMovementMethod(LinkMovementMethod.getInstance());
//        music163.setLinkTextColor(Color.YELLOW);


        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://weibo.com"));
                startActivity(intent);
            }
        });
    }
}