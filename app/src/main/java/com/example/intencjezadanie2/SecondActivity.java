package com.example.intencjezadanie2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        String value1 = getIntent().getStringExtra("EXTRA_VALUE1");
        String value2 = getIntent().getStringExtra("EXTRA_VALUE2");

        textView1.setText(value1);
        textView2.setText(value2);
    }
}
