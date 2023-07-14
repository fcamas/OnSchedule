package com.example.onschedule.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
}
