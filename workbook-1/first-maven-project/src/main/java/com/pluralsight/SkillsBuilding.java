package com.pluralsight;

public class SkillsBuilding {
    public static void main(String[] args) {
// create a StringBuillder object
    StringBuilder skills = new StringBuilder();
// append strings to the StringBuilder object
    skills.append("Git, ");
    skills.append("HTML, ");
    skills.append("CSS, ");
    skills.append("and Bootstrap\n");
    skills.append("JavaScript, ");
    skills.append("ES6, ");
    skills.append("jQuery, ");
    skills.append("REST APIs, ");
    skills.append("and Express\n");
    skills.append("Angular\n");
    skills.append("Java\n");
// retrieve the underlying characters from
// the StringBuilder
   // String mySkills = skills.toString();
    /*it is a method that allows us to
    get a better view of an object

    */
    System.out.println(skills);
    }
}