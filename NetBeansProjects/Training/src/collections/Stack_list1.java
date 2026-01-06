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
public class Stack_list1 {
    public static void main(String[] args){
        Stack <String> books = new Stack<>();
        books.push("Red");
        books.add(null);
        books.add("Green");
        books.push("Black");
        System.out.println(books);
        System.out.println(books.peek());
        System.out.println(books.search("Black"));
        System.out.println(books.indexOf("Black"));
        System.out.println(books.empty());
        System.out.println(books.pop());
        System.out.println(books);
    }
}
