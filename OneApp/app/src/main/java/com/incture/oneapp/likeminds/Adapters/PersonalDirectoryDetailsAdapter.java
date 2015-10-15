package com.incture.oneapp.likeminds.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.incture.oneapp.R;
import com.incture.oneapp.likeminds.Data.Profile;
import com.incture.oneapp.likeminds.Data.ProfileListItem;

import java.util.List;

/**
 * Created by Arjun on 05-09-2015.
 */
public class PersonalDirectoryDetailsAdapter extends RecyclerView.Adapter<PersonalDirectoryDetailsAdapter.ViewHolder>  {

    Context context;
    Profile data;
    String type;
    LayoutInflater layoutInflater;
    List<ProfileListItem> dataList;

    public PersonalDirectoryDetailsAdapter(Context context, Profile data, String type)
    {
        this.context = context;
        this.data = data;
        this.type = type;
        if(type.equals("personal"))
        {
            dataList = data.getPersonalDetails();
        }
        else if(type.equals("emergency"))
        {
            dataList = data.getEmergencyDetails();
        }
        else if(type.equals("family"))
        {
            dataList = data.getFamilyDetails();
        }
        else if(type.equals("events"))
        {
            dataList = data.getEventDetails();
        }
        else if(type.equals("orgData"))
        {
            dataList = data.getOrgData();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(layoutInflater == null)
        {
            layoutInflater = LayoutInflater.from(context);
        }
        View view = layoutInflater.inflate(R.layout.profile_detail_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.data.setText(dataList.get(position).getData());
        holder.title.setText(dataList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title, data;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.profile_detail_title);
            data = (TextView)itemView.findViewById(R.id.profile_detail_data);
        }
    }
}
