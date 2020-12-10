package com.journals.longdom.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.journals.longdom.R;
import com.journals.longdom.databinding.CatgeogryListItemBinding;
import com.journals.longdom.databinding.CurrentIssueItemBinding;
import com.journals.longdom.model.CategoryResponse;


import java.util.List;



public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {

    List<CategoryResponse.SubcatDetailsBean> modelList;

    Context context;
    public CategoryListAdapter(List<CategoryResponse.SubcatDetailsBean> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(CatgeogryListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtCategoryTitle.setText(modelList.get(position).getJournalName());
        holder.rowItemBinding.txtCategoryEdition.setText(modelList.get(position).getJournalCaption());
       /* Glide.with(context)
                .load(modelList.get(position).getFlyerimg())
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new CustomTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                        holder.rowItemBinding.imgJournal.setImageDrawable(resource);

                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {


                    }

                });*/

        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("journal", modelList.get(position).getJournalName());
                bundle.putString("page_url", modelList.get(position).getJournalUrl());
                bundle.putString("journalcode", modelList.get(position).getJournal());
                bundle.putString("track_paper", modelList.get(position).getTrackPaper());
                /*bundle.putString("rel_keyword", modelList.get(position).getRel_keyword());
                bundle.putString("journal_logo", modelList.get(position).getJournal_logo());

                bundle.putString("instructions", modelList.get(position).getInst_url());*/
                Navigation.findNavController(v).navigate(R.id.dashBoardFragment,bundle);
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
        CatgeogryListItemBinding rowItemBinding;

        public ViewHolder(@NonNull CatgeogryListItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
