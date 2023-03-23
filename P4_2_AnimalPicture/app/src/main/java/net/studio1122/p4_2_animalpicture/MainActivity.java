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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView subtitle;
    CheckBox checkAgree;
    RadioGroup radioGroup;
    RadioButton radioDog, radioCat, radioRabbit;
    Button btnOK;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        checkAgree = findViewById(R.id.CheckAgree);
        subtitle = (TextView) findViewById(R.id.Subtitle);
        radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        radioDog = findViewById(R.id.RadioDog);
        radioCat = findViewById(R.id.RadioCat);
        radioRabbit = findViewById(R.id.RadioRabbit);
        btnOK = findViewById(R.id.BtnOK);
        imgPet = findViewById(R.id.ImgPet);

        checkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkAgree.isChecked()) {
                    subtitle.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else {
                    subtitle.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(radioGroup.getCheckedRadioButtonId()) {
                    case R.id.RadioDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RadioCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RadioRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplication(), "동물을 먼저 선택하세요.",
                                Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}