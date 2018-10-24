package com.firstapp.ray.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    private AutoCompleteTextView email;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (AutoCompleteTextView) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);

        Button email_sign_in_button = (Button) findViewById(R.id.email_sign_in_button);
        email_sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Semail = String.valueOf(email.getText());
                String Spassword = String.valueOf(Password.getText());

                if(Semail.equals("admin@gmail.com") && Spassword.equals("admin")){

                    Toast.makeText(LoginActivity.this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(LoginActivity.this, "Gagal Login, Cek Email atau Password Anda", Toast.LENGTH_SHORT).show();

                }
            }
        });

        Button sign_up = (Button) findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}

