package com.incture.oneapp.tacquisition;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.LandingActivity;
import com.incture.oneapp.tacquisition.adapters.ViewpagerAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    TextView tv;
    TextView tv1;
    RelativeLayout r1,r2,r3,rl;
    DrawerLayout d1;
    Snackbar snackbar;
    ArrayList<JobItem> jbitem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Context ctx= getApplicationContext();
        rl=(RelativeLayout)findViewById(R.id.rel1);
        tv=(TextView)findViewById(R.id.tv3);
        tv1=(TextView)findViewById(R.id.tv4);
        jbitem = new ArrayList<>();
       // jbitem.add(new JobItem("Android developer","2 years XP|bangalore","2pm",R.drawable.icon_fav));
        //jbitem.add(new JobItem("IOS developer", "5 years XP|bangalore", "1pm", R.drawable.icon_fav));
        //jbitem.add(new JobItem("Windows developer","2 years XP|bangalore","5pm",R.drawable.icon_fav));
        //jbitem.add(new JobItem("SAP developer", "2 years XP|bangalore", "2pm", R.drawable.icon_fav));
        //jbitem.add(new JobItem("HR Manager","3-4years XP|Pune","11:00am",R.drawable.icon_fav));
        //jbitem.add(new JobItem("Marketing Manager","3-4years XP|Mumbai","9:00am",R.drawable.icon_fav));
        //jbitem.add(new JobItem("Java developer","3-4years XP|Pune","12:00pm",R.drawable.icon_fav));
        //jbitem.add(new JobItem("Web developer","3-4years XP|Chennai","11:00am",R.drawable.icon_fav));
        //jbitem.add(new JobItem("Android developer","3-4years XP|Pune","10:00am",R.drawable.icon_fav));
        //jbitem.add(new JobItem("HR Manager","8-10years XP|Delhi","11:00am",R.drawable.icon_fav));
        //jbitem.add(new JobItem("Marketing Manager","11-12years XP|Ahmedabad","7:00pm",R.drawable.icon_fav));
        //ListView lv = (ListView)findViewById(R.id.listjobitem);
        //AlljobsAdapter adap = new AlljobsAdapter(ctx, jbitem);
        //lv.setAdapter(adap);

//        lv.setOnItemLongClickListener (new AdapterView.OnItemLongClickListener() {
  //          public boolean onItemLongClick(AdapterView parent, View view, int position, long id) {
                //do your stuff here

    //            return true;
      //      }
        //});



       /* r1=(RelativeLayout)findViewById(R.id.rel1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, Apply.class);
                startActivity(i);
            }
        });

        r2=(RelativeLayout)findViewById(R.id.rel2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Apply.class);
                startActivity(i);
            }
        });*/


      /*  r3=(RelativeLayout)findViewById(R.id.header);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=(DrawerLayout)findViewById(R.id.drawer);
                d1.closeDrawers();
                Intent i=new Intent(MainActivity.this,UserProfile.class);
                startActivity(i);
            }
        });*/
        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        if(toolbar!=null)
        setSupportActionBar(toolbar);

        final ActionBar actionBar=getSupportActionBar();
        // actionbar.setHomeAsUpIndicator(R.drawable.icon_history);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("All Jobs");
        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.Alljobs:
                    { Intent i=new Intent(MainActivity.this,MainActivity.class);
                        startActivity(i);}
                    return true;

                    case R.id.Favourite:
                    {Intent i=new Intent(MainActivity.this,SavedJobs.class);
                        startActivity(i);}
                    return true;

                    case R.id.Jobrequisition:
                    {
                        d1=(DrawerLayout)findViewById(R.id.drawer);
                        d1.closeDrawers();
                        Intent i=new Intent(MainActivity.this,JobRequest.class);
                        startActivity(i);}
                    return true;

                    case R.id.Settings:
                    {
                        Intent i = new Intent(MainActivity.this, Setting.class);
                        startActivity(i);
                    }
                    case R.id.Help:
                    {
                        Intent i = new Intent(MainActivity.this, Help.class);
                        startActivity(i);
                    }

                    default:
                        Toast.makeText(getApplicationContext(), "Somethings Wrong", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });


        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();


        TabLayout tabLayout1 = (TabLayout) findViewById(R.id.tablayout1);
        tabLayout1.addTab(tabLayout1.newTab().setText("AllJobs"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Applied Jobs"));
        //tabLayout.addTab(tabLayout.newTab().setText("Education"));
        tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager1);


        final ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager(), tabLayout1.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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


//end of onCreate
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tmenu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id==android.R.id.home)
        {
            onBackPressed();
            return true;
        }

        if(id==R.id.action_filter)
        {
            Intent i=new Intent(MainActivity.this,Filters.class);
            startActivity(i);
            return true;
        }
        if(id==R.id.action_search)
        {
            Intent i=new Intent(MainActivity.this,Search.class);
            startActivity(i);
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        Intent n = new Intent(MainActivity.this, LandingActivity.class);
        startActivity(n);
    }
}
