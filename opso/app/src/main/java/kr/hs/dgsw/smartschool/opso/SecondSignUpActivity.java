package kr.hs.dgsw.smartschool.opso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondSignUpActivity extends AppCompatActivity {

    Button btn_SignUp;
    Button btn_cerEmail;
    ImageButton btn_Sign_Up1_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sign_up);

        btn_cerEmail = findViewById(R.id.btn_cerEmail);
        btn_Sign_Up1_Back = findViewById(R.id.btn_Sign_Up1_Back);
        btn_SignUp = findViewById(R.id.btn_SignUp);
        
        btn_SignUp.setOnClickListener(v -> {
            Intent gotoSignIn = new Intent(getApplicationContext(), SignInActivity.class);
            startActivity(gotoSignIn);
        });

        btn_Sign_Up1_Back.setOnClickListener(v -> finish());

        // TODO : 테스트 입니다
        btn_cerEmail.setOnClickListener(v -> Toast.makeText(SecondSignUpActivity.this, "이메일 인증 입니다!", Toast.LENGTH_SHORT).show());
    }
}