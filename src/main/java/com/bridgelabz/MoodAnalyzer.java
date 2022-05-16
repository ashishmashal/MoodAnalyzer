package com.bridgelabz;

public class MoodAnalyzer {
    private String message;



    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Handle Customized Exception using try-catch block
    public String analyseMood() throws MoodAnalyzerExceptionHanding {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerExceptionHanding(MoodAnalyzerExceptionHanding.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalyzerExceptionHanding(MoodAnalyzerExceptionHanding.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
