package com.bridgelabz.mood_analyser;

/*
*@Desc: MoodAnalyser is a class which is to check the mood analyser.
*@param is a containing String message.
 **/
public class MoodAnalyser  {
    String message;
    public MoodAnalyser() {

    }
//constructor is initializing a variable
    public MoodAnalyser(String message) {
        this.message=message;
    }
/*@Desc: analyseMood() return the sad or happy mood.
    @return :returning a sad or happy.

 **/
    public String analyseMood(String message) {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }

    /*@Desc:analyseMoodConstructor() it is contains a sad or happy mood.
     @return :returning a sad or happy
     **/
    public String analyseMoodConstructor() {
        if (message.contains("I am in sad mood")){
            return "SAD";
        } else if (message.contains("I am in happy mood")) {
            return "HAPPY";
        }
        return null;
    }
    //analyseMoodConstructorUsingTryCatch () function is to handle a null pointer exception
    public String analyseMoodConstructorUsingTryCatch() {
        try {
            if (message.contains(null)){
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            System.out.println(e.getLocalizedMessage());
            return "HAPPY";
        }
        return null;
    }
}
