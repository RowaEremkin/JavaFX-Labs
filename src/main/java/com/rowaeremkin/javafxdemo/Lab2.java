//Github: https://github.com/RowaEremkin/JavaFX-Labs
package com.rowaeremkin.javafxdemo;

public class Lab2 {
    public static class Film{
        public String name;
        public int year;
    }
    public interface Operation<T,Y> {
        T calculate(Y y);
    }
    public static String Oldest(int year){
        if(year<1900){
            return "Oldest";
        }
        else if(year<2000){
            return "Old";
        }
        else if (year<2024) {
            return "Latest";
        }
        else {
            return "Newest";
        }
    }
    public static String Mod(int year){
        return year%2==0?"+":"-";
    }
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.name = "Terminator";
        film1.year = 1989;
        Film film2 = new Film();
        film2.name = "Shrek";
        film2.year = 2010;

        Operation<String,Integer> yearTest = Lab2::Mod;
        System.out.println("Mod");
        System.out.println("Film("+film1.name+") mod: " +  yearTest.calculate(film1.year));
        System.out.println("Film("+film2.name+") mod: " +  yearTest.calculate(film2.year));
        yearTest = Lab2::Oldest;
        System.out.println("Oldest");
        System.out.println("Film("+film1.name+") oldest: " +  yearTest.calculate(film1.year));
        System.out.println("Film("+film2.name+") oldest: " +  yearTest.calculate(film2.year));
        yearTest = (Integer year)-> String.valueOf(year + 10);
        System.out.println("+10");
        System.out.println("Film("+film1.name+") +10: " +  yearTest.calculate(film1.year));
        System.out.println("Film("+film2.name+") +10: " +  yearTest.calculate(film2.year));

    }
}
