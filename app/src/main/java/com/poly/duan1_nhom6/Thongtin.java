package com.poly.duan1_nhom6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thongtin extends AppCompatActivity {
    Button btnChinhSua;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin);
    }
    public void ChinhSua(View view){
        intent = new Intent(Thongtin.this, EditThongTin.class);
        startActivity(intent);
    }
}