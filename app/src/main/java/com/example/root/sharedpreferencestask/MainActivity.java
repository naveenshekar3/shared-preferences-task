package com.example.root.sharedpreferencestask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView countTv;
    private SharedPreferences mSp;
    private SharedPreferences.Editor mSpEdit;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTv=(TextView)findViewById(R.id.count_tv);

        mSp=getSharedPreferences("mysp",MODE_PRIVATE);
        mSpEdit=mSp.edit();

        count=mSp.getInt("number",0);
        countTv.setText(String.valueOf(count));


    }

    public void count(View view) {
        count++;
        countTv.setText(String.valueOf(count));
        mSpEdit.putInt("number",count);
        mSpEdit.commit();
    }

    public void goNext(View view) {
        Intent intent=new Intent(this,SecondScreen.class);
        startActivity(intent);
    }
}
