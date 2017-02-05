package jp.techacademy.masatoshi.tashiro.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.math.BigDecimal;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        int value3 = intent.getIntExtra("VALUE3",0);

        BigDecimal X = new BigDecimal(value1);
        BigDecimal Y = new BigDecimal(value2);
        BigDecimal Ans = new BigDecimal("0");

        TextView textView = (TextView) findViewById(R.id.ans);

        switch (value3) {
            case 0:
                Ans = X.add(Y);
                break;
            case 1:
                Ans = X.subtract(Y);
                break;
            case 2:
                Ans = X.multiply(Y).setScale(3,BigDecimal.ROUND_HALF_UP);
                break;
            case 3:
                Ans = X.divide(Y , 3 , BigDecimal.ROUND_HALF_UP);
                break;
        }
        textView.setText("計算結果：" + Ans.toString());
    }
}