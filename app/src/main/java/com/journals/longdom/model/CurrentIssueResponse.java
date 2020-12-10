package com.journals.longdom.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentIssueResponse {


    @SerializedName("currentissue_cnt")
    private int currentissueCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("currentissue_details")
    private List<CurrentissueDetailsBean> currentissueDetails;

    public int getCurrentissueCnt() {
        return currentissueCnt;
    }

    public void setCurrentissueCnt(int currentissueCnt) {
        this.currentissueCnt = currentissueCnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CurrentissueDetailsBean> getCurrentissueDetails() {
        return currentissueDetails;
    }

    public void setCurrentissueDetails(List<CurrentissueDetailsBean> currentissueDetails) {
        this.currentissueDetails = currentissueDetails;
    }

    public static class CurrentissueDetailsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("article")
        private Object article;
        @SerializedName("shortjournal")
        private String shortjournal;
        @SerializedName("doi")
        private String doi;
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
        @SerializedName("xmllink")
        private String xmllink;
        @SerializedName("sup")
        private String sup;
        @SerializedName("video")
        private String video;
        @SerializedName("is_mobile")
        private String isMobile;
        @SerializedName("doi_stat")
        private String doiStat;
        @SerializedName("isnew")
        private Object isnew;
        @SerializedName("is_ft_old")
        private String isFtOld;
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

        public String getXmllink() {
            return xmllink;
        }

        public void setXmllink(String xmllink) {
            this.xmllink = xmllink;
        }

        public String getSup() {
            return sup;
        }

        public void setSup(String sup) {
            this.sup = sup;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public String getIsMobile() {
            return isMobile;
        }

        public void setIsMobile(String isMobile) {
            this.isMobile = isMobile;
        }

        public String getDoiStat() {
            return doiStat;
        }

        public void setDoiStat(String doiStat) {
            this.doiStat = doiStat;
        }

        public Object getIsnew() {
            return isnew;
        }

        public void setIsnew(Object isnew) {
            this.isnew = isnew;
        }

        public String getIsFtOld() {
            return isFtOld;
        }

        public void setIsFtOld(String isFtOld) {
            this.isFtOld = isFtOld;
        }

        public String getArticletype() {
            return articletype;
        }

        public void setArticletype(String articletype) {
            this.articletype = articletype;
        }
    }
}
