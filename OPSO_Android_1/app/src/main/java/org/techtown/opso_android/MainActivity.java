package org.techtown.opso_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActionBar abar;

    Home home;
    Search search;
    Info info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abar = getSupportActionBar();
        abar.setLogo(R.drawable.logo);
        abar.setDisplayUseLogoEnabled(true);
        abar.setDisplayShowHomeEnabled(true);


        // Bottom Navigation
        home = new Home();
        search = new Search();
        info = new Info();

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();
        if(curId == R.id.menu_bell) {
            Toast.makeText(this, "알림으로 갑니다.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}