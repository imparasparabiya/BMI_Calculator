package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextInputEditText txtage, txtweight, txtheight;
    Button btnsubmit;
    TextView txtbmi, txtans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtage = findViewById(R.id.txtage);
        txtweight = findViewById(R.id.txtweight);
        txtheight = findViewById(R.id.tetheight);
        txtbmi = findViewById(R.id.txtbmi);
        txtans = findViewById(R.id.txtans);
        btnsubmit = findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double age = Integer.parseInt(txtage.getText().toString());
                double weight = Integer.parseInt(txtweight.getText().toString());
                double height = Integer.parseInt(txtheight.getText().toString());
                double ans;

                ans = weight / ((height / 100) * (height / 100));
                Toast.makeText(MainActivity.this,"Succussfully",Toast.LENGTH_LONG).show();
                txtans.setText(new DecimalFormat().format(ans));

            }
        });
    }
}