package kr.hs.dgsw.smartschool.opso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.techtown.opso_android.R;

public class SecondSignUpActivity extends AppCompatActivity {

    Button btn_SignUp;
    Button btn_cerEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sign_up);

        btn_cerEmail = findViewById(R.id.btn_cerEmail);
        btn_SignUp = findViewById(R.id.btn_SignUp);
        
        btn_SignUp.setOnClickListener(v -> {
            Intent gotoSignIn = new Intent(getApplicationContext(), SignInActivity.class);
            startActivity(gotoSignIn);
            finish();
        });
        
        btn_cerEmail.setOnClickListener(v -> Toast.makeText(SecondSignUpActivity.this, "이메일 인증 입니다!", Toast.LENGTH_SHORT).show());
    }
}