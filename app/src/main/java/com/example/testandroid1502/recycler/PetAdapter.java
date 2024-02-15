package com.example.testandroid1502.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.testandroid1502.databinding.ItemPetBinding;
import com.example.testandroid1502.domain.Pet;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetViewHolder> {
    private List<Pet> petList;


    public PetAdapter(List<Pet> petList) {
        this.petList = petList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPetBinding binding = ItemPetBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new PetViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        holder.bind(petList.get(position));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

}

