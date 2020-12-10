package com.journals.omicsonline.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VolumeIssueResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("vol_issue")
    private int volIssue;
    @SerializedName("vol_issue_details")
    private List<VolIssueDetailsBean> volIssueDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVolIssue() {
        return volIssue;
    }

    public void setVolIssue(int volIssue) {
        this.volIssue = volIssue;
    }

    public List<VolIssueDetailsBean> getVolIssueDetails() {
        return volIssueDetails;
    }

    public void setVolIssueDetails(List<VolIssueDetailsBean> volIssueDetails) {
        this.volIssueDetails = volIssueDetails;
    }

    public static class VolIssueDetailsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("article")
        private Object article;
        @SerializedName("shortjournal")
        private String shortjournal;
        @SerializedName("doi")
        private String doi;
        @SerializedName("doi_stat")
        private String doiStat;
        @SerializedName("fulltextlink")
        private String fulltextlink;
        @SerializedName("name")
        private String name;
        @SerializedName("pdflink")
        private String pdflink;
        @SerializedName("title")
        private String title;
        @SerializedName("abs_link")
        private String absLink;
        @SerializedName("sup")
        private String sup;
        @SerializedName("isnew")
        private String isnew;
        @SerializedName("is_ft_old")
        private String isFtOld;
        @SerializedName("is_mobile")
        private String isMobile;
        @SerializedName("issuetype")
        private String issuetype;
        @SerializedName("articletype")
        private String articletype;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public Object getArticle() {
            return article;
        }

        public void setArticle(Object article) {
            this.article = article;
        }

        public String getShortjournal() {
            return shortjournal;
        }

        public void setShortjournal(String shortjournal) {
            this.shortjournal = shortjournal;
        }

        public String getDoi() {
            return doi;
        }

        public void setDoi(String doi) {
            this.doi = doi;
        }

        public String getDoiStat() {
            return doiStat;
        }

        public void setDoiStat(String doiStat) {
            this.doiStat = doiStat;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAbsLink() {
            return absLink;
        }

        public void setAbsLink(String absLink) {
            this.absLink = absLink;
        }

        public String getSup() {
            return sup;
        }

        public void setSup(String sup) {
            this.sup = sup;
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

        public String getIsMobile() {
            return isMobile;
        }

        public void setIsMobile(String isMobile) {
            this.isMobile = isMobile;
        }

        public String getIssuetype() {
            return issuetype;
        }

        public void setIssuetype(String issuetype) {
            this.issuetype = issuetype;
        }

        public String getArticletype() {
            return articletype;
        }

        public void setArticletype(String articletype) {
            this.articletype = articletype;
        }
    }
}
