package com.seurs.go4lunch.ui;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.seurs.go4lunch.domain.model.Restaurant;

public class ListViewAdapter extends ListAdapter<Restaurant, ListViewAdapter.ListViewHolder> {

    protected ListViewAdapter(@NonNull DiffUtil.ItemCallback<Restaurant> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
