package Main;

public class Contact {
  private String name = "";
  private String phone = "";
  private String email = "";
  private String password = "";

  public Contact() {
  }

  public Contact(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (validName(name)) {
      this.name = name;
    }
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    if (validPhone(phone)) {
      this.phone = phone;
    }
  }

  boolean validPhone(String phone) {
    if (phone.matches("^(01[0-2]|015)\\d{8}$")) {
      return true;
    }
    if (phone.length() != 11) {
      System.err.println("Phone number length must be 11");
    } else {
      System.err.println("Invalid Phone Number Format");
    }
    return false;
  }

  static boolean validName(String name) {
    if (name.matches("[a-zA-Z ]*")) {
      return true;
    }
    System.err.println("Invalid Name, please enter a valid one");
    return false;
  }

  public void setEmail(String email) {

    if (isValidEmail(email)) {
      this.email = email;
    } else {
      System.out.println("Error: Invalid email address");
    }

  }

  public boolean isValidEmail(String email) {
    return email.matches("^[a-zA-Z\\d+_.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$");
  }

  public String getEmail() {

    return email;

  }

  public void setPassword(String password) {

    if (isValidPassword(password)) {
      this.password = password;
    } else {
      System.out.println("Error: Invalid email address");
    }
  }

  public boolean isValidPassword(String password) {
    return password.matches("^(?=.*[a-zA-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$");
  }

  public String getPassword() {
    return password;
  }
}
