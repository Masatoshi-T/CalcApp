package jp.techacademy.masatoshi.tashiro.calcapp;

import android.content.Intent;
import android.icu.math.BigDecimal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mEdit1;
    EditText mEdit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tplus = (Button)findViewById(R.id.plus);
        tplus.setOnClickListener(this);
        Button tminus = (Button)findViewById(R.id.minus);
        tminus.setOnClickListener(this);
        Button tmul = (Button)findViewById(R.id.mul);
        tmul.setOnClickListener(this);
        Button tdiv = (Button)findViewById(R.id.div);
        tdiv.setOnClickListener(this);

        mEdit1 = (EditText) findViewById(R.id.edit1);
        mEdit2 = (EditText) findViewById(R.id.edit2);
    }

    @Override
    public void onClick (View v) {
        if (v.getId() == R.id.plus){
            String i,t;
            i = mEdit1.getText().toString();
            t = mEdit2.getText().toString();
            intent(i,t,0);
        }
        else if (v.getId() == R.id.minus){
            String i,t;
            i = mEdit1.getText().toString();
            t = mEdit2.getText().toString();
            intent(i,t,1);
        }
        else if (v.getId() == R.id.mul){
            String i,t;
            i = mEdit1.getText().toString();
            t = mEdit2.getText().toString();
            intent(i,t,2);
        }
        else if (v.getId() == R.id.div){
            String i,t;
            i = mEdit1.getText().toString();
            t = mEdit2.getText().toString();
            intent(i,t,3);
        }
    }
    private void intent (String i, String  t, int mode){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", i);
        intent.putExtra("VALUE2", t);
        intent.putExtra("VALUE3", mode);
        startActivity(intent);
    }
}