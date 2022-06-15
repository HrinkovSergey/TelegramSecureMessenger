package com.home.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    private EditText editTextUserPassword;
    private Button buttonLogin;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);
        editTextUserPassword = findViewById(R.id.edit_text_user_password);
        buttonLogin = findViewById(R.id.button_login);
        buttonRegister = findViewById(R.id.button_register);
        setUpButtonLogin();
        setUpButtonRegister();
    }

    private void setUpButtonLogin() {
        // Todo create separate class with implementation of View
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userPasswordValue = editTextUserPassword.getText().toString();
                if (userPasswordValue.trim().equals("")) {
                    Toast.makeText(ActivityLogin.this, R.string.no_user_input, Toast.LENGTH_LONG).show();
                }
                else {
                    System.out.println(userPasswordValue);
                }
            }
        });
    }

    private void setUpButtonRegister() {
        // Todo create separate class with implementation of View
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityRegister();
            }
        });
    }

    private void openActivityRegister() {
        Intent intent = new Intent(this, ActivityRegister.class);
        startActivity(intent);
    }
}