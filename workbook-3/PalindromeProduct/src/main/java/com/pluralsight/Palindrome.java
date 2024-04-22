package com.pluralsight;

public class Palindrome {
    public static void main(String[] args) {
        String palindromeString;
        String palindromeReverseString;
        String max = "";
        int maxLength = max.length();
        int product;
        for(int i=1; i<=999;i++){
            for(int j=1; j<=999;j++){
                product = i*j;
                palindromeString = String.valueOf(product);
                StringBuilder sb = new StringBuilder(palindromeString);
                palindromeReverseString = sb.reverse().toString();
                if (palindromeReverseString.equals(palindromeString) &&
                        (palindromeReverseString.length()>maxLength)) {
                    max=palindromeReverseString;
                }
            }
        }
        System.out.println(max);
    }
}
