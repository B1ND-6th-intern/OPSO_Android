package kr.hs.dgsw.smartschool.opso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.techtown.opso_android.R;

public class SignInActivity extends AppCompatActivity {

    TextView btn_sign_up;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_sign_up = findViewById(R.id.btn_sign_up);
        btn_login = findViewById(R.id.btn_login);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoUp1fromIn = new Intent(getApplicationContext(), FirstSignUpActivity.class);
                startActivity(gotoUp1fromIn);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gotoMain);
                finish();
            }
        });
    }
}