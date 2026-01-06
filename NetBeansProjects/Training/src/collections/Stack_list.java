/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.Stack;
/**
 *
 * @author mohan
 */
public class Stack_list {
    public static void main(String[] args){
        Stack <String> books = new Stack<>();
        books.add("Red");
        books.add("Black");
        books.add(0,"White");
        books.add(null);
        System.out.println(books);
        System.out.println(books.set(1, "yellow"));
        System.out.println(books.get(3));
        System.out.println(books.contains("White"));
        System.out.println(books.remove(0));
        System.out.println(books);
    }
}
