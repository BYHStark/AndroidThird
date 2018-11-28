package com.example.myclient;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Index extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button btn1 = (Button)findViewById(R.id.map);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this,Map.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button)findViewById(R.id.video);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this,ListActivity.class);
                startActivity(intent);
            }
        });

        Button btn3 = (Button)findViewById(R.id.personal);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Index.this,Personal.class);
                startActivity(intent);
            }
        });
    }
}