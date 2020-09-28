package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText Number, Number2, Operasi;
        Button button;
        TextView textHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number    = findViewById(R.id.Number);
        Number2   = findViewById(R.id.Number2);
        Operasi   = findViewById(R.id.Operasi);
        button    = findViewById(R.id.tombol);
        textHasil =  findViewById(R.id.textHasil);


    }

    public void HasilOperasi(View v){
        double Hasil;

        int input1 = Integer.parseInt(Number.getText().toString());
        int input2 = Integer.parseInt(Number2.getText().toString());
        String aritmatika = Operasi.getText().toString();

        if (aritmatika.equals("+")){
            Hasil = input1 + input2;
            textHasil.setText(String.valueOf(Hasil));
        }else if (aritmatika.equals("-")){
            Hasil = input1 - input2;
            textHasil.setText(String.valueOf(Hasil));
        }else if (aritmatika.equals("*")){
            Hasil = input1 * input2;
            textHasil.setText(String.valueOf(Hasil));
        }else if (aritmatika.equals("/")){
            Hasil = input1 / input2;
            textHasil.setText(String.valueOf(Hasil));
        }else {
            textHasil.setText("OPERASI ARITMATIK TIDAK SESUAI");
        }
    }
}