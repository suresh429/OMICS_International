package com.journals.longdom.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.google.android.material.snackbar.Snackbar;
import com.journals.longdom.helper.utils;
import com.journals.longdom.model.HomeModel;
import com.journals.longdom.ui.adapter.ClinicalandMedicalAdapter;
import com.journals.longdom.ui.adapter.CurrentIssuesAdapter;
import com.journals.longdom.ui.adapter.JournalBySubjectAdapter;
import com.journals.longdom.ui.adapter.OpenAccessJournalAdapter;
import com.journals.longdom.databinding.FragmentHomeBinding;
import com.journals.longdom.model.HomeResponse;
import com.journals.longdom.ui.viewmodel.HomeViewModel;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment  {



    ArrayList<HomeResponse.OpenaccessjournalDetailsBean> openaccessjournalDetailsBeanArrayList = new ArrayList<>();
    ArrayList<HomeResponse.JournalbysubjdetailsDetailsBean> journalbysubjdetailsDetailsBeanArrayList = new ArrayList<>();
    ArrayList<HomeResponse.ClinicalmedicaljourDetailsBean> clinicalmedicaljourDetailsBeanArrayList = new ArrayList<>();
    ArrayList<HomeResponse.CurrissueHighlightsBean> currentIssuesList = new ArrayList<>();
    List<HomeModel> homeModelList=new ArrayList<>();
    HomeViewModel homeViewModel;
    FragmentHomeBinding fragmentHomeBinding;
    OpenAccessJournalAdapter openAccessJournalAdapter;
    JournalBySubjectAdapter journalBySubjectAdapter;
    ClinicalandMedicalAdapter clinicalandMedicalAdapter;
    CurrentIssuesAdapter currentIssuesAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragmentHomeBinding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeViewModel.init("1",requireActivity());

        // Alert toast msg
        homeViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
           // Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
            Snackbar snackbar = Snackbar.make(fragmentHomeBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);


        });


        // progress bar
        homeViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentHomeBinding.progressBar.setVisibility(View.VISIBLE);
                fragmentHomeBinding.txtopenAccessJournals.setVisibility(View.GONE);
                fragmentHomeBinding.txtclinicalMedicalJournals.setVisibility(View.GONE);
                fragmentHomeBinding.txtSubjectByJournal.setVisibility(View.GONE);
                fragmentHomeBinding.txtCurrentIssueName.setVisibility(View.GONE);
            }else {
                fragmentHomeBinding.progressBar.setVisibility(View.GONE);
                fragmentHomeBinding.txtopenAccessJournals.setVisibility(View.VISIBLE);
                fragmentHomeBinding.txtclinicalMedicalJournals.setVisibility(View.VISIBLE);
                fragmentHomeBinding.txtSubjectByJournal.setVisibility(View.VISIBLE);
                fragmentHomeBinding.txtCurrentIssueName.setVisibility(View.VISIBLE);
            }
        });


        // get home data
        homeViewModel.getHomeRepository().observe(getViewLifecycleOwner(), homeResponse -> {
            List<HomeResponse.OpenaccessjournalDetailsBean> openaccessjournalDetails = homeResponse.getOpenaccessjournalDetails();
            List<HomeResponse.JournalbysubjdetailsDetailsBean> journalbysubjdetailsDetailsBeans = homeResponse.getJournalbysubjdetailsDetails();
            List<HomeResponse.ClinicalmedicaljourDetailsBean> clinicalmedicaljourDetailsBeans = homeResponse.getClinicalmedicaljourDetails();
            List<HomeResponse.CurrissueHighlightsBean> currissueHighlightsBeanList = homeResponse.getCurrissueHighlights();


            /*openaccessjournalDetailsBeanArrayList.addAll(openaccessjournalDetails);
            journalbysubjdetailsDetailsBeanArrayList.addAll(journalbysubjdetailsDetailsBeans);
            clinicalmedicaljourDetailsBeanArrayList.addAll(clinicalmedicaljourDetailsBeans);
            currentIssuesList.addAll(currissueHighlightsBeanList);*/


            openAccessJournalAdapter = new OpenAccessJournalAdapter(openaccessjournalDetails,getActivity());
            fragmentHomeBinding.recyclerOpenAccessJournals.setAdapter(openAccessJournalAdapter);

            journalBySubjectAdapter = new JournalBySubjectAdapter(journalbysubjdetailsDetailsBeans,getActivity());
            fragmentHomeBinding.recyclerSubjectByJournal.setAdapter(journalBySubjectAdapter);

            clinicalandMedicalAdapter = new ClinicalandMedicalAdapter(clinicalmedicaljourDetailsBeans,getActivity());
            fragmentHomeBinding.recyclerclinicalMedicalJournals.setAdapter(clinicalandMedicalAdapter);

            currentIssuesAdapter = new CurrentIssuesAdapter(currissueHighlightsBeanList,requireActivity());
            fragmentHomeBinding.recyclerHomeCurrentIssue.setAdapter(currentIssuesAdapter);

            fragmentHomeBinding.progressBar.setVisibility(View.GONE);

            openAccessJournalAdapter.notifyDataSetChanged();
            currentIssuesAdapter.notifyDataSetChanged();
        });

        return fragmentHomeBinding.getRoot();
    }



}