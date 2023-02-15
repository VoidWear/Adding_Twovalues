package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num1;
private EditText num2;
private Button add;
private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        add = (Button)findViewById(R.id.btnAdd);
        answer = (TextView) findViewById(R.id.txtResult);

      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int myNumber1 = Integer.parseInt(num1.getText().toString());
              int myNumber2 = Integer.parseInt(num2.getText().toString());
             //add operation
              int sum = myNumber1 + myNumber2;
              int sum1 = myNumber1 + myNumber2;
              //Display Result of the operation
              answer.setText("Answer :"+sum+" "+sum1);

          }
      });
      
    }
}