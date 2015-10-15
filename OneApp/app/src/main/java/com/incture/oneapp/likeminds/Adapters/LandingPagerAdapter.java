package com.incture.oneapp.likeminds.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.incture.oneapp.likeminds.Fragments.FeedFragment;
import com.incture.oneapp.likeminds.Fragments.GroupFragment;
import com.incture.oneapp.likeminds.Fragments.WallFragment;


/**
 * Created by Arjun on 25-08-2015.
 */
public class LandingPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public LandingPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FeedFragment tab1 = new FeedFragment();
                return tab1;
            case 1:
                WallFragment tab2 = new WallFragment();
                return tab2;
            case 2:
                GroupFragment tab3 = new GroupFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}