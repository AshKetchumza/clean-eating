package com.ashleysanders.cleaneating;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AuthTabsActivity extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public AuthTabsActivity(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SigninActivity tab1 = new SigninActivity();
                return tab1;
            case 1:
                SignupActivity tab2 = new SignupActivity();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
