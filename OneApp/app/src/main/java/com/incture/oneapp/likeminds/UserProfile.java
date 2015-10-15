package com.incture.oneapp.likeminds;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;


import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.Adapters.PersonalDirectoryPagerAdapter;

/**
 * Created by Arjun on 04-09-2015.
 */
public class UserProfile extends AppCompatActivity {

    static String User_Name = "Mr Arjun Biju";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        User_Name = getIntent().getStringExtra("username");
        

        Toolbar toolbar = (Toolbar) findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(User_Name);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        collapsingToolbar.setTitle(User_Name);
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.primary_text_default_material_dark));
        collapsingToolbar.setExpandedTitleColor(getResources().getColor(R.color.primary_text_default_material_dark));

        collapsingToolbar.setCollapsedTitleTextColor(Color.TRANSPARENT);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        ((CoordinatorLayout)findViewById(R.id.coordinator_layout)).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });





//        Vector<Feed> dummyFeedData = new Vector<Feed>();
//        for(int i=0;i<10;i++)
//        {
//            Feed feed = new Feed("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed facilisis, sapien eget vestibulum tempus, massa justo fermentum elit, vestibulum pharetra sem dui a diam. Cras sit amet semper sapien","25th August 2015","Group Joe","John Doe");
//            dummyFeedData.add(feed);
//        }
//
//
//        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
//
//
//        RecyclerView listView = (RecyclerView)findViewById(R.id.listView);
//        listView.setLayoutManager(mLayoutManager);
//        listView.setAdapter(new FeedAdapter(getApplicationContext(), dummyFeedData));


        //TAB code

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        //Set the title of the tabs in the tab layout
        tabLayout.addTab(tabLayout.newTab().setText("Personal"));
        tabLayout.addTab(tabLayout.newTab().setText("Org Data"));
        tabLayout.addTab(tabLayout.newTab().setText("Emergency"));
        tabLayout.addTab(tabLayout.newTab().setText("Family"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //set up the view pager for the swiping between the tabs
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        //get the adapter for switching between the fragments
        final PersonalDirectoryPagerAdapter adapter = new PersonalDirectoryPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}
