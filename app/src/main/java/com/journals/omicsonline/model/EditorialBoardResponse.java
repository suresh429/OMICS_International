package com.journals.omicsonline.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EditorialBoardResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("editorialboardcnt")
    private int editorialboardcnt;
    @SerializedName("editorialboardarr")
    private List<EditorialboardarrBean> editorialboardarr;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEditorialboardcnt() {
        return editorialboardcnt;
    }

    public void setEditorialboardcnt(int editorialboardcnt) {
        this.editorialboardcnt = editorialboardcnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        @SerializedName("pub1")
        private Object pub1;
        @SerializedName("pub4")
        private Object pub4;
        @SerializedName("photo")
        private String photo;
        @SerializedName("ename")
        private String ename;
        @SerializedName("description")
        private String description;
        @SerializedName("biography")
        private String biography;
        @SerializedName("research_interest")
        private String researchInterest;
        @SerializedName("network")
        private String network;
        @SerializedName("uname")
        private String uname;
        @SerializedName("consent_letters")
        private Object consentLetters;
        @SerializedName("letter_status")
        private String letterStatus;
        @SerializedName("editor_email")
        private String editorEmail;
        @SerializedName("editor_phno")
        private String editorPhno;

        public Object getPub1() {
            return pub1;
        }

        public void setPub1(Object pub1) {
            this.pub1 = pub1;
        }

        public Object getPub4() {
            return pub4;
        }

        public void setPub4(Object pub4) {
            this.pub4 = pub4;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getBiography() {
            return biography;
        }

        public void setBiography(String biography) {
            this.biography = biography;
        }

        public String getResearchInterest() {
            return researchInterest;
        }

        public void setResearchInterest(String researchInterest) {
            this.researchInterest = researchInterest;
        }

        public String getNetwork() {
            return network;
        }

        public void setNetwork(String network) {
            this.network = network;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public Object getConsentLetters() {
            return consentLetters;
        }

        public void setConsentLetters(Object consentLetters) {
            this.consentLetters = consentLetters;
        }

        public String getLetterStatus() {
            return letterStatus;
        }

        public void setLetterStatus(String letterStatus) {
            this.letterStatus = letterStatus;
        }

        public String getEditorEmail() {
            return editorEmail;
        }

        public void setEditorEmail(String editorEmail) {
            this.editorEmail = editorEmail;
        }

        public String getEditorPhno() {
            return editorPhno;
        }

        public void setEditorPhno(String editorPhno) {
            this.editorPhno = editorPhno;
        }
    }
}
