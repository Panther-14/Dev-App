package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextDegrees = findViewById(R.id.degrees);
        Button buttonConvert = findViewById(R.id.btn_Convert);
        TextView textViewFarenheit = findViewById(R.id.txt_Farenheit);

        buttonConvert.setOnClickListener(v->{
            String degrees = editTextDegrees.getText().toString();
            if(!degrees.isEmpty()) {
                double cDegrees = Double.parseDouble(degrees) * 1.8 + 32;
                String result = cDegrees +" °C";
                textViewFarenheit.setText(result);
            }else{
                Toast.makeText(this,"Debes ingresar un numero", Toast.LENGTH_SHORT).show();
            }
        });
    }


}