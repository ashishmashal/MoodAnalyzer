package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void getMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyzer moodAnalyser=new MoodAnalyzer();
        String result=moodAnalyser.GetMood("I am in sad mood");
        System.out.println(result);
        Assertions.assertEquals("SAD",result);
    }

    @Test
    public void getMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyser=new MoodAnalyzer();
        String result=moodAnalyser.GetMood("I am in Happy mood");
        System.out.println(result);
        Assertions.assertEquals("HAPPY",result);
    }
}
