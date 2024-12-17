package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUP extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.address);
        ed3=(EditText) findViewById(R.id.mobile);
        ed4=(EditText) findViewById(R.id.uname1);
        ed5=(EditText) findViewById(R.id.pass1);
        ed6=(EditText) findViewById(R.id.cnfrmPass);
        ed7=(EditText) findViewById(R.id.pin);
        b1=(Button) findViewById(R.id.ignUp);
        b2=(Button) findViewById(R.id.backLogin);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob1);
            }
        });
        
    }
}