package com.example.onschedule.Adapter;

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

}
