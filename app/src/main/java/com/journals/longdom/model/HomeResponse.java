package com.journals.longdom.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("openaccessjournal_cnt")
    private int openaccessjournalCnt;
    @SerializedName("scientificconferences_cnt")
    private int scientificconferencesCnt;
    @SerializedName("aboutus")
    private String aboutus;
    @SerializedName("journalbysubjdetails_cnt")
    private int journalbysubjdetailsCnt;
    @SerializedName("clinicalmedicaljour_cnt")
    private int clinicalmedicaljourCnt;
    @SerializedName("openaccessjournal_details")
    private List<OpenaccessjournalDetailsBean> openaccessjournalDetails;
    @SerializedName("scientificconference_details")
    private List<ScientificconferenceDetailsBean> scientificconferenceDetails;
    @SerializedName("journalbysubjdetails_details")
    private List<JournalbysubjdetailsDetailsBean> journalbysubjdetailsDetails;
    @SerializedName("clinicalmedicaljour_details")
    private List<ClinicalmedicaljourDetailsBean> clinicalmedicaljourDetails;
    @SerializedName("currissue_highlights")
    private List<CurrissueHighlightsBean> currissueHighlights;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getOpenaccessjournalCnt() {
        return openaccessjournalCnt;
    }

    public void setOpenaccessjournalCnt(int openaccessjournalCnt) {
        this.openaccessjournalCnt = openaccessjournalCnt;
    }

    public int getScientificconferencesCnt() {
        return scientificconferencesCnt;
    }

    public void setScientificconferencesCnt(int scientificconferencesCnt) {
        this.scientificconferencesCnt = scientificconferencesCnt;
    }

    public String getAboutus() {
        return aboutus;
    }

    public void setAboutus(String aboutus) {
        this.aboutus = aboutus;
    }

    public int getJournalbysubjdetailsCnt() {
        return journalbysubjdetailsCnt;
    }

    public void setJournalbysubjdetailsCnt(int journalbysubjdetailsCnt) {
        this.journalbysubjdetailsCnt = journalbysubjdetailsCnt;
    }

    public int getClinicalmedicaljourCnt() {
        return clinicalmedicaljourCnt;
    }

    public void setClinicalmedicaljourCnt(int clinicalmedicaljourCnt) {
        this.clinicalmedicaljourCnt = clinicalmedicaljourCnt;
    }

    public List<OpenaccessjournalDetailsBean> getOpenaccessjournalDetails() {
        return openaccessjournalDetails;
    }

    public void setOpenaccessjournalDetails(List<OpenaccessjournalDetailsBean> openaccessjournalDetails) {
        this.openaccessjournalDetails = openaccessjournalDetails;
    }

    public List<ScientificconferenceDetailsBean> getScientificconferenceDetails() {
        return scientificconferenceDetails;
    }

    public void setScientificconferenceDetails(List<ScientificconferenceDetailsBean> scientificconferenceDetails) {
        this.scientificconferenceDetails = scientificconferenceDetails;
    }

    public List<JournalbysubjdetailsDetailsBean> getJournalbysubjdetailsDetails() {
        return journalbysubjdetailsDetails;
    }

    public void setJournalbysubjdetailsDetails(List<JournalbysubjdetailsDetailsBean> journalbysubjdetailsDetails) {
        this.journalbysubjdetailsDetails = journalbysubjdetailsDetails;
    }

    public List<ClinicalmedicaljourDetailsBean> getClinicalmedicaljourDetails() {
        return clinicalmedicaljourDetails;
    }

    public void setClinicalmedicaljourDetails(List<ClinicalmedicaljourDetailsBean> clinicalmedicaljourDetails) {
        this.clinicalmedicaljourDetails = clinicalmedicaljourDetails;
    }

    public List<CurrissueHighlightsBean> getCurrissueHighlights() {
        return currissueHighlights;
    }

    public void setCurrissueHighlights(List<CurrissueHighlightsBean> currissueHighlights) {
        this.currissueHighlights = currissueHighlights;
    }

    public static class OpenaccessjournalDetailsBean {
        @SerializedName("journal_name")
        private String journalName;
        @SerializedName("journal_url")
        private String journalUrl;

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
    }

    public static class ScientificconferenceDetailsBean {
        @SerializedName("id")
        private String id;
        @SerializedName("ConfURL")
        private String ConfURL;
        @SerializedName("country")
        private String country;
        @SerializedName("city")
        private String city;
        @SerializedName("Dates")
        private String Dates;
        @SerializedName("Title")
        private String Title;
        @SerializedName("date")
        private String date;
        @SerializedName("field")
        private String field;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getConfURL() {
            return ConfURL;
        }

        public void setConfURL(String ConfURL) {
            this.ConfURL = ConfURL;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDates() {
            return Dates;
        }

        public void setDates(String Dates) {
            this.Dates = Dates;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }

    public static class JournalbysubjdetailsDetailsBean {
        @SerializedName("journal_cat_name")
        private String journalCatName;
        @SerializedName("journal_cat_url")
        private String journalCatUrl;

        public String getJournalCatName() {
            return journalCatName;
        }

        public void setJournalCatName(String journalCatName) {
            this.journalCatName = journalCatName;
        }

        public String getJournalCatUrl() {
            return journalCatUrl;
        }

        public void setJournalCatUrl(String journalCatUrl) {
            this.journalCatUrl = journalCatUrl;
        }
    }

    public static class ClinicalmedicaljourDetailsBean {
        @SerializedName("journal_cat_name")
        private String journalCatName;
        @SerializedName("journal_cat_url")
        private String journalCatUrl;

        public String getJournalCatName() {
            return journalCatName;
        }

        public void setJournalCatName(String journalCatName) {
            this.journalCatName = journalCatName;
        }

        public String getJournalCatUrl() {
            return journalCatUrl;
        }

        public void setJournalCatUrl(String journalCatUrl) {
            this.journalCatUrl = journalCatUrl;
        }
    }

    public static class CurrissueHighlightsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("fullname")
        private String fullname;
        @SerializedName("title")
        private String title;
        @SerializedName("name")
        private String name;
        @SerializedName("fulltextlink")
        private String fulltextlink;
        @SerializedName("journal")
        private String journal;
        @SerializedName("pdflink")
        private String pdflink;
        @SerializedName("isnew")
        private String isnew;
        @SerializedName("is_ft_old")
        private String isFtOld;
        @SerializedName("journal_name")
        private String journalName;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getIsnew() {
            return isnew;
        }

        public void setIsnew(String isnew) {
            this.isnew = isnew;
        }

        public String getIsFtOld() {
            return isFtOld;
        }

        public void setIsFtOld(String isFtOld) {
            this.isFtOld = isFtOld;
        }

        public String getJournalName() {
            return journalName;
        }

        public void setJournalName(String journalName) {
            this.journalName = journalName;
        }
    }
}
