package com.incture.oneapp.tacquisition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.JobItem;


import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by harshu on 9/18/2015.
 */
public class AlljobsAdapter extends BaseAdapter {

    Context ctx;
    ArrayList<JobItem> jbitem;
    LayoutInflater inf;


    public AlljobsAdapter(Context context, ArrayList<JobItem> jobitem)
    {
        this.ctx =context;
        this.jbitem=jobitem;
        this.inf= (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView== null){
            convertView=inf.inflate(R.layout.activity_listview,parent,false);
        }

        JobItem subJobItem = jbitem.get(position);

        TextView tv1 = (TextView)convertView.findViewById(R.id.tv1);
        tv1.setText(subJobItem.getJobrole());
        TextView tv2 = (TextView)convertView.findViewById(R.id.tv2);
        tv2.setText(subJobItem.getJobdescription());
        TextView tv3=(TextView)convertView.findViewById(R.id.tv3);
        tv3.setText(subJobItem.getExperience());
        TextView tv4 = (TextView)convertView.findViewById(R.id.tv4);
        tv4.setText(subJobItem.getJoblocation());
        TextView tv5=(TextView)convertView.findViewById(R.id.tv5);
        tv5.setText(subJobItem.getTime());
        ImageView imv=(ImageView)convertView.findViewById(R.id.imv1);
        imv.setVisibility(View.VISIBLE);
        if(position==0)
        {
            imv.setBackgroundResource(R.drawable.star);
        }
        else
            imv.setBackgroundResource(R.drawable.star_border);
        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return jbitem.get(position);
    }

    @Override
    public int getCount() {
        return jbitem.size();
    }


}
