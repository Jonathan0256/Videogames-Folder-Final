import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.users.User;
import com.videogame.Videogame;
import com.videogameLibrary.VideogamesLibrary;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class VideogamesLibraryTest {

    private VideogamesLibrary library;

    @BeforeEach
    void setUp() {
        library = new VideogamesLibrary();
    }

    @Test
    void findExistingVideogame() {
        User user = new User("jona2", "Jonathan", "Rodas", "jona.rodas@hotmail.com", LocalDate.of(2001, 1, 1));
        Videogame game = library.find(user, "Return to Monkey Island");
        assertNotNull(game);
        assertEquals("Return to Monkey Island", game.getName());
    }

    @Test
    void findNonExistingVideogame() {
      User user = new User("biel3", "Biel", "Casas", "biel.casas@hotmail.com", LocalDate.of(1999, 1, 1));
        Videogame game = library.find(user, "Non-existing Game");
        assertNull(game);
    }

    @Test
    void userAddedToConsultedList() {
      User user = new User("edu3", "Edu", "Martinez", "edu.martinez@hotmail.com", LocalDate.of(2000, 1, 1));
        Videogame game = library.find(user, "Return to Monkey Island");
        assertTrue(game.getUsersWhoHaveConsulted().contains(user));
    }
}