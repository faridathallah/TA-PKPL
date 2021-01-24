package com.example.chotabim;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    protected Cursor cursor;
    TextView login, daftar;
    EditText user, pass;
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);

        login = (Button) findViewById(R.id.login);
        daftar = (Button) findViewById(R.id.daftar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(com.example.chotabim.Login.this, com.example.chotabim.Menu.class);
                startActivity(inte);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(com.example.chotabim.Login.this, com.example.chotabim.Daftar.class);
                startActivity(inte);
            }
        });
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}