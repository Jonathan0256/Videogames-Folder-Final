package com.users;
import java.time.LocalDate;

public class User {
    private final int id;
    private static int lastId = 0;
    private String nickname;
    private String name;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    
    public User(String nickname, String name, String lastName, String email, LocalDate birthDate) {
        this.nickname = nickname;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;

        lastId++;
        this.id = lastId;
    }
    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
    public String getName() {
        return name;
    }
    public String getlastName() {
        return lastName;
    }
    public String getemail() {
        return email;
    }
    public LocalDate getbirthDate() {
        return birthDate;
    }
}