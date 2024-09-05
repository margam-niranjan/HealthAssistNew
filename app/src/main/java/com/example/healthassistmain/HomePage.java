package com.example.healthassistmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    BottomNavigationView bottomNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);


        bottomNavigation = findViewById(R.id.navigation);
        bottomNavigation.setSelectedItemId(R.id.action_home);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if(id == R.id.nav_profile){
                    Toast.makeText(HomePage.this, "Home", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_medical_info){
                    Toast.makeText(HomePage.this, "Medical Info", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_bmi){
                    Toast.makeText(HomePage.this, "BMI", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_medicines){
                    Toast.makeText(HomePage.this, "Book Medicines", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_consult){
                    Toast.makeText(HomePage.this, "Consult a doctor", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_check_appointment){
                    Toast.makeText(HomePage.this, "Check your appointments", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_book){
                    Toast.makeText(HomePage.this, "book your appointments", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_pay){
                    Toast.makeText(HomePage.this, "Pay bills", Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.nav_exercise){
                    Toast.makeText(HomePage.this, "Exercise", Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.nav_diet){
                    Toast.makeText(HomePage.this, "Diet", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}