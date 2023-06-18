package com.seurs.go4lunch.ui.listview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.seurs.go4lunch.databinding.ListRowItemBinding;
import com.seurs.go4lunch.domain.model.Restaurant;

public class ListViewAdapter extends ListAdapter<Restaurant, ListViewAdapter.ListViewHolder> {

    private ListRowItemBinding binding;

    protected ListViewAdapter(@NonNull DiffUtil.ItemCallback<Restaurant> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ListRowItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Restaurant restaurant = getItem(position);
        holder.bind(restaurant);
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        private ListRowItemBinding binding;

        public ListViewHolder(@NonNull ListRowItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }

        void bind(Restaurant restaurant) {
            Glide.with(binding.photo.getContext()).load(restaurant.photoUrl).transform(new CenterCrop()).into(binding.photo);
            binding.name.setText(restaurant.name);
            binding.address.setText(restaurant.address);
            binding.opening.setText(restaurant.opening);
            binding.distance.setText(restaurant.distance);
            binding.workmates.setText(restaurant.workmates);
            binding.ratingBar.setRating(restaurant.rating);
        }
    }
}
