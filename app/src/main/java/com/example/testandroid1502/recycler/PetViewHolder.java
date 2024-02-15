package com.example.testandroid1502.recycler;

import androidx.recyclerview.widget.RecyclerView;

import com.example.testandroid1502.databinding.ItemPetBinding;
import com.example.testandroid1502.domain.Pet;


public class PetViewHolder extends RecyclerView.ViewHolder {

    private ItemPetBinding binding;

    public PetViewHolder(ItemPetBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Pet item) {
        binding.tvPetName.setText(item.getName());
        binding.tvBreed.setText(item.getBreed());
        int id = binding.getRoot().getResources().getIdentifier(item.getImgUrl(), "drawable", "com.example.testandroid1502.recycler");
        binding.ivImage.setImageResource(id);
    }
}
