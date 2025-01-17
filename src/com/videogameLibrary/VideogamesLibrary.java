package com.videogameLibrary;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.videogame.Videogame;
import com.users.User;

public class VideogamesLibrary {
    private Set<Videogame> videogames;
    private Set<Videogame> games;

    public VideogamesLibrary() {
        videogames = new HashSet<>();
        createInitialVideogames();
    }

    public Set<Videogame> getVideogames() {
        return videogames;
    }

    public void addVideogame(Videogame game) {
        videogames.add(game);
        games.add(game);
    }

    public Videogame find(User user, String videogameName) {
        Videogame videogameFound = find(videogameName);
        if (videogameFound != null) {
            videogameFound.addUsersWhoHaveConsulted(user);
        }
        return videogameFound;
    }

    public Videogame find(String videogameName) {
        for (Videogame videogame : videogames) {
            if (videogame.getName().equalsIgnoreCase(videogameName)) {
                return videogame;
            }
        }
        return null;
    }

    public List<Videogame> searchByCategory(String category) {
        return videogames.stream()
                .filter(game -> game.getGenre().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Videogame> searchByPlatform(String platform) {
        return videogames.stream()
                .filter(game -> game.getPlatform().toLowerCase().contains(platform.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Videogame> searchByPriceRange(float minPrice, float maxPrice) {
        return videogames.stream()
                .filter(game -> game.getPrice() >= minPrice && game.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    private void createInitialVideogames() {
    
        Videogame returnToMonkeyIsland = new Videogame("Return to Monkey Island", "Point and click",
                "Windows, mac, Switch", 22.99f);
        returnToMonkeyIsland.setPlayersNumber(15539);
        returnToMonkeyIsland.setSetting("Pirates");
        returnToMonkeyIsland.setRecommendedAgePEGI("12");
        returnToMonkeyIsland.setSpecificContentPEGI("Moderate Violence");
        returnToMonkeyIsland.setRequirements("""
                Minimum requirements
                Memory: 8 GB
                Graphics Card: AMD Radeon HD 7750
                CPU: Intel Core i3-3240
                File Size: 4 GB
                OS: Windows 10

                Recommended specs
                Memory: 4 GB
                Graphics Card: NVIDIA GeForce 510
                CPU: Intel Core 2 Duo E8400
                File Size: Unknown
                OS: TBA""");
        videogames.add(returnToMonkeyIsland);

        Videogame dummyVideogame = new Videogame("Dummy name", "Dummy Genre", "Dummy platform", 99f);
        dummyVideogame.setPlayersNumber(99);
        dummyVideogame.setSetting("Dummy setting");
        dummyVideogame.setRecommendedAgePEGI("Dummy age");
        dummyVideogame.setSpecificContentPEGI("Dummy content");
        dummyVideogame.setRequirements("Dummy requirements");
        videogames.add(dummyVideogame);
    }
}
