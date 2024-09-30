package com.users;

import java.util.HashMap;
import java.util.Map;

public class UserAuthService {

  private Map<String, String> users = new HashMap<>();
  private Map<String, String> emails = new HashMap<>();

  public boolean register(String username, String password, String email) {

    if (users.containsKey(username) || emails.containsKey(email)) {
      return false;
    }

    users.put(username, password);
    emails.put(email, username);
    return true;
  }

  public boolean login(String username, String password) {
    return users.containsKey(username) && users.get(username).equals(password);
  }
}
