package com.i017114.tallernavigation;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.i017114.tallernavigation.Fragments.DosFragment;
import com.i017114.tallernavigation.Fragments.TresFragment;
import com.i017114.tallernavigation.Fragments.UnoFragment;
import com.i017114.tallernavigation.Views.Item1;


public class MainActivity extends AppCompatActivity {
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:
                        UnoFragment unoFragment = new UnoFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, unoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_2:
                        DosFragment dosFragment = new DosFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, dosFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_3:
                        TresFragment tresFragment = new TresFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, tresFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu ,menu);
        return true;
    }
    public void onClickShowWindowSearch(View view){
        Intent intent = new Intent(this, Item1.class);
        startActivity(intent);

    }

}

