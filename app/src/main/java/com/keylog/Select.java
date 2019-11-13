package com.keylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Select extends AppCompatActivity {


    Button login, register;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        login = findViewById(R.id.buttonlog);
        register = findViewById(R.id.buttonreg);
        email = findViewById(R.id.email);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passEmail = email.getText().toString();
                Intent i = new Intent(Select.this, MainActivity.class);
                i.putExtra("key","login");
                i.putExtra("email",email.getText().toString());
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Select.this, MainActivity.class);
                i.putExtra("key","register");
                i.putExtra("email",email.getText().toString());
                startActivity(i);
            }
        });


    }

}
