package com.incture.oneapp.tacquisition;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.adapters.AlljobsAdapter;

import java.util.ArrayList;



/**
 * Created by harshu on 9/21/2015.
 */
public class LandingFragment1 extends Fragment {

    ArrayList<JobItem> jbitem;
    Context ctx;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        jbitem = new ArrayList<>();

        View x=inflater.inflate(R.layout.landing_fragment1, container, false);
        ctx=getActivity();
        jbitem.add(new JobItem("Android developer","We are looking for an Android developer...","2 years XP","bangalore","3 hours ago",R.drawable.star));
        jbitem.add(new JobItem("IOS developer","We are looking for an IOS developer...", "5 years XP","bangalore", "8 hours ago", R.drawable.star_border));
        jbitem.add(new JobItem("Web developer","We are looking for an Web developer...","2 years XP","Chennai","19 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Java developer","We are looking for an Java developer...", "2 years XP","bangalore", "19 Sep", R.drawable.star_border));
        jbitem.add(new JobItem("HR Manager","We are looking for an HR Manager...","3-4years XP","Pune","17 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Marketing Manager","We are looking for an Marketing Manager...","3-4years XP","Mumbai","16 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Java developer","We are looking for an Java developer...","3-4years XP","Pune","15 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Web developer","We are looking for an Web developer...","3-4years XP","Chennai","15 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Android developer","We are looking for an Android developer...","3-4years XP","Pune","14 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("HR Manager","We are looking for an HR Manager...","8-10years XP","Delhi","12 Sep",R.drawable.star_border));
        jbitem.add(new JobItem("Marketing Manager","We are looking for an Marketing Manager...","11-12years XP","Ahmedabad","10 Sep",R.drawable.star_border));



        ListView lv = (ListView)x.findViewById(R.id.listjobitem);
        AlljobsAdapter adap = new AlljobsAdapter(ctx, jbitem);
        lv.setAdapter(adap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(),JobDescription.class);
                startActivity(intent);
            }
        });


        return x;



    }


}
