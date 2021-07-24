package org.techtown.opso_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignUp2 extends AppCompatActivity {

    Button btn_SignUp;
    Button btn_cerEmail;
    ImageButton btn_Sign_Up1_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        btn_cerEmail = findViewById(R.id.btn_cerEmail);
        btn_Sign_Up1_Back = findViewById(R.id.btn_Sign_Up1_Back);
        btn_SignUp = findViewById(R.id.btn_SignUp);
        
        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSignIn = new Intent(getApplicationContext(), Sign_in.class);
                startActivity(gotoSignIn);
            }
        });

        btn_Sign_Up1_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoSignUp1Intent = new Intent(getApplicationContext(), SignUp1.class);
                startActivity(gotoSignUp1Intent);
            }
        });
        
        btn_cerEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp2.this, "이메일 인증 입니다!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}