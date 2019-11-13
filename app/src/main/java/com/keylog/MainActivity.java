package com.keylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
    btnalf, btnbaa, btntaa, btnthaa, btngeem, btn7aa, btnkhaa, btndal, btnthal, btnraa,
    btnseen, btnsheen, btnsaad, btndaad, btntah, btnzah,btnzay, btnain, btnghain, btnfaa,
    btnqaaf, btnkaaf, btnlaam, btnmeem, btnnoon, btnhaa, btnwaw, btnyaa, btnSpace, btnWawHamza,
    btnyaa2, btnhamzaa, btntaa2 ,action;

    public TextView textViewEmail;
    public TextView textViewAuth;

    String btnText = "";
    String email = "";

    long press;
    long release;
    long keyHold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String languageToLoad  = "ar"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        setContentView(R.layout.activity_main);


        btnText = getIntent().getStringExtra("key");
        email = getIntent().getStringExtra("email");


        textViewEmail = findViewById(R.id.textViewEmail);
        textViewAuth = findViewById(R.id.textViewAuth);

        action = findViewById(R.id.action);
        action.setText(btnText);

        textViewEmail.setText(email);


        btn1 =  findViewById(R.id.button1);
        btn2 =  findViewById(R.id.button2);
        btn3 =  findViewById(R.id.button3);
        btn4 =  findViewById(R.id.button4);
        btn5 =  findViewById(R.id.button5);
        btn6 =  findViewById(R.id.button6);
        btn7 =  findViewById(R.id.button7);
        btn8 =  findViewById(R.id.button8);
        btn9 =  findViewById(R.id.button9);
        btn10 = findViewById(R.id.button0);
        btnalf = findViewById(R.id.buttonalf);
        btnbaa = findViewById(R.id.buttonbaa);
        btntaa = findViewById(R.id.buttontaa);
        btnthaa = findViewById(R.id.buttonthaa);
        btngeem = findViewById(R.id.buttongeem);
        btn7aa = findViewById(R.id.button7aa);
        btnkhaa = findViewById(R.id.buttonkhaa);
        btndal = findViewById(R.id.buttondal);
        btnthal = findViewById(R.id.buttonthal);
        btnraa = findViewById(R.id.buttonraa);
        btnzay = findViewById(R.id.buttonzay);
        btnseen = findViewById(R.id.buttonseen);
        btnsheen = findViewById(R.id.buttonsheen);
        btnsaad = findViewById(R.id.buttonsaad);
        btndaad = findViewById(R.id.buttondaad);
        btntah = findViewById(R.id.buttontah);
        btnzah = findViewById(R.id.buttonzah);
        btnain = findViewById(R.id.buttonain);
        btnghain = findViewById(R.id.buttonghain);
        btnfaa = findViewById(R.id.buttonfaa);
        btnqaaf = findViewById(R.id.buttonqaaf);
        btnkaaf = findViewById(R.id.buttonkaaf);
        btnlaam = findViewById(R.id.buttonlaam);
        btnmeem = findViewById(R.id.buttonmeem);
        btnnoon = findViewById(R.id.buttonnoon);
        btnhaa = findViewById(R.id.buttonhaa);
        btnwaw = findViewById(R.id.buttonwaw);
        btnyaa = findViewById(R.id.buttonyaa);
        btnSpace = findViewById(R.id.buttonSpace);
        btnWawHamza = findViewById(R.id.buttonwawhamza);
        btnyaa2 = findViewById(R.id.buttonyaa2);
        btnhamzaa = findViewById(R.id.buttonhamza);
        btntaa2 = findViewById(R.id.buttontaa2);


        btn1.setOnTouchListener(this);
        btn2.setOnTouchListener(this);
        btn3.setOnTouchListener(this);
        btn4.setOnTouchListener(this);
        btn5.setOnTouchListener(this);
        btn6.setOnTouchListener(this);
        btn7.setOnTouchListener(this);
        btn8.setOnTouchListener(this);
        btn9.setOnTouchListener(this);
        btn10.setOnTouchListener(this);
        btnalf.setOnTouchListener(this);
        btnbaa.setOnTouchListener(this);
        btntaa.setOnTouchListener(this);
        btnthaa.setOnTouchListener(this);
        btngeem.setOnTouchListener(this);
        btn7aa.setOnTouchListener(this);
        btnkhaa.setOnTouchListener(this);
        btndal.setOnTouchListener(this);
        btnthal.setOnTouchListener(this);
        btnraa.setOnTouchListener(this);
        btnzay.setOnTouchListener(this);
        btnseen.setOnTouchListener(this);
        btnsheen.setOnTouchListener(this);
        btnsaad.setOnTouchListener(this);
        btndaad.setOnTouchListener(this);
        btntah.setOnTouchListener(this);
        btnzah.setOnTouchListener(this);
        btnain.setOnTouchListener(this);
        btnghain.setOnTouchListener(this);
        btnfaa.setOnTouchListener(this);
        btnqaaf.setOnTouchListener(this);
        btnkaaf.setOnTouchListener(this);
        btnlaam.setOnTouchListener(this);
        btnmeem.setOnTouchListener(this);
        btnnoon.setOnTouchListener(this);
        btnhaa.setOnTouchListener(this);
        btnwaw.setOnTouchListener(this);
        btnyaa.setOnTouchListener(this);
        btnSpace.setOnTouchListener(this);
        btnWawHamza.setOnTouchListener(this);
        btnyaa2.setOnTouchListener(this);
        btnhamzaa.setOnTouchListener(this);
        btntaa2.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            Button b = (Button) v;
            String display = b.getText().toString();

                textViewAuth.append(display);
                press = System.currentTimeMillis();


            System.out.println("The keypress time is " + press);
        }else if (event.getAction() == MotionEvent.ACTION_UP){
            release = System.currentTimeMillis();
            System.out.println("The keyRelease time is " + release);
            keyHold = release - press;
            System.out.println("The keyHold time is " + keyHold);
        }
        return false;
    }



}
