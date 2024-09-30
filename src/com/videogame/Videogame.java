package com.videogame;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.users.User;

public class Videogame {
    private String name;
    private String genre;
    private int playersNumber;
    private float price;
    private String platforms;
    private String setting;
    private String recommendedAgePEGI;
    private String specificContentPEGI;
    private String requirements;
    private String category;
    private Set<User> usersWhoHaveConsulted;
    private Map<User, Review> reviews;

    public Videogame(String name, String genre, String platforms, float price) {
        this.name = name;
        this.genre = genre;
        this.platforms = platforms;
        this.price = price;
        this.usersWhoHaveConsulted = new HashSet<>();
        this.reviews = new HashMap<>();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlatform() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getRecommendedAgePEGI() {
        return recommendedAgePEGI;
    }

    public void setRecommendedAgePEGI(String recommendedAgePEGI) {
        this.recommendedAgePEGI = recommendedAgePEGI;
    }

    public String getSpecificContentPEGI() {
        return specificContentPEGI;
    }

    public void setSpecificContentPEGI(String specificContentPEGI) {
        this.specificContentPEGI = specificContentPEGI;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Set<User> getUsersWhoHaveConsulted() {
        return usersWhoHaveConsulted;
    }

    public void addUsersWhoHaveConsulted(User user) {
        usersWhoHaveConsulted.add(user);
    }

    public void showData() {
        System.out.println(this.getName());
        System.out.println("-------------------------------");
        System.out.println("* GENRE: " + this.getGenre());
        System.out.println("* PLAYERS NUMBER: " + this.getPlayersNumber());
        System.out.println("* PRICE: " + this.getPrice());
        System.out.println("* PLATFORMS: " + this.getPlatform());
        System.out.println("* SETTINGS: " + this.getSetting());
        System.out.println("* RECOMMENDED AGE (PEGI): " + this.getRecommendedAgePEGI());
        System.out.println("* SPECIFIC CONTENT (PEGI) : " + this.getSpecificContentPEGI());
        System.out.println("* REQUIREMENTS:\n" + this.getRequirements());
        System.out.println();
        System.out.println();
    }

    public boolean addReview(User user, String comment, int rating) {
        if (rating < 1 || rating > 5) {
            return false;
        }
        Review review = new Review(comment, rating);
        reviews.put(user, review);
        return true;
    }

    private class Review {
        private String comment;
        private int rating;

        public Review(String comment, int rating) {
            this.comment = comment;
            this.rating = rating;
        }

        public String getComment() {
            return comment;
        }

        public int getRating() {
            return rating;
        }

        public String getVideogames() {
            return name;
        }
    }

}
