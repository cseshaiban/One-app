package com.incture.oneapp.tacquisition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.incture.oneapp.R;
import com.incture.oneapp.tacquisition.SavedItem;

import java.util.ArrayList;

/**
 * Created by harshu on 10/13/2015.
 */
public class SavedjobsAdapter extends BaseAdapter {

    Context ctx;
    ArrayList<SavedItem> sitem;
    LayoutInflater inf;

    RatingBar r1;


    public SavedjobsAdapter(Context context, ArrayList<SavedItem> sitem)
    {
        this.ctx =context;
        this.sitem=sitem;
        this.inf= (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView== null){
            convertView=inf.inflate(R.layout.saveditem_listview,parent,false);
        }

        SavedItem savedItem = sitem.get(position);

        TextView tv1 = (TextView)convertView.findViewById(R.id.tv1);
        tv1.setText(savedItem.getJobrole());
        TextView tv2 = (TextView)convertView.findViewById(R.id.tv2);
        tv2.setText(savedItem.getJobdescription());
        TextView tv3=(TextView)convertView.findViewById(R.id.tv3);
        tv3.setText(savedItem.getExperience());
        TextView tv4 = (TextView)convertView.findViewById(R.id.tv4);
        tv4.setText(savedItem.getJoblocation());
        TextView tv5=(TextView)convertView.findViewById(R.id.tv5);
        tv5.setText(savedItem.getTime());
          ImageView imv=(ImageView)convertView.findViewById(R.id.imv1);
         imv.setVisibility(View.VISIBLE);

//        final RatingBar r1=(RatingBar)convertView.findViewById(R.id.rating1);
//        r1.setVisibility(View.VISIBLE);
//        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//
//                if (rating==0.5)
//                {
//
//                    Toast.makeText(ctx,"cannot take half rating",Toast.LENGTH_SHORT).show();
//                }
//
//                if(rating==1)
//                {
//                    Toast.makeText(ctx,"The job is saved!!!!!"+position, Toast.LENGTH_SHORT).show();
//                }
//            }
//        });



        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return sitem.get(position);
    }

    @Override
    public int getCount() {
        return sitem.size();
    }



}
