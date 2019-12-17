package com.example.mad_assignment_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnsignup(View view){
        Intent intent = new Intent(this,Signup_Screen.class);
        startActivity(intent);
    }
    //btnlogin

    public void btnlogin(View view){
        Intent intent = new Intent(this,Login_Screen.class);
        startActivity(intent);
    }
}
