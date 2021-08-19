package kr.hs.dgsw.smartschool.opso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.techtown.opso_android.R;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_bell;
    HomeFragment home;
    SearchFragment search;
    InfoFragment info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Bottom Navigation
        home = new HomeFragment();
        search = new SearchFragment();
        info = new InfoFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();

        BottomNavigationView bottemNavigaion = findViewById(R.id.bottom_navigation);
        bottemNavigaion.setOnNavigationItemSelectedListener(
                item -> {
                    switch (item.getItemId()) {
                        case R.id.home:
                            getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
                            return true;
                        case R.id.search:
                            getSupportFragmentManager().beginTransaction().replace(R.id.container, search).commit();
                            return true;
                        case R.id.info:
                            getSupportFragmentManager().beginTransaction().replace(R.id.container, info).commit();
                            return true;
                    }

                    return false;
                }
        );

        btn_bell = findViewById(R.id.btn_bell);
        btn_bell.setOnClickListener(v -> {
            Intent goAlarmIntent = new Intent(getApplicationContext(), AlarmActivity.class);
            startActivity(goAlarmIntent);
        });
    }

}