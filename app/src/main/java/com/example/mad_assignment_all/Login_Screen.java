package com.example.mad_assignment_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);
    }

    public void btnlogin(View view){
        Intent intent = new Intent(this,Image_Screen2.class);
        startActivity(intent);
    }
}
