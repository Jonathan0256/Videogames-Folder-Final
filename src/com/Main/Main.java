package com.Main;
import java.time.LocalDate;
import java.util.Set;

import com.users.User;
import com.videogame.Videogame;
import com.videogameLibrary.VideogamesLibrary;

public class Main {
    public static void main(String[] args) {
        VideogamesLibrary library = new VideogamesLibrary();

        User joan = new User("Joan23","joan@gmail.com","Joan","Rodriguez",LocalDate.of(1990, 5, 22));
        Videogame videogame1 = library.find(joan, "Return to Monkey Island");
        videogame1.showData();

        User josep = new User("Josep45","josep@gmail.com", "Josep", "Reixach",LocalDate.of(1992, 4, 3));
        Videogame videogame2 = library.find(josep, "Return to Monkey Island");
        videogame2.showData();

        System.out.println("\n** USERS WHO HAVE CONSULTED");
        Set<User> usersWhoHaveConsulted = videogame1.getUsersWhoHaveConsulted();
        for (User user : usersWhoHaveConsulted) {
            System.out.println(user.getNickname());
        }
    }
}