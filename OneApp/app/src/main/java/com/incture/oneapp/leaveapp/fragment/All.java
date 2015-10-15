package com.incture.oneapp.leaveapp.fragment;


import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.incture.oneapp.R;
import com.incture.oneapp.leaveapp.DataHandle.LeaveHistoryAsyncTask;
import com.incture.oneapp.leaveapp.data.LeaveHistoryData;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


/**
 * Created by SHAIBAN on 04-09-2015.
 */
public class All extends Fragment {
    RecyclerView rv;
    Context ctx;
    ArrayList<LeaveHistoryData> list = new ArrayList<LeaveHistoryData>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.all,container,false);

        ctx=getActivity();

        /*rv = (RecyclerView)view.findViewById(R.id.recyclerview_all_leave);*/
       /* rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));

        AdapterAllLeaveHistory adapter = new AdapterAllLeaveHistory(list,  new AdapterAllLeaveHistory.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
            }
        });
        rv.setAdapter(adapter);
*/
        try {
            Log.d("LEAVE", "inside URI");
         //   URL uri = new URL("http://172.31.99.106:8000/leave-history");
            URL uri = new URL("http://inctureprod.cherrywork.in:8000/leave-history");
            // new LeaveHistoryAsyncTask(uri, ctx).execute();

            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.HONEYCOMB)
                new LeaveHistoryAsyncTask(uri,ctx).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
            else
                new LeaveHistoryAsyncTask(uri,ctx).execute();


            Log.d("LEAVE", "inside after URi");
        }catch (MalformedURLException e) {e.printStackTrace();
        }


        return view;

    }

    public All(){
/*

        list.add(new LeaveHistoryData("JANUARY","05","Casual leave","Have destist oppointment tomorrow","2d","First"));
        list.add(new LeaveHistoryData("JANUARY","15","Sick Leave","Sufferening from typhoid so cannot come","2d","Item"));
        list.add(new LeaveHistoryData("JANUARY","25","Priviledge Leave","Cousins marriage","1d","Item"));

        list.add(new LeaveHistoryData("FEBRUARY","13","Casual leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("FEBRUARY","27","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("MARCH","08","Priviledge Leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("MARCH","19","Casual","Have destist oppointment tomorrow","2d","Item"));
        list.add(new LeaveHistoryData("MARCH","19","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("APRIL","19","Casual","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("APRIL","19","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("MAY","19","Casual","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("MAY","19","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("JUNE","19","Casual","Have destist oppointment tomorrow","2d","header"));

        list.add(new LeaveHistoryData("JULY","05","Casual leave","Have destist oppointment tomorrow","2d","Header"));
        list.add(new LeaveHistoryData("JULY","15","Sick Leave","Sufferening from typhoid so cannot come","2d","Item"));
        list.add(new LeaveHistoryData("JULY","25","Priviledge Leave","Cousins marriage","1d","Item"));
        list.add(new LeaveHistoryData("AUGUST","13","Casual leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("AUGUST","27","Casual","Have destist oppointment tomorrow","2d","Item"));
        list.add(new LeaveHistoryData("SEPTEMBER","08","Priviledge Leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("SEPTEMBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));
        list.add(new LeaveHistoryData("SEPTEMBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("OCTOBER","08","Priviledge Leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("OCTOBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));
        list.add(new LeaveHistoryData("OCTOBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));

        list.add(new LeaveHistoryData("NOVEMBER","08","Priviledge Leave","Have destist oppointment tomorrow","2d","header"));
        list.add(new LeaveHistoryData("NOVEMBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));
        list.add(new LeaveHistoryData("NOVEMBER","19","Casual","Have destist oppointment tomorrow","2d","Item"));
*/

    }

}