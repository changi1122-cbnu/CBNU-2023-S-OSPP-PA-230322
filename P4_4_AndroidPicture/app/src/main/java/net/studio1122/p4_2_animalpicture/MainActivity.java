package net.studio1122.p4_2_animalpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView subtitle;
    Switch switchAgree;
    RadioGroup radioGroup;
    Button btnOK, btnReset;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        switchAgree = findViewById(R.id.SwitchAgree);
        subtitle = (TextView) findViewById(R.id.Subtitle);
        radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        btnOK = findViewById(R.id.BtnOK);
        btnReset = findViewById(R.id.BtnReset);
        imgPet = findViewById(R.id.ImgPet);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (switchAgree.isChecked()) {
                    subtitle.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else {
                    subtitle.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(radioGroup.getCheckedRadioButtonId()) {
                    case R.id.Radio10:
                        imgPet.setImageResource(R.drawable.android10);
                        break;
                    case R.id.Radio11:
                        imgPet.setImageResource(R.drawable.android11);
                        break;
                    case R.id.Radio12:
                        imgPet.setImageResource(R.drawable.android12);
                        break;
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finishAffinity();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAgree.setChecked(false);
                radioGroup.clearCheck();
            }
        });
    }
}