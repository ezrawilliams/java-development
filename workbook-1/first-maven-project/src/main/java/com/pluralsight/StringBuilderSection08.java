package com.pluralsight;

public class StringBuilderSection08 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();//that's how we properly create objects
        str.append("Charles, ");
        str.append("Rafael, ");
        str.append("Onriel, ");
        str.append("Noel, ");
        str.append("Tina, ");
        str.append("Staphon, ");
        str.append("Samgwaa, ");
        str.append("Preson, ");
        str.append("Zamir, ");
        str.append("Emily, ");
        str.append("Rashed, ");
        str.append("Petunia, ");
        str.append("Liam, ");
        str.append("Acton, ");
        str.append("Gebrit, ");
        str.append("Hadi, ");
        str.append("Jasmine, ");
        str.append("Emerson, ");
        str.append("Natalia. ");

        System.out.println(str);

        StringBuilder ins = new StringBuilder("Ezra Williams");
        //capacity:
        System.out.println(str.capacity());
        System.out.println(ins.capacity());



    }

}
