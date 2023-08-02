package com.example.onschedule.RecyclingViewHelper;

import androidx.recyclerview.widget.ItemTouchHelper;

import com.example.onschedule.Adapter.NailAdapter;

public class RecyclerViewHelper {
    private NailAdapter mAdapter;

    public RecyclerViewHelper(NailAdapter mAdapter) {
        super(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.mAdapter = mAdapter;
    }
}
