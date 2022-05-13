package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;
    public MoodAnalyzer(String message){
        this.message=message;
        AnalyseMood();
    }
    public String AnalyseMood() {
        if(message.contains("sad")){
            return "SAD";
        }
        else {
            return null;
        }
    }
}
