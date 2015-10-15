package com.incture.oneapp.likeminds.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.Adapters.MemberListAdapter;

import java.util.Vector;

/**
 * Created by Arjun on 01-09-2015.
 */
public class MembersFragment extends Fragment{

    Context context;
    View rootView;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.context = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        rootView = inflater.inflate(R.layout.fragment_group_members, container, false);

        Vector<String> data = new Vector<>();
//        for(int i=0;i<10;i++)
//        {
//            data.add("Arjun Biju");
//        }

        data.add("Arjun Biju");
        data.add("Shashank Sahay");
        data.add("Vikram Thomas");
        data.add("Pavan Gopal");
        data.add("Sachin Verma");



        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.listView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new MemberListAdapter(context, data));

        return rootView;
    }
}
