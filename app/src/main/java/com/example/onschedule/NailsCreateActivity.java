package com.example.onschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class NailsCreateActivity extends AppCompatActivity {
    private Button mSaveButton;
    private CheckBox mS1;
    private CheckBox mS2;
    private CheckBox mS3;
    private CheckBox mS4;
    private EditText mFullName;
    private EditText mEmail;
    private EditText mPhoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nails_create);
    }
}