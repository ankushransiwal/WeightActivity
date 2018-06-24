package com.example.ankush.weightactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {

    Button btnSubmit;
    TextView tvWelcome;
    EditText etWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        tvWelcome = (TextView)findViewById(R.id.tvWelcome);
        etWeight = (EditText)findViewById(R.id.etWeight);

        Intent i = getIntent();
        final String n = i.getStringExtra("n");

        tvWelcome.append(n);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String w = etWeight.getText().toString();
                Intent i = new Intent(Weight.this,Result.class);
                i.putExtra("w",w);
                i.putExtra("p",n);
                startActivity(i);
            }
        });

    }
}
