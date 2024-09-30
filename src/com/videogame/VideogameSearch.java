package com.videogame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.videogameLibrary.VideogamesLibrary;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;

class VideogameSearch {

  private VideogamesLibrary library;
  private VideogameSearch search;

  public VideogameSearch(VideogamesLibrary library) {
    this.library = library;
  }

  @BeforeEach
  void setUp() {
    library = new VideogamesLibrary();
    search = new VideogameSearch(library);

    library.addVideogame(new Videogame("Test Game 1", "Action", "PC", 49.99f));
    library.addVideogame(new Videogame("Test Game 2", "Adventure", "PlayStation", 59.99f));
    library.addVideogame(new Videogame("Test Game 3", "Action", "Xbox", 39.99f));
    library.addVideogame(new Videogame("Test Game 4", "RPG", "PC", 29.99f));
  }
}
