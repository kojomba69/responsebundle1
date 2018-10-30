package com.sunny.www.test;
//전혀안돼

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonresult);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextSingle=findViewById(R.id.editTextSingle);
        String editTextSingleString = editTextSingle.getText().toString();
        EditText editTextBundle = findViewById(R.id.editTextbundle);
        String editTextBundleString = editTextBundle.getText().toString();

        Bundle bundle =new Bundle();
        bundle.putString("SingleName", editTextSingleString);
        Intent intent = new Intent(this, subandback.class);
        intent.putExtras(bundle);
        startActivityForResult(intent,Activity.RESULT_FIRST_USER);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
