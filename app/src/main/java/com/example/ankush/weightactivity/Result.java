package com.example.ankush.weightactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tvResult;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResult = (TextView)findViewById(R.id.tvResult);
        btnLogout = (Button)findViewById(R.id.btnLogout);

        Intent i = getIntent();
        final String n = i.getStringExtra("p");
        final String w = i.getStringExtra("w");
        //Double wt = Double.parseDouble(w);

        tvResult.append(n + ". You weight is "+w+" fucking kgs. Nigga, you're fat af");

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Result.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}
