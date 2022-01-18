package com.example.extraplanet.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.extraplanet.fragments.Add;
import com.example.extraplanet.fragments.Home;
import com.example.extraplanet.fragments.Notification;
import com.example.extraplanet.fragments.Profile;
import com.example.extraplanet.fragments.Search;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new Home();


            case 1:
                return new Search();

            case 2:
                return new Add();

            case 3:
                return new Notification();

            case 4:
                return new Profile();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
