package com.pluralsight;

import java.util.regex.Pattern;

public class NameFormatter {
    //Attributes:
    /*
    When the class is static with only static attributes and methods
    there is no need for instances since they will not be able to access
    those attributes and method anyway. In this case, you make the
    constructor private.
     */
   private NameFormatter(){

    }

    public static String format(
            String firstName,
            String lastName
    ){
        String formattedName =
                String.format(lastName+", "+firstName);
        return formattedName;
    }

    public static String format(
            String prefix,
            String firstName,
            String middleName,
            String lastName,
            String suffix
    ){
        String formattedName = lastName+" "+
                prefix+" "+firstName+" "+
                middleName+", "+suffix;
        return formattedName;

    }

    public static String format(
            String fullName
    ){
        String[] splitName = fullName.split(Pattern.quote(" "));
        String formatted = "";
        if (splitName.length==5){
            formatted = format(splitName[0], splitName[1], splitName[2],
                    splitName[3], splitName[4]);
        } else if (splitName.length==4){
            formatted = splitName[2]+" "+splitName[0]+" "
                    +splitName[1]+", "+splitName[3];
        } else
            formatted =String.format("%s, %s", splitName[1], splitName[0]);
    return formatted;
    }
}
