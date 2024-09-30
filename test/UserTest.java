import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.users.User;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class UserTest {

    User user;
    static final String userName = "userName";

    @BeforeEach
void setUp() {
    user = new User(userName, "Jonathan", "Rodas", "jona@hotmail.com", LocalDate.of(2005, 4, 3));
}

    @Test
    void getNickname() {
        assertEquals(user.getNickname(), userName);
    }
    @Test
void getName() {
    assertEquals(user.getName(), "Jonathan");
}

@Test
void getLastName() {
    assertEquals(user.getlastName(), "Rodas");
}

@Test
void getEmail() {
    assertEquals(user.getemail(), "jona@hotmail.com");
}

@Test
void getBirthDate() {
    LocalDate expectedDate = LocalDate.of(2005, 4, 3);
    assertEquals(user.getbirthDate(), expectedDate);
}

}