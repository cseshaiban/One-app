package com.incture.oneapp.likeminds.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.UserProfile;

import java.util.Vector;

/**
 * Created by Arjun on 01-09-2015.
 */
public class MemberListAdapter  extends RecyclerView.Adapter<MemberListAdapter.ViewHolder> {

    LayoutInflater layoutInflater;
    Context context;
    Vector<String> data; // Change to Data class later


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView memberName;
        //Add the rest of the views later

        public ViewHolder(View itemView) {
            super(itemView);
            memberName = (TextView) itemView.findViewById(R.id.member_name);
        }



    }

    public MemberListAdapter(Context context, Vector<String> data)
    {
        this.context = context;
        this.data= data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(layoutInflater == null)
        {
            layoutInflater = LayoutInflater.from(context);
        }
        View view = layoutInflater.inflate(R.layout.member_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UserProfile.class);
                context.startActivity(intent);
            }
        });

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String name = data.get(position);
        holder.memberName.setText(name);

    }



    @Override
    public int getItemCount() {
        return data.size();
    }
}
