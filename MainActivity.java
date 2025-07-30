package com.example.mascotas;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.example.mascotas.fragments.FragmentMascotas;
import com.example.mascotas.fragments.FragmentPerfil;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), 2);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        if (item.getItemId() == R.id.menu_contacto) {
            startActivity(new Intent(this, ContactoActivity.class));
            return true;
        } else if (item.getItemId() == R.id.menu_acerca) {
            startActivity(new Intent(this, AcercaDeActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
