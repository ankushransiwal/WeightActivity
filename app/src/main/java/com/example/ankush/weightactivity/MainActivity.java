package com.example.ankush.weightactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etName, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        etName = (EditText)findViewById(R.id.etName);
        etPassword = (EditText)findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = etName.getText().toString();
                String p = etPassword.getText().toString();
                String pass = "superpc";
                if(p.equals(pass))
                {
                    Intent i = new Intent(MainActivity.this,Weight.class);
                    i.putExtra("n",n);
                    startActivity(i);
                }
                else{
                    etPassword.setError("The Password is incorrect");
                    return;
                }
            }
        });

    }
}
