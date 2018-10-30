package com.sunny.www.responsebundle1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class subandback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subandback);

        Bundle bundle=getIntent().getExtras();
        TextView textView= (TextView)findViewById(R.id.textViewSinglresult);
        //textView.setText(bundle.getString("SingleName", "No data"));

    }

    @Override
    public void finish() {
        super.finish();
    }
}
