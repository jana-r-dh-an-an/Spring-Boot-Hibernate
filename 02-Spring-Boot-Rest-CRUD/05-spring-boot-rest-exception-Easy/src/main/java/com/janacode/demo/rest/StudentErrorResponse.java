package com.janacode.demo.rest;

public class StudentErrorResponse {

    private int status;
     private String meassage;
     private long timeStamp;


    public StudentErrorResponse(){
    }




    public StudentErrorResponse(int status, String meassage, long timeStamp) {
        this.status = status;
        this.meassage = meassage;
        this.timeStamp = timeStamp;
    }




    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMeassage() {
        return meassage;
    }
    public void setMeassage(String meassage) {
        this.meassage = meassage;
    }
    public long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

     
    
}
