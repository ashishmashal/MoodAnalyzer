package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;

    //Using constructor
    public MoodAnalyzer(String message){
        this.message=message;
        AnalyseMood();
    }
    public String AnalyseMood() {
        try{
            if(message.contains("sad")){
                return "SAD";
            }
            else {
                return null;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Occured");
        }
        return null;
    }
}
