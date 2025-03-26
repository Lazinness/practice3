package tests;
import src.calc;


public class main {
    //імпорт функцій з калк.ява
    //клас що використовує імп. функції
    public static void main(String[] args) {

       //Path testFilePath = Paths.get("src\\calc.java");
       int a = 10; 
       int b = 5;

       calc obj = new calc();
       obj.add(a, b); 
   }

}
