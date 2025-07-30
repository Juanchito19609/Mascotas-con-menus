package com.example.mascotas;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.mascotas.fragments.FragmentMascotas;
import com.example.mascotas.fragments.FragmentPerfil;

public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentMascotas();
            case 1:
                return new FragmentPerfil();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return position == 0 ? "Mascotas" : "Perfil";
    }
}
