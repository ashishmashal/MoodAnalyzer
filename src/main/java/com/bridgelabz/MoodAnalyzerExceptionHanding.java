package com.bridgelabz;

public class MoodAnalyzerExceptionHanding extends Exception{
    ExceptionType type;

    //To inform user whether the mood entered is empty or null
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalyzerExceptionHanding(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
