package com.example.appfrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAccount(View view) {
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }


}