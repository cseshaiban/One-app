package com.incture.oneapp.likeminds.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.Adapters.PersonalDirectoryDetailsAdapter;
import com.incture.oneapp.likeminds.Data.Profile;
import com.incture.oneapp.likeminds.Data.ProfileListItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Arjun on 07-09-2015.
 */
public class ProfileFragment extends Fragment {

    View rootView;
    Context context;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity.getApplicationContext();
    }


    public ProfileFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_contact_details, container, false);



        Profile dummyProfileData = new Profile();
        dummyProfileData.setName("Sachin Verma");
        dummyProfileData.setEmailId("sachin@incture.com");
        dummyProfileData.setTitle("Mr.");

        ProfileListItem profileListItem = new ProfileListItem("02-Dec-75","Birthday");
        List<ProfileListItem> list = new ArrayList<>();
//        for(int i=0;i<10;i++)
        {
          list.add(profileListItem);
        }

        profileListItem = new ProfileListItem("Indian","Nationality");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("Married","Marital Status");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("Sachin","Nickname");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("809570505","Mobile Number");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("080-67832000","Office Number");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("D-302 Tower1,\nAdarsh Palm Retreat,\nDeverabisanahalli,\nOuter Ring Road","Address");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("Banglore","City");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("Karnataka","State");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("India","Country");
        list.add(profileListItem);
        profileListItem = new ProfileListItem("560103","Zip/Pin code");
        list.add(profileListItem);




        dummyProfileData.setPersonalDetails(list);

        List<ProfileListItem> list2 = new ArrayList<>();

        profileListItem = new ProfileListItem("Mrs. Chaitanya K","Name");
        list2.add(profileListItem);
        profileListItem = new ProfileListItem("Spouse","Relation");
        list2.add(profileListItem);
        profileListItem = new ProfileListItem("ch.kudumula@sap.com","Email id");
        list2.add(profileListItem);

        dummyProfileData.setEmergencyDetails(list2);

        List<ProfileListItem> list3 = new ArrayList<>();

        profileListItem = new ProfileListItem("02-Dec-75","Birth Date");
        list3.add(profileListItem);

        profileListItem = new ProfileListItem("Spoorthi : 07-Oct-2002","Childbirth");
        list3.add(profileListItem);

        profileListItem = new ProfileListItem("Stuti : 19-April-2004","Childbirth");
        list3.add(profileListItem);

        dummyProfileData.setEventDetails(list3);
        List<ProfileListItem> list4 = new ArrayList<>();


        profileListItem = new ProfileListItem("Sanvar Mal Verma","Father");
        list4.add(profileListItem);



        profileListItem = new ProfileListItem("Kudumula Chaitanya","Spouse");
        list4.add(profileListItem);

        profileListItem = new ProfileListItem("2","Children");
        list4.add(profileListItem);


        dummyProfileData.setFamilyDetails(list4);

        List<ProfileListItem> list5 = new ArrayList<>();


        profileListItem = new ProfileListItem("Founder and CEO","Designation");
        list5.add(profileListItem);


        profileListItem = new ProfileListItem("Not Applicable","Manager");
        list5.add(profileListItem);

        profileListItem = new ProfileListItem("Not Applicable","Department");
        list5.add(profileListItem);

        profileListItem = new ProfileListItem("India","Cost Centre");
        list5.add(profileListItem);

        profileListItem = new ProfileListItem("Permanent","Employee type");
        list5.add(profileListItem);

        profileListItem = new ProfileListItem("Bangalore","Location");
        list5.add(profileListItem);

        dummyProfileData.setOrgData(list5);




        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.contact_details_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //recycler View add the adapter
        Bundle arguments = getArguments();
        recyclerView.setAdapter(new PersonalDirectoryDetailsAdapter(context, dummyProfileData,arguments.getString("type"))); //get type from the argument

        return rootView;

    }

}
