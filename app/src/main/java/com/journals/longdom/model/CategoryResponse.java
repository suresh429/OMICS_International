package com.journals.longdom.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("subcat_cnt")
    private int subcatCnt;
    @SerializedName("subcat_details")
    private List<SubcatDetailsBean> subcatDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSubcatCnt() {
        return subcatCnt;
    }

    public void setSubcatCnt(int subcatCnt) {
        this.subcatCnt = subcatCnt;
    }

    public List<SubcatDetailsBean> getSubcatDetails() {
        return subcatDetails;
    }

    public void setSubcatDetails(List<SubcatDetailsBean> subcatDetails) {
        this.subcatDetails = subcatDetails;
    }

    public static class SubcatDetailsBean {
        @SerializedName("journal")
        private String journal;
        @SerializedName("journal_name")
        private String journalName;
        @SerializedName("journal_url")
        private String journalUrl;
        @SerializedName("if_value")
        private String ifValue;
        @SerializedName("five_if_value")
        private String fiveIfValue;
        @SerializedName("journal_caption")
        private String journalCaption;
        @SerializedName("cr_url")
        private String crUrl;
        @SerializedName("track_paper")
        private String trackPaper;

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getJournalName() {
            return journalName;
        }

        public void setJournalName(String journalName) {
            this.journalName = journalName;
        }

        public String getJournalUrl() {
            return journalUrl;
        }

        public void setJournalUrl(String journalUrl) {
            this.journalUrl = journalUrl;
        }

        public String getIfValue() {
            return ifValue;
        }

        public void setIfValue(String ifValue) {
            this.ifValue = ifValue;
        }

        public String getFiveIfValue() {
            return fiveIfValue;
        }

        public void setFiveIfValue(String fiveIfValue) {
            this.fiveIfValue = fiveIfValue;
        }

        public String getJournalCaption() {
            return journalCaption;
        }

        public void setJournalCaption(String journalCaption) {
            this.journalCaption = journalCaption;
        }

        public String getCrUrl() {
            return crUrl;
        }

        public void setCrUrl(String crUrl) {
            this.crUrl = crUrl;
        }

        public String getTrackPaper() {
            return trackPaper;
        }

        public void setTrackPaper(String trackPaper) {
            this.trackPaper = trackPaper;
        }
    }
}
