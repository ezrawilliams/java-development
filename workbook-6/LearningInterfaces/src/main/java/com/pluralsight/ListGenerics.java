package com.pluralsight;

import java.util.ArrayList;

public class ListGenerics<E> {
    public static<E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>();
        for(E element: list){
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static<E> ArrayList<E> mergeLists(ArrayList<E> list1,
                                             ArrayList<E> list2){
        ArrayList<E> newList = new ArrayList<>();
        int list1Size = list1.size();
        int list2Size = list2.size();
        int maxSize = Math.max(list1Size,list2Size);
        for (int i=0; i<maxSize; i++){
            if (i<list1Size){
                newList.add(list1.get(i));
            }
            if (i<list2Size){
                newList.add(list2.get(i));
            }
        }
        return newList;
    }

    public static<E> ArrayList<E> reverseList(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>();
        for (int i =list.size()-1; i>=0; i--){
            newList.add(list.get(i));
        }
        return newList;
    }


}
