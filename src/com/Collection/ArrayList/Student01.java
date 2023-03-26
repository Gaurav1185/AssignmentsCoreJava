package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student01 {
    List<Integer> marks;
    public List<Integer> getMarks(){
        return marks;
    }
    public void setMarks(List<Integer> marks){this.marks=marks;}
    public List<Integer> sortMarks(){
        Collections.sort(marks);
        return marks;
    }
    public ArrayList<Integer> addGraceMarks(){
        ArrayList<Integer> al=new ArrayList();
        for (int i = 0; i <marks.size() ; i++) {
            if(marks.get(i)>30 && marks.get(i)<35){
                int newMarks=marks.get(i)+5;
                al.add(newMarks);
            }

        }
        return al;
    }
    public int getMaxMarks(){
        return Collections.max(marks);
    }
}
