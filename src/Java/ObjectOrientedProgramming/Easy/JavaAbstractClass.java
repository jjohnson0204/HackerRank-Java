package Java.ObjectOrientedProgramming.Easy;

import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

    //Write MyBook class here
    // not static for hackerrank.....
    static class MyBook extends Book {
        @Override
        void setTitle(String s) {
            this.title = s;
        }
    }
}
public class JavaAbstractClass {
    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        Book.MyBook new_novel=new Book.MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}
