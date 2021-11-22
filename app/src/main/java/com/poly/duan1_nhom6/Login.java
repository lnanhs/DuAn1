package com.poly.duan1_nhom6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edUsername, edPassword;
    Button btnLogin;
    CheckBox check;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
    public void checkLogin(View view)
    {
        String u = edUsername.getText().toString();
        String p = edPassword.getText().toString();
        if (u.equals("fpt")&& p.equals("123")){
            Toast.makeText(getApplicationContext(), "Đăng nhập thành công ",Toast.LENGTH_LONG).show();
            finish();
        }
        else if( u.equals("")&& p.equals("")){
            Toast.makeText(getApplicationContext(), "Bạn chưa đăng kí tài khoản ?", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(getApplicationContext(), "Đăng nhập thất bại ",Toast.LENGTH_LONG).show();

        }

    }
    public void resetForm(View view)
    {
        edUsername.setText("");
        edPassword.setText("");
    }
    public void checkDangky(View view){
        intent = new Intent(Login.this, dangky.class);
        startActivity(intent);
    }
    }
