package com.incture.oneapp.tacquisition;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.adapters.SavedjobsAdapter;

import java.util.ArrayList;

/**
 * Created by harshu on 9/18/2015.
 */
public class SavedJobs extends AppCompatActivity {

    ArrayList<SavedItem> sitem;
    Context ctx;
    LayoutInflater inflater;
    ViewGroup container;
    SavedjobsAdapter adapter;
    ListView lv;
    Toolbar toolbarsb;
    ImageView iv;
    int dummyposition=0;
    RatingBar rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.saveditem);
        lv=(ListView)findViewById(R.id.savedlist);
        toolbarsb = (Toolbar) findViewById(R.id.toolbar1);
        if(toolbarsb!=null)
            setSupportActionBar(toolbarsb);

        final ActionBar actionbar= getSupportActionBar();
        // actionbar.setHomeAsUpIndicator(R.drawable.icon_history);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setTitle("Saved jobs");

        sitem=new ArrayList<SavedItem>();
        sitem.add(new SavedItem("Android developer", "We are looking for an Android developer...", "2 years XP", "bangalore", "3 hours ago", R.drawable.star));
        sitem.add(new SavedItem("Android developer", "We are looking for an Android developer...", "2 years XP", "bangalore", "3 hours ago", R.drawable.star));
        sitem.add(new SavedItem("Marketing Manager", "We are looking for an Marketing Manager...", "3-4years XP", "Mumbai", "16 Sep", R.drawable.star));
        sitem.add(new SavedItem("Java developer", "We are looking for an Java developer...", "3-4years XP", "Pune", "15 Sep", R.drawable.star));
        sitem.add(new SavedItem("Web developer", "We are looking for an Web developer...", "3-4years XP", "Chennai", "15 Sep", R.drawable.star));
        sitem.add(new SavedItem("Android developer", "We are looking for an Android developer...", "3-4years XP", "Pune", "14 Sep", R.drawable.star));
        sitem.add(new SavedItem("Android developer", "We are looking for an Android developer...", "2 years XP", "bangalore", "3 hours ago", R.drawable.star));
        sitem.add(new SavedItem("Marketing Manager", "We are looking for an Marketing Manager...", "3-4years XP", "Mumbai", "16 Sep", R.drawable.star));
        sitem.add(new SavedItem("Java developer", "We are looking for an Java developer...", "3-4years XP", "Pune", "15 Sep", R.drawable.star));
        sitem.add(new SavedItem("Web developer", "We are looking for an Web developer...", "3-4years XP", "Chennai", "15 Sep", R.drawable.star));
        sitem.add(new SavedItem("Android developer", "We are looking for an Android developer...", "3-4years XP", "Pune", "14 Sep", R.drawable.star));

        adapter=new SavedjobsAdapter(this,sitem);
        lv.setAdapter(adapter);


//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(SavedJobs.this, JobDescription.class);
//                startActivity(i);
//            }
//        });

        adapter.notifyDataSetChanged();


        //   new SavedjobsAsyncTask().execute("http://localhost:8080/api/dbs");

       // rb1=(RatingBar)findViewById(R.id.rating1);





    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if(id==android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    }

