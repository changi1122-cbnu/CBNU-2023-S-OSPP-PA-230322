package net.studio1122.p4_1_simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    TextView textResult;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = Double.parseDouble(edit1.getText().toString()) + Double.parseDouble(edit2.getText().toString());
                textResult.setText("계산 결과 : " + result);
            }
        });

        btnSub = (Button) findViewById(R.id.BtnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = Double.parseDouble(edit1.getText().toString()) - Double.parseDouble(edit2.getText().toString());                textResult.setText("계산 결과 : " + result);
            }
        });

        btnMul = (Button) findViewById(R.id.BtnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = Double.parseDouble(edit1.getText().toString()) * Double.parseDouble(edit2.getText().toString());
                textResult.setText("계산 결과 : " + result);
            }
        });

        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().equals("") || edit2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (Double.parseDouble(edit2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double result = Double.parseDouble(edit1.getText().toString()) / Double.parseDouble(edit2.getText().toString());
                textResult.setText("계산 결과 : " + result);
            }
        });

    }
}