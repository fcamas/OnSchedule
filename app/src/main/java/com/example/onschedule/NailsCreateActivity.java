package com.example.onschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.onschedule.DB.NailDBHelper;

public class NailsCreateActivity extends AppCompatActivity {
    private Button mSaveButton;
    private NailDBHelper nailDBHelper;
    private CheckBox mS1;
    private CheckBox mS2;
    private CheckBox mS3;
    private CheckBox mS4;
    private EditText mFullName;
    private EditText mEmail;
    private EditText mPhoneNumber;
    private EditText mTime;
    private RadioButton mRadioam;
    private RadioButton mRadiopm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nails_create);
        mS1 = findViewById(R.id.s_1);
        mS2 = findViewById(R.id.s_2);
        mS3 = findViewById(R.id.s_3);
        mS4 = findViewById(R.id.s_4);

        nailDBHelper = new NailDBHelper(NailCreateActivity.this);
        mSaveButton = findViewById(R.id.btn_finish);
        mFullName = findViewById(R.id.txt_full_name);
        mEmail = findViewById(R.id.txt_email);
        mPhoneNumber = findViewById((R.id.txt_phone));
        mTime = findViewById(R.id.txt_time);
        mRadioam = findViewById(R.id.radio_am);
        mRadiopm = findViewById((R.id.radio_pm));

        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calculatePrice(mS1,mS2,mS3,mS4);
                String fullName = mFullName.getText().toString();
                String  email = mEmail.getText().toString();
                String phoneNumber = mPhoneNumber.getText().toString();
                String service = getService(mS1,mS2,mS3,mS4);
                String myTime = getTime(mTime,mRadioam,mRadiopm);
                
                Intent intent = new Intent(NailCreateActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}