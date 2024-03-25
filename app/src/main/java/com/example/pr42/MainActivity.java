package com.example.pr42;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment,
                Fragment1.class, null).commit();

    }

    public void To_Fragment2(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment2 fragment2 = new Fragment2();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment2, "fragment2");
        fragmentTransaction.commit();
    }

    public void To_Fragment1(View v){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 fragment1 = new Fragment1();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment1, "fragment1");
        fragmentTransaction.commit();
    }
}