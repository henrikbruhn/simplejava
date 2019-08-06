/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author henrik
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("noget mere fornuftigt...");
        System.out.println("en linje");
        
        NewClass obj = new NewClass("mere hallo");
        System.out.println(obj);
    }
    
}
