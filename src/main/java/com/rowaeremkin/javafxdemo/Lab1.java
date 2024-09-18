package com.rowaeremkin.javafxdemo;

public class Lab1 {
    public  interface IFilm {
        public String GetName();
        public String GetYear();
        public String GetDirector();
        public String GetGenre();
    }
    public static void main(String[] args) {
        IFilm film = new IFilm() {
            String name = "Terminator";
            String year = "1998";
            String director = "Tom";
            String genre = "Shooter";
            @Override
            public String GetName() {
                return name;
            }

            @Override
            public String GetYear() {
                return year;
            }

            @Override
            public String GetDirector() {
                return director;
            }

            @Override
            public String GetGenre() {
                return  genre;
            }
        };
        System.out.println("Film: " + film.GetName());
    }
}