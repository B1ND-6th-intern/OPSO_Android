package org.techtown.opso_android;


public class Home_Page_Info {
    String date;

    int classNum;
    int picture;
    String name;
    String hash;
    String contents;

    int cmt_classNum;
    String cmt_name;
    String cmt_contents;

    public Home_Page_Info(String date, int classNum, int picture, String name, String hash, int cmt_classNum, String cmt_name, String contents, String cmt_contents) {
        this.date = date;
        this.classNum = classNum;
        this.picture = picture;
        this.name = name;
        this.hash = hash;
        this.cmt_classNum = cmt_classNum;
        this.cmt_name = cmt_name;
        this.contents = contents;
        this.cmt_contents = cmt_contents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }


    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }


    public int getCmt_classNum() {
        return cmt_classNum;
    }

    public void setCmt_classNum(int cmt_classNum) {
        this.cmt_classNum = cmt_classNum;
    }


    public String getCmt_name() {
        return cmt_name;
    }

    public void setCmt_name(String cmt_name) {
        this.cmt_name = cmt_name;
    }


    public String getContents() {
        return contents;
    }

    public void setContents() {
        this.contents = contents;
    }


    public String getCmt_contents() {
        return cmt_contents;
    }

    public void setCmt_contents() {
        this.cmt_contents = cmt_contents;
    }

}
