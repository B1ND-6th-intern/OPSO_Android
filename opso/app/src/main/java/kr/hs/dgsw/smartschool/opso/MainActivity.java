package kr.hs.dgsw.smartschool.opso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    HomeFragment home;
    SearchFragment search;
    InfoFragment info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sign_in_Spinner();

        // Bottom Navigation
        home = new HomeFragment();
        search = new SearchFragment();
        info = new InfoFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();

        BottomNavigationView bottemNavigaion = findViewById(R.id.bottom_navigation);
        bottemNavigaion.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
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
                }
        );
    }
}