package com.journals.longdom.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArchiveResponse {


    @SerializedName("archive_year_cnt")
    private int archiveYearCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("archive_years")
    private List<ArchiveYearsBean> archiveYears;

    public int getArchiveYearCnt() {
        return archiveYearCnt;
    }

    public void setArchiveYearCnt(int archiveYearCnt) {
        this.archiveYearCnt = archiveYearCnt;
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

    public List<ArchiveYearsBean> getArchiveYears() {
        return archiveYears;
    }

    public void setArchiveYears(List<ArchiveYearsBean> archiveYears) {
        this.archiveYears = archiveYears;
    }

    public static class ArchiveYearsBean {
        @SerializedName("year")
        private String year;
        @SerializedName("archive_details")
        private List<ArchiveDetailsBean> archiveDetails;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchiveDetails() {
            return archiveDetails;
        }

        public void setArchiveDetails(List<ArchiveDetailsBean> archiveDetails) {
            this.archiveDetails = archiveDetails;
        }

        public static class ArchiveDetailsBean {
            @SerializedName("volume")
            private String volume;
            @SerializedName("number")
            private String number;
            @SerializedName("issue_year")
            private String issueYear;
            @SerializedName("issuetype")
            private String issuetype;
            @SerializedName("issuetitle")
            private String issuetitle;
            @SerializedName("issue_url")
            private String issueUrl;

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getIssueYear() {
                return issueYear;
            }

            public void setIssueYear(String issueYear) {
                this.issueYear = issueYear;
            }

            public String getIssuetype() {
                return issuetype;
            }

            public void setIssuetype(String issuetype) {
                this.issuetype = issuetype;
            }

            public String getIssuetitle() {
                return issuetitle;
            }

            public void setIssuetitle(String issuetitle) {
                this.issuetitle = issuetitle;
            }

            public String getIssueUrl() {
                return issueUrl;
            }

            public void setIssueUrl(String issueUrl) {
                this.issueUrl = issueUrl;
            }
        }
    }
}
