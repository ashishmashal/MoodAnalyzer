package com.bridgelabz;

public class MoodAnalyzer {
    public String GetMood(String message) {
        if(message.contains("sad")){
            return "SAD";
        }
        else if (message.contains("Happy")){
            return "HAPPY";
        }
        else {
            return null;
        }
    }
}
