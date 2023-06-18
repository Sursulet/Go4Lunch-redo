package com.seurs.go4lunch.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.seurs.go4lunch.databinding.WorkmatesRowItemBinding;
import com.seurs.go4lunch.domain.model.Workmate;

public class WorkmateAdapter extends ListAdapter<Workmate, WorkmateAdapter.WorkmateViewHolder> {
    protected WorkmateAdapter(@NonNull DiffUtil.ItemCallback<Workmate> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public WorkmateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        WorkmatesRowItemBinding binding = WorkmatesRowItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new WorkmateViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkmateViewHolder holder, int position) {
        Workmate workmate = getItem(position);
        holder.onBind(workmate);
    }

    class WorkmateViewHolder extends RecyclerView.ViewHolder {
        WorkmatesRowItemBinding binding;
        public WorkmateViewHolder(@NonNull WorkmatesRowItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }

        void onBind(Workmate workmate) {
            Glide.with(this.binding.photo.getContext()).load(workmate.photoUrl).into(this.binding.photo);
            this.binding.text.setText("");
        }
    }
}
