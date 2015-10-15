package com.incture.oneapp.likeminds.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.incture.oneapp.likeminds.Fragments.ProfileFragment;


/**
 * Created by Arjun on 04-09-2015.
 */
public class PersonalDirectoryPagerAdapter extends FragmentStatePagerAdapter {

    int numOfTabs;

    public PersonalDirectoryPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Bundle bundle1 = new Bundle();
                bundle1.putString("type","personal");
                ProfileFragment tab1 = new ProfileFragment();
                tab1.setArguments(bundle1);
                return tab1;
            case 1:
                Bundle bundle5 = new Bundle();
                bundle5.putString("type","orgData");
                ProfileFragment tab5 = new ProfileFragment();
                tab5.setArguments(bundle5);
                return tab5;
            case 2:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type","emergency");
                ProfileFragment tab2 = new ProfileFragment();
                tab2.setArguments(bundle2);
                return tab2;
            case 3:
                Bundle bundle3 = new Bundle();
                bundle3.putString("type","family");
                ProfileFragment tab3 = new ProfileFragment();
                tab3.setArguments(bundle3);
                return tab3;
            case 4:
                Bundle bundle4 = new Bundle();
                bundle4.putString("type","events");
                ProfileFragment tab4 = new ProfileFragment();
                tab4.setArguments(bundle4);
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
