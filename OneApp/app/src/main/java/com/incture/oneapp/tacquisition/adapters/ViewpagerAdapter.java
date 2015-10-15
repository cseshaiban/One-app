package com.incture.oneapp.tacquisition.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;

import com.incture.oneapp.tacquisition.LandingFragment1;
import com.incture.oneapp.tacquisition.LandingFragment2;


/**
 * Created by harshu on 9/7/2015.
 */
public class ViewpagerAdapter extends FragmentStatePagerAdapter{

    int numoftabs;

     public ViewpagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numoftabs = NumOfTabs;
    }

    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LandingFragment1 tab1=new LandingFragment1();
                return tab1;
            case 1:
                LandingFragment2 tab2 = new LandingFragment2();
                return tab2;
           // case 2:
             //   Tabfragment3 tab3 = new Tabfragment3();
               // return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

}
