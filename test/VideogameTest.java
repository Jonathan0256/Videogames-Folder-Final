import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.users.User;
import com.videogame.Videogame;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class VideogameTest {

    private Videogame videogame;

    @BeforeEach
    void setUp() {
        videogame = new Videogame("God of War", "Action", "PS5", 49.99f);
    }

    @Test
    void getName() {
        assertEquals("God of War", videogame.getName());
    }

    @Test
    void setAndGetGenre() {
        videogame.setGenre("Action");
        assertEquals("Action", videogame.getGenre());
    }

    @Test
    void setAndGetPlayersNumber() {
        videogame.setPlayersNumber(100);
        assertEquals(100, videogame.getPlayersNumber());
    }

    @Test
    void setAndGetPrice() {
        videogame.setPrice(59.99f);
        assertEquals(59.99f, videogame.getPrice(), 0.01);
    }

    @Test
    void addUsersWhoHaveConsulted() {
        String userName = "markus";
        User user = new User(userName, "Markus", "Persson", "markus.persson@hotmail.com", LocalDate.of(1990, 1, 1));
        videogame.addUsersWhoHaveConsulted(user);
        assertTrue(videogame.getUsersWhoHaveConsulted().contains(user));
    }
}