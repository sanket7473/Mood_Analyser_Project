package com.bridgelabz.mood_analyser;

/*
*@Desc: MoodAnalyser is a class which is to check the mood analyser.
*@param is a containing String message.
 **/
public class MoodAnalyser {
    /*
    *@Desc : analyseMood is a method checking a SAD and HAPPY Message.
    * @param is a containing the Message variable.
     **/
    public String analyseMood(String message) {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }
}
