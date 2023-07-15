package com.example.onschedule.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;

import com.example.onschedule.DB.NailDBHelper;
import com.example.onschedule.MainActivity;
import com.example.onschedule.Model.NailModel;

import java.util.List;

public class NailAdapter {
    private List<NailModel> mList;
    private MainActivity mActivity;
    private NailDBHelper nailHelper;

    public NailAdapter(NailDBHelper nailHelper, MainActivity mActivity){
        this.mActivity = mActivity;
        this.nailHelper = nailHelper;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout , parent , false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final NailModel item = mList.get(position);

        holder.mFullName.setText(item.getFullName());
        holder.mEmail.setText(item.getEmail());
        holder.mPhone.setText(item.getPhone());
        holder.mTime.setText(item.getTime());
        holder.mService.setText(item.getService());
        holder.mCheckBox.setText(item.getTask());
        holder.mCheckBox.setChecked(toBoolean(item.getStatus()));
        holder.mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    nailHelper.updateStatus(item.getId() , 1);
                }else
                    nailHelper.updateStatus(item.getId() , 0);
            }
        });
    }
}
