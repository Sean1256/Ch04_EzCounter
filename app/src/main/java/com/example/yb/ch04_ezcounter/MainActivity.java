package com.example.yb.ch04_ezcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txv;
    Button btn;
    static int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        btn = (Button) findViewById(R.id.btn);



    }

    /*onclick的传入值必须要有（view v）*/
    public void OnClick(View v) {

        a = ++a;
        txv.setText(""+a);

    }

}
