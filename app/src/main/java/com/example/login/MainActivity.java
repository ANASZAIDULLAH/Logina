package com.example.login;

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


    public void openmainmenu(View view) {
        startActivity(new Intent(this,mainmenu.class));
    }

    public void opensignup(View view) {
       startActivity(new Intent(this,Signup.class));
    }
    public void openMainActivity(View view) {
    }


}