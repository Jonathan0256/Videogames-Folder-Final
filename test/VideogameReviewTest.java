import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import com.users.User;
import com.videogame.Videogame;

class VideogameReviewTest {
    private User user;
    private Videogame videogame;

    @BeforeEach
    void setUp() {
        videogame = new Videogame("Test Game", "Action", "PC", 49.99f);
        user = new User("_lautaro004", "Lautaro", "Martínez", "lautaro.martinez@hotmail.com", LocalDate.of(1995, 4, 3));
    }

    @Test
    void addReviewWithValidRating() {
        boolean reviewAdded = videogame.addReview(user, "Bon joc", 5);
        assertTrue(reviewAdded);
    }

    @Test
    void addReviewWithInvalidRating() {
        boolean reviewAdded = videogame.addReview(user, "Terrible", 6);
        assertFalse(reviewAdded);
    }

    @Test
    void addMultipleReviewsByDifferentUsers() {
        User user2 = new User("maria", "Maria", "Gomez", "maria@hotmail.com", LocalDate.of(1995, 1, 1));
        videogame.addReview(user, "Increíble", 4);
        boolean secondReviewAdded = videogame.addReview(user2, "Bon joc", 8);
        assertFalse(secondReviewAdded);
    }
}
