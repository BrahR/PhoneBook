package loginform;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Contacts {
  static ArrayList<Contact> contacts = new ArrayList<>();

  public Contacts() {
  }

  public Contacts(Contact obj) {
    contacts.add(obj);
  }

  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  protected void addContact(String name, String phone, String Dphone, String address, String email, String eEmail) {

    contacts.add(new Contact(name, phone, Dphone, address, email, eEmail));
    System.out.println("Contact added");

  }

  protected void addContact(String email, String passwrod) {
    contacts.add(new Contact(email, passwrod));
    System.out.println("Contact added");

  }

  // protected void addContact(User obj) {
  // Contact newContact = new Contact(obj.getName(), obj.getPhone(),
  // obj.getAddress());
  // contacts.add(newContact);
  // System.out.println("Contact added with ID: " + newContact.getID());
  // }
  protected void addContact(Contact obj) {
    contacts.add(obj);
    System.out.println("Contact added with ID: " + obj.getID());
  }

  public void editContact(int index, String name, String phone) {
    Contact contact = contacts.get(index);
    contact.setName(name);
    contact.setPhone(phone);
    System.out.println("Contact has been edit");
  }

  public void deleteContacts(int index, String s) {
    if (s.equals("yes")) {
      contacts.clear();
    } else {
      contacts.remove(index);
      System.out.println("Contact has been deleted");
    }
  }

  public boolean exists(String s) {
    for (Contact obj : contacts) {
      if (obj.getPhone().equals(s)) {
        return true;
      }
    }
    return false;
  }

  public boolean idExists(int s) {
    for (Contact obj : contacts) {
      System.out.println(obj.getID());
      if (obj.getID() == s) {
        return true;
      }
    }
    return false;
  }

  public boolean emailAndIdExists(int s, String n) {
    for (Contact obj : contacts) {
      System.out.println(obj.getID());
      if (obj.getID() == s & obj.getEmail().equals(n)) {
        return true;
      }
    }
    return false;
  }

  public boolean emailExists(String s) {
    for (Contact obj : contacts) {
      if (obj.getEmail().equals(s)) {
        return true;
      }
    }
    return false;
  }

  public Contact returnPhoneObj(String s) {
    for (Contact obj : contacts) {
      if (obj.getPhone().equals(s)) {
        return obj;
      }
    }
    return null;
  }

  public Contact returnEmailObj(String s) {
    for (Contact obj : contacts) {
      if (obj.getEmail().equals(s)) {
        return obj;
      }
    }
    return null;
  }

  public Contact returnPhoneObjById(int s) {

    for (Contact obj : contacts) {
      if (obj.getID() == (s)) {
        return obj;
      }
    }
    return null;
  }

  public void deleteContactsViaPhone(String s) {
    for (Contact obj : contacts) {
      if (obj.getPhone().equals(s)) {
        contacts.remove(obj);
        return;
      }
    }
  }

  public void deleteContactsViaEmail(String s) {
    for (Contact obj : contacts) {
      if (obj.getEmail().equals(s)) {
        contacts.remove(obj);
        return;
      }
    }
  }

  public void deleteBookedContactsViaEmail(String s) {
    for (Contact obj : contacts) {
      if (obj.getEmail().equals(s) && obj.getBook() == 1) {
        contacts.remove(obj);
        return;
      }
    }

  }

  public boolean validIndex(int index) {
    if ((index) >= 0 && index < contacts.size()) {
      return true;
    }
    System.out.println("Invalid Contact ID, please a valid one ");
    return false;
  }

  public boolean isDuplicated(String phone) {

    for (Contact contact : contacts) {
      if (contact.getPhone().equals(phone) && contact.getBook() == 1) {
        System.out.println("Duplicated Phone number. Please enter another one.");
        return true;
      }
    }

    return false;
  }

  public boolean isDuplicatedEdit(String email, String phone) {
    if (new User().validPhone(phone)) {
      for (int i = 0; i < contacts.size(); i++) {
        if (!(contacts.get(i).getEmail().equals(email)) && contacts.get(i).getPhone().equals(phone)) {
          System.out.println("Duplicated Phone number. Please enter another one.");
          return true;
        }
      }
    }
    return false;
  }

  public boolean isValidLogin(String email, String password) {

    for (int i = 0; i < contacts.size(); i++) {
      if (email.equals(contacts.get(i).getEmail()) && password.equals(contacts.get(i).getPass())) {

        return true;
      }
    }
    System.out.println("InValid Email or Passowrd");
    return false;
  }

  public boolean isValidContact(String email) {
    for (int i = 0; i < contacts.size(); i++) {
      if (email.equals(contacts.get(i).getEmail())) { // false
        return false;
      }
    }
    return true;
  }

  public void registerAccount(String email, String password) {

    if (isValidContact(email)) { // true
      Contact contact = new Contact(email, password);
      contacts.add(contact);
      System.out.println("Registration successful");
    } else {

      System.out.println("Already registered");
    }
  }

  public Contact returnBook(String Email, int id) {
    for (Contact con : contacts) {
      if (con.getEmail().equals(Email) && con.getID() == id && con.getBook() == 1) {
        return con;
      }
    }
    return null;
  }

  public void deleteAccount(String email) {
    for (Contact co : contacts) {
      if (co.getEmail().equals(email)) {
        deleteBookedContactsViaEmail(email);
      }
    }
  }

}
