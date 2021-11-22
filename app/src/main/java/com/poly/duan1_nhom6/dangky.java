package com.poly.duan1_nhom6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dangky extends AppCompatActivity {
    Intent intent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
    }

    public void checkDangnhap(View view){
        intent = new Intent(dangky.this, Login.class);
        startActivity(intent);
    }
}