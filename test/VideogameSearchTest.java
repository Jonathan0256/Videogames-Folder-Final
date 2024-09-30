import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.videogame.Videogame;
import com.videogameLibrary.VideogamesLibrary;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class VideogameSearchTest {

    private VideogamesLibrary library;

    @BeforeEach
    void setUp() {
        library = new VideogamesLibrary();
    }

    @Test
    void searchVideogamesByCategory() {
        List<Videogame> results = library.searchByCategory("RPG");
        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    @Test
    void searchVideogamesByPlatform() {
        List<Videogame> results = library.searchByPlatform("Windows");
        assertNotNull(results);
        assertFalse(results.isEmpty());
    }

    @Test
    void searchVideogamesByPriceRange() {
        List<Videogame> results = library.searchByPriceRange(10.0f, 30.0f);
        assertNotNull(results);
        assertFalse(results.isEmpty());
    }
}
