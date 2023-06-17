package com.example.basiclogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtPassword = findViewById(R.id.password);
        EditText txtUsername = findViewById(R.id.username);
        Button buttonLogin = findViewById(R.id.login);

        buttonLogin.setOnClickListener(v->{
            String password = txtPassword.getText().toString();
            String username = txtUsername.getText().toString();
            if(!username.isBlank() && !password.isBlank()) {
                Toast.makeText(this,"Te has loggeado correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}