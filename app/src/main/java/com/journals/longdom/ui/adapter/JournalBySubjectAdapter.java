package com.journals.longdom.ui.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.journals.longdom.R;

import com.journals.longdom.databinding.OpenaccessJournalItemBinding;
import com.journals.longdom.model.HomeResponse;

import java.util.List;

public class JournalBySubjectAdapter extends RecyclerView.Adapter<JournalBySubjectAdapter.ViewHolder> {

    List<HomeResponse.JournalbysubjdetailsDetailsBean> modelList;


    Context context;
    public JournalBySubjectAdapter(List<HomeResponse.JournalbysubjdetailsDetailsBean> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public JournalBySubjectAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(OpenaccessJournalItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull JournalBySubjectAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtJournalName.setText(modelList.get(position).getJournalCatName());

        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("catId", modelList.get(position).getJournalCatUrl());
                bundle.putString("catName", modelList.get(position).getJournalCatName());

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
