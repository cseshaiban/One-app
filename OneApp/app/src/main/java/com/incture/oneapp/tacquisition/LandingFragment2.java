package com.incture.oneapp.tacquisition;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.adapters.AppliedjobsAdapter;

import java.util.ArrayList;


/**
 * Created by harshu on 9/21/2015.
 */
public class LandingFragment2 extends Fragment {

    ArrayList<AppliedItem> applieditem;
    Context ctx1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        applieditem = new ArrayList<>();

        View x=inflater.inflate(R.layout.landing_fragment2, container, false);
        ctx1=getActivity();
        applieditem.add(new AppliedItem("Android developer", "We are looking for an Android developer...", "2 years XP", "bangalore", "3 hours ago", R.drawable.star));
        applieditem.add(new AppliedItem("IOS developer", "We are looking for an IOS developer...", "5 years XP", "bangalore", "8 hours ago", R.drawable.star_border));
        applieditem.add(new AppliedItem("Web developer", "We are looking for an Web developer...", "2 years XP", "Chennai", "19 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Java developer", "We are looking for an Java developer...", "2 years XP", "bangalore", "19 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("HR Manager", "We are looking for an HR Manager...", "3-4years XP", "Pune", "17 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Marketing Manager", "We are looking for an Marketing Manager...", "3-4years XP", "Mumbai", "16 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Java developer", "We are looking for an Java developer...", "3-4years XP", "Pune", "15 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Web developer", "We are looking for an Web developer...", "3-4years XP", "Chennai", "15 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Android developer", "We are looking for an Android developer...", "3-4years XP", "Pune", "14 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("HR Manager", "We are looking for an HR Manager...", "8-10years XP", "Delhi", "12 Sep", R.drawable.star_border));
        applieditem.add(new AppliedItem("Marketing Manager", "We are looking for an Marketing Manager...", "11-12years XP", "Ahmedabad", "10 Sep", R.drawable.star_border));



        ListView lv = (ListView)x.findViewById(R.id.listjobitem2);
        AppliedjobsAdapter adap = new AppliedjobsAdapter(ctx1, applieditem);
        lv.setAdapter(adap);
        return x;



    }
}
