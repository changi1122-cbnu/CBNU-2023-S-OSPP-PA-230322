package net.studio1122.week3_movingpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgTop, imgBottom;
    Button btnTop, btnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이미지 번갈아 보여주기");

        imgTop = findViewById(R.id.imgTop);
        imgBottom = findViewById(R.id.imgBottom);
        btnTop = findViewById(R.id.btnTop);
        btnBottom = findViewById(R.id.btnBottom);


        imgTop.setImageResource(R.drawable.me);

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgTop.setImageResource(R.drawable.me);
                imgBottom.setImageResource(android.R.color.transparent);
            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgTop.setImageResource(android.R.color.transparent);
                imgBottom.setImageResource(R.drawable.me);
            }
        });
    }
}