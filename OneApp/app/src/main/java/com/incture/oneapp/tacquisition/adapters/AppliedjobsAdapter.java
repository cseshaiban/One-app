package com.incture.oneapp.tacquisition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.AppliedItem;

import java.util.ArrayList;

/**
 * Created by harshu on 9/21/2015.
 */
public class AppliedjobsAdapter extends BaseAdapter {


    Context ctx;
    ArrayList<AppliedItem> appliedItem;
    LayoutInflater inf;


    public AppliedjobsAdapter(Context context, ArrayList<AppliedItem> apitem)
    {
        this.ctx =context;
        this.appliedItem=apitem;
        this.inf= (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView== null){
            convertView=inf.inflate(R.layout.activity_listview1,parent,false);
        }

        AppliedItem subAppItem = appliedItem.get(position);

        TextView tv1 = (TextView)convertView.findViewById(R.id.tv1);
        tv1.setText(subAppItem.getJobrole());
        TextView tv2 = (TextView)convertView.findViewById(R.id.tv2);
        tv2.setText(subAppItem.getJobdescription());
        TextView tv3=(TextView)convertView.findViewById(R.id.tv3);
        tv3.setText(subAppItem.getExperience());
        TextView tv4 = (TextView)convertView.findViewById(R.id.tv4);
        tv4.setText(subAppItem.getJoblocation());
        TextView tv5=(TextView)convertView.findViewById(R.id.tv5);
        tv5.setText(subAppItem.getTime());
        ImageView imv=(ImageView)convertView.findViewById(R.id.imv1);
        imv.setVisibility(View.VISIBLE);
        if(position==0)
        {
            imv.setBackgroundResource(R.drawable.star);
        }
        else
        {
            imv.setBackgroundResource(R.drawable.star_border);
        }

       // ImageView imv1=(ImageView)convertView.findViewById(R.id.imv3);
        //imv1.setVisibility(View.VISIBLE);
        //if(position==0)
        //{

        //}


        return convertView;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return appliedItem.get(position);
    }

    @Override
    public int getCount() {
        return appliedItem.size();
    }


}


