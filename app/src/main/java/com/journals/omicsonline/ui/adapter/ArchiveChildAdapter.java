package com.journals.omicsonline.ui.adapter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.journals.omicsonline.R;
import com.journals.omicsonline.databinding.ArchiveChildListItemBinding;
import com.journals.omicsonline.model.ArchiveResponse;

import java.util.List;

public class ArchiveChildAdapter extends RecyclerView.Adapter<ArchiveChildAdapter.ViewHolder> {

    List<ArchiveResponse.ArchiveYearsBean.ArchiveDetailsBean> modelList;
    String journalcode;

    public ArchiveChildAdapter(List<ArchiveResponse.ArchiveYearsBean.ArchiveDetailsBean> modelList, String journalcode) {
        this.modelList = modelList;
        this.journalcode = journalcode;
    }

    @NonNull
    @Override
    public ArchiveChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ArchiveChildListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ArchiveChildAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtArchiveChildName.setText(modelList.get(position).getIssuetitle());

        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("year",modelList.get(position).getIssueYear());
                bundle.putString("volume",modelList.get(position).getVolume());
                bundle.putString("issue",modelList.get(position).getNumber());
                bundle.putString("journalcode",journalcode);
                bundle.putString("ActionBarTitle",modelList.get(position).getIssuetitle());
                Navigation.findNavController(v).navigate(R.id.volumeIssueFragment,bundle);
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
        ArchiveChildListItemBinding rowItemBinding;

        public ViewHolder(@NonNull ArchiveChildListItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
