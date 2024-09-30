import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.users.UserAuthService;

class UserAuthTest {

    private UserAuthService authService;

    @BeforeEach
    void setUp() {
        authService = new UserAuthService();
    }

    @Test
    void registerNewUser() {
        boolean isRegistered = authService.register("jona", "password123", "jona@hotmail.com");
        assertTrue(isRegistered);
    }

    @Test
    void registerExistingUser() {
        authService.register("marc", "password124", "marc@hotmail.com");
        boolean isRegistered = authService.register("marc", "password124", "marc@hotmail.com");
        assertFalse(isRegistered);
    }

    @Test
    void loginUserWithCorrectCredentials() {
        authService.register("raul", "password125", "raul@hotmail.com");
        boolean isLoggedIn = authService.login("raul", "password123");
        assertFalse(isLoggedIn);
    }

    @Test
    void loginUserWithIncorrectCredentials() {
        authService.register("laura", "password126", "laura@hotmail.com");
        boolean isLoggedIn = authService.login("laura", "wrongPassword");
        assertFalse(isLoggedIn);
    }
}
