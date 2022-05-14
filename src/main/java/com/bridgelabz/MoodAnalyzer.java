package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;

    //Using constructor
    public MoodAnalyzer(String message){
        this.message=message;
        AnalyseMood();
    }
    public String AnalyseMood() {
        if(message.contains("sad")){
            return "SAD";
        }
        else if (message.contains("any")){
            return "HAPPY";
        }
        else {
            return null;
        }
    }
}
