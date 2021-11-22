package com.example.logindanregister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.logindanregister.model.SessionManager;

public class MainActivity extends AppCompatActivity {

    TextView etUsername, etName;
    SessionManager sessionManager;
    String username, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sessionManager = new SessionManager(MainActivity.this);
        if(!sessionManager.isLoggedIn()){
            moveToLogin();
        }

        etUsername = findViewById(R.id.etMainUsername);
        etName = findViewById(R.id.etMainName);

        username = sessionManager.getUserDetail().get(SessionManager.USERNAME);
        name = sessionManager.getUserDetail().get(SessionManager.NAME);

        etUsername.setText(username);
        etName.setText(name);

    }

    private void moveToLogin() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }


}