package kr.hs.dgsw.smartschool.opso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstSignUpActivity extends AppCompatActivity {

    Button btn_Goto_SignUp2;
    ImageButton btn_Sign_In_Back;

    String[] spin_grade = { "1학년", "2학년", "3학년" };
    String[] spin_class = { "1반", "2반", "3반" };
    String[] spin_number = { "1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번", "11번",
            "12번", "13번", "14번", "15번", "16번", "17번", "18번", "19번", "20번" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sign_up);

        btn_Sign_In_Back = findViewById(R.id.btn_Sign_In_Back);
        btn_Goto_SignUp2 = findViewById(R.id.btn_Goto_SignUp2);
        btn_Goto_SignUp2.setOnClickListener(v -> {
            Intent gotoSignUp2Intent = new Intent(getApplicationContext(), SecondSignUpActivity.class);
            startActivity(gotoSignUp2Intent);
        });
        btn_Sign_In_Back.setOnClickListener(v -> finish());

        Setting_Spinner();

    }

    private void Setting_Spinner() {
        // TODO : Toast 메시지는 바꿔야 합니당.
        //Spinner
        //grade
        Spinner spinner_grade = findViewById(R.id.spinner_grade);
        ArrayAdapter<String> adapter_grade = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spin_grade);

        adapter_grade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_grade.setAdapter(adapter_grade);

        //class
        Spinner spinner_class = findViewById(R.id.spinner_class);
        ArrayAdapter<String> adapter_class = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spin_class);

        adapter_class.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_class.setAdapter(adapter_class);

        //number
        Spinner spinner_number = findViewById(R.id.spinner_number);
        ArrayAdapter<String> adapter_number = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spin_number);

        adapter_number.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_number.setAdapter(adapter_number);

        spinner_grade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(FirstSignUpActivity.this, "학년 : " + spin_grade[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(FirstSignUpActivity.this, "아무것도 선택되지 않음", Toast.LENGTH_SHORT).show();
            }
        });
        spinner_class.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(FirstSignUpActivity.this, "반 : " + spin_class[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(FirstSignUpActivity.this, "아무것도 선택되지 않음", Toast.LENGTH_SHORT).show();
            }
        });
        spinner_number.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(FirstSignUpActivity.this, "번호 : " + spin_number[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(FirstSignUpActivity.this, "아무것도 선택되지 않음", Toast.LENGTH_SHORT).show();
            }
        });
    }
}