/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.colelieberthal.movielab1;


/**
 *
 * @author cal
 */
class MovieLab1 {

    public static void main(String[] args) {
        
        //String Demonstration
        
        System.out.println(sum);
        String step1 = new String("stepA");
        System.out.println(step1.length());
        System.out.println(step1.substring(0,3));
        System.out.println(step1.substring(1));
        System.out.println(step1.compareTo("johnny"));
        System.out.println(step1.equals("johnDoe"));
        System.out.println(step1.indexOf("e"));
        
        //Step 2 of Lab
        
        String movie1 = "Friday Night Lights";
        Movie movieA = new Movie(movie1);
        movieA.setRating(3.0);
        movieA.setReview("Amazing emotional movie!");
        String movie2 = "Titanic";
        Movie movieB = new Movie(movie2, 1997);
        movieB.setRating(3.9);
        movieB.setReview("A great movie, the special effects could have been better.");
        
        //Print Statements
        //There are quite a few so...
       
        System.out.println("\n\nOrginal Title: " + movie1);
        System.out.println("Proper Title: " + movieA.getProperTitle());
        System.out.println("All Caps Title: " + movieA.getUpperCaseTitle());
        System.out.println("Year Published: " + movieA.getYear());
        System.out.println("Review: " + movieA.getReview());
        System.out.println("Rating: This movie was rated " + movieA.getRating() + " stars.\n");
        
        //Movie B
        
        System.out.println("Orginal Title: " + movie2);
        System.out.println("Proper Title: " + movieB.getProperTitle());
        System.out.println("All Caps Title: " + movieB.getUpperCaseTitle());
        System.out.println("Year Published: " + movieB.getYear());
        System.out.println("Review: " + movieB.getReview());
        System.out.println("Rating: This movie was rated " + movieB.getRating() + " stars.");
        //All Movie information is sourced from IMDB
        //Reviews in this code are purely a work of fiction and do not represent on puropse any infliction of a real review.
    }
}





//Provided Code

    class Movie {

    private String title;
    private String review;
    private double rating;

    // Constructor that takes the title as is

    public Movie(String title) {
        this.title = title;
        this.review = "A heart pulling movie based on a true story.";
        this.rating = 3.0;
    }

    // Overloaded constructor that takes title and year, e.g., "Inception (2010)"
    public Movie(String title, int year) {
        this.title = title + " (" + year + ")";
        this.review = "No review provided.";
        this.rating = 0.0;
    }
    // Method to set a review for the movie

    public void setReview(String review) {
        this.review = review;
    }
    // Method to set a rating for the movie (0.0 to 5.0)

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 0.0 and 5.0.");
        }
    }
    // Method to get the title in proper case

    public String getProperTitle() {
        return title.substring(0, 1).toUpperCase()
                + title.substring(1).toLowerCase();
    }
    // Method to get the title in all uppercase

    public String getUpperCaseTitle() {
        return title.toUpperCase();
    }
    // Method to extract year from the title, returns "No year provided" if not present

    public String getYear() {
        int startIndex = title.indexOf("(");
        int endIndex = title.indexOf(")");
        if (startIndex != -1 && endIndex != -1) {
            return title.substring(startIndex + 1, endIndex);
        }
        return "No year provided";
    }
    // Method to display the movie's review

    public String getReview() {
        return review;
    }
    // Method to display the movie's rating

    public double getRating() {
        return rating;
    }
}
