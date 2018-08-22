package com.jessicathornsby.actionandtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PageAdapter extends FragmentPagerAdapter {

    private int totalTabs;

    PageAdapter(FragmentManager fragmentManager, int totalTabs) {
        super(fragmentManager);
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MessagesFragment();
            case 1:
                return new ContactsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
