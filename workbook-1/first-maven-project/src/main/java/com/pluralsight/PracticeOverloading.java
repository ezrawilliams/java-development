package com.pluralsight;
/*
Attributes - className, classCode (int), passing (boolean) - private
two constructors - one with all arguments and a default constructor;
getters and setters for each attribute;
 */

public class PracticeOverloading {
    private int classCode;
    private boolean passing;
    private String className;

    public PracticeOverloading(int classCode,boolean passing,String className){
        this.classCode = classCode;
        this.passing = passing;
        this.className = className;
    }
       public PracticeOverloading(){
        classCode=0;
        passing= false;
        className="";


       }

    public void setName(String className){
        this.className = className;
    }
    public void setClassCode(int classCode){
        this.classCode = classCode;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
    }
}
    public void String className(){
        return className;
}