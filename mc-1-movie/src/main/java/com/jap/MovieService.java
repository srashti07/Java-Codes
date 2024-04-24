package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){
        Map<Movie,Integer> map = new HashMap<>();
        map.put(new Movie(101,"A Beautiful Mind","economic","11/1/2001"), 2);
        map.put(new Movie(102,"Boiler Room","Crime","1/1/2000"), 5);
        map.put(new Movie(103,"Buy and Cell","comedy","13/4/1988"), 4);
        map.put(new Movie(104,"Corsair","Crime","11/11/1997"), 4);
        map.put(new Movie(105,"Diamond Necklace","comedy","10/11/2021"), 3);
        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map, int rating){
        Set<String> resultSet = new TreeSet<>();
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getValue() == rating) {
                resultSet.add(entry.getKey().getMovieName());
            }
        }
        return resultSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        List<String> resultList = new ArrayList<>();
        int maxRating = Collections.max(map.values());
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxRating) {
                resultList.add(entry.getKey().getMovieName());
            }
        }
        return resultList;
    }

    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        Map<String,String> resultMap = new HashMap<>();
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getKey().getGenre().equalsIgnoreCase("comedy")) {
                resultMap.put(entry.getKey().getMovieName(), entry.getKey().getReleaseDate());
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set<String> set = movieService.getMovieNameWithRating4(map, 4);
        System.out.println("Rating 4: " + set);
        Map<String,String> map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movies: " + map1);
        List<String> list = movieService.getMovieWithHighestRating(map);
        System.out.println("Highest Rating: " + list);
    }
}
