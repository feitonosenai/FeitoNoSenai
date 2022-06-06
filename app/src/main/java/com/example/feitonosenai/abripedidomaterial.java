package com.example.feitonosenai;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class abripedidomaterial extends AppCompatActivity {
    Calendar mClndr;
    DatePickerDialog dpd;
    Button mBtnPickDate;

    TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abripedidomaterial);
        txtData = (TextView)findViewById(R.id.txtData);

        mBtnPickDate = findViewById(R.id.btnSeletorDeData);
        mBtnPickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClndr = Calendar.getInstance();
                int day = mClndr.get(Calendar.DAY_OF_MONTH);
                int month = mClndr.get(Calendar.MONTH);
                int year = mClndr.get(Calendar.YEAR);

                dpd = new DatePickerDialog(abripedidomaterial.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        txtData.setVisibility(View.VISIBLE);
                        txtData.setText(mDay + "/" + (mMonth+1) + "/" + mYear);
                    }
                }, year, month, day);
                dpd.show();
            }
        });
    }
}