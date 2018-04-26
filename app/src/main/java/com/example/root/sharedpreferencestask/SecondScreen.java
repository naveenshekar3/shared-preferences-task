package com.example.root.sharedpreferencestask;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends Activity {

    private TextView textView;
    private SharedPreferences oldSp;
    private int incNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        textView=(TextView)findViewById(R.id.textView);

        oldSp=getSharedPreferences("mysp",MODE_PRIVATE);
        incNum=oldSp.getInt("number",0);
        textView.setText(String.valueOf(incNum));
    }
}
