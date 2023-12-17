package loginform;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Registration {

  private String email;
  private String password;
  private int ID = -1;
  private String encryptedEmail;
  private boolean admin = false;

  public Registration(String email, String password) {
    giveRandomId();
    setEmail(email);
    setPass(password);
  }

  public Registration(boolean admin) {
    if (admin) {
      this.email = "admin";
      this.password = "admin";
      this.admin = true;
      this.ID = 69;
    }
  }

  {
    addIds();
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEncryptedEmail() {
    return this.encryptedEmail;
  }

  public void setEncryptedEmail(String encryptedEmail) {
    this.encryptedEmail = encryptedEmail;
  }

  static Set<Integer> randomIds = new HashSet<>();

  public Registration() {}

  private void addIds() {
    // setID(getID() + 2);
    int desiredSize = 1200;
    while (randomIds.size() < desiredSize) {
      int random = 0;
      while (random == 0) {
        random = (int) (Math.random() * Math.pow(10, 5));
      }
      randomIds.add(random);
    }
  }

  public void giveRandomId() {
    Iterator<Integer> iterator = randomIds.iterator();
    if (iterator.hasNext()) {
      while (iterator.hasNext()) {
        int potentialId = iterator.next();
        if (
          RegistrationForm.form
            .stream()
            .noneMatch(account -> account.getID() == potentialId)
        ) {
          this.ID = potentialId;
          iterator.remove();
          return;
        }
      }
    } else {
      System.err.println("No more available IDs");
    }
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (validEmail(email)) {
      this.email = email;
    }
  }

  public String getPass() {
    return password;
  }

  public void setPass(String password) {
    if (isValidPassword(password)) {
      this.password = password;
    }
  }

  public int getID() {
    return ID;
  }

  static boolean validEmail(String email) {
    email = email.trim();
    if (email.matches(("^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))) {
      return true;
    }
    System.out.println("Invalid email: " + email);
    return false;
  }

  public static boolean isValidPassword(String password) {
    if (
      password.matches(
        "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
      )
    ) {
      return true;
    }
    System.out.println("Invalid password: " + password);
    return false;
  }

  public void setID(int id) {
    this.ID = id;
  }
}
