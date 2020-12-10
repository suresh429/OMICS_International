package com.journals.omicsonline.ui.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.journals.omicsonline.R;
import com.journals.omicsonline.databinding.OpenaccessJournalItemBinding;
import com.journals.omicsonline.model.HomeResponse;

import java.util.List;

public class OpenAccessJournalAdapter extends RecyclerView.Adapter<OpenAccessJournalAdapter.ViewHolder> {

    List<HomeResponse.OpenaccessjournalDetailsBean> modelList;


    Context context;
    public OpenAccessJournalAdapter(List<HomeResponse.OpenaccessjournalDetailsBean> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public OpenAccessJournalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(OpenaccessJournalItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull OpenAccessJournalAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtJournalName.setText(modelList.get(position).getJournalName());

        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("catId", modelList.get(position).getJournalUrl());
                bundle.putString("catName", modelList.get(position).getJournalName());

                Navigation.findNavController(v).navigate(R.id.categoryFragment,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        OpenaccessJournalItemBinding rowItemBinding;

        public ViewHolder(@NonNull OpenaccessJournalItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
