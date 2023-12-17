package loginform;

import java.util.ArrayList;

/**
 * The {@code RegistrationForm} class represents a collection of user registrations and provides
 * methods to manage user accounts such as adding registrations, checking for email existence,
 * validating login credentials, deleting accounts, and retrieving registrations by ID or email.
 *
 * <p>Usage example:</p>
 * <pre>
 *     // Creating a RegistrationForm instance
 *     RegistrationForm registrationForm = new RegistrationForm();
 *
 *     // Adding a new registration to the form
 *     Registration newRegistration = new Registration(numbah one);
 *     registrationForm.addRegistration(newRegistration);
 *
 *     // Checking if an email already exists in the form
 *     boolean emailExists = registrationForm.emailExists("user@example.com");
 *
 *     // Validating login credentials
 *     boolean isValidLogin = registrationForm.isValidLogin("user@example.com", "password123");
 *
 *     // Deleting an account by email
 *     registrationForm.deleteAccount("user@example.com");
 *
 *     // Retrieving a Registration object by ID
 *     Registration registrationById = registrationForm.returnObjViaId(123);
 * </pre>
 *
 * <p>Note: The class uses the {@code Registration} class to represent user registrations.</p>
 *
 * @authors Omar & Khemu ☥
 * @version 1.0
 * @since 2023-12-16
 */
public class RegistrationForm {

  public static ArrayList<Registration> form = new ArrayList<>();

  public RegistrationForm() {}

  public static void addRegistration(Registration registration) {
    form.add(registration);
    System.out.println("Registration added with ID: " + registration.getID());
  }

  public static boolean emailDoesntExists(String email) {
    for (Registration registration : form) {
      if (registration.getEmail().equals(email)) {
        System.out.println(registration.getEmail() + " " + email);
        return false;
      }
    }
    return true;
  }

  public static boolean isValidLogin(String email, String password) {
    for (Registration registration : form) {
      if (
        email.equals(registration.getEmail()) &&
        password.equals(registration.getPass())
      ) {
        System.out.println("Logging in");
        return true;
      }
    }
    System.out.println("Invalid Email or Password");
    return false;
  }

  public static Registration returnObjViaId(int id) {
    return form
      .stream()
      .filter(cont -> cont.getID() == id)
      .findFirst()
      .orElse(null);
  }

  static boolean findEmail(String email) {
    return form.stream().anyMatch(cont -> cont.getEmail().equals(email));
  }

  public static boolean findId(int id) {
    for (Registration obj : form) {
      System.out.println(obj.getID() + " " + id);
      if (obj.getID() == id) {
        return true;
      }
    }
    return false;
  }

    public static Registration returnObjViaEmail(String email) {
    for (Registration obj : form) {
      System.out.println(obj.getEmail() .equals(email));
      if (obj.getEmail() .equals(email)) {
        return obj;
      }
    }
    return null;
  }
  public static boolean checkAccountDeletion(int id, String email) {
    return form
      .stream()
      .anyMatch(fo -> fo.getID() == id && fo.getEmail().equals(email));
  }

  public static void deleteAccount(String email) {
    form.removeIf(co -> co.getEmail().equals(email));
    BookedContacts.contacts.removeIf(co -> co.getEmail().equals(email));
  }

  public static boolean checkAdmin(String Email, String password) {
    if (Email.equals("admin") && password.equals("admin")) {
      return true;
    }
    return false;
  }
}
