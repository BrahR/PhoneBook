package loginform;

import java.util.ArrayList;

public class BookedContacts {

  static ArrayList<Contact> contacts = new ArrayList<>();

  public BookedContacts() {}

  public BookedContacts(Contact obj) {
    contacts.add(obj);
  }

  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  protected void addContact(
    String name,
    String phone,
    String Dphone,
    String address,
    String email,
    String eEmail,
    int id
  ) {
    contacts.add(new Contact(name, phone, Dphone, address, email, eEmail, id));
    System.out.println("Contact added");
  }

  protected void addContact(String email, String password) {
    contacts.add(new Contact(email, password));
    System.out.println("Contact added");
  }

  protected void addContact(Contact obj) {
    contacts.add(obj);
    System.out.println("Contact added with ID: " + obj.getID());
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
      if (obj.getEmail().equals(s)) {
        contacts.remove(obj);
        return;
      }
    }
  }

  public static boolean isValidContact(String email) {
    for (Contact contact : contacts) {
      if (email.equals(contact.getEmail())) {
        return false;
      }
    }
    return true;
  }

  public void deleteBooked(String email) {
    for (Contact contact : contacts) {
      if ((contact.getEmail().equals(email))) {
        contacts.remove(contact);
        return;
      }
    }
  }

  public ArrayList<Contact> returnBookedOBjs(String email) {
    ArrayList<Contact> objs = new ArrayList<>();
    for (Contact contact : contacts) {
      if (contact.getEmail().equals(email)) {
        objs.add(contact);
      }
    }
    return objs;
  }

  public static boolean isDuplicated(String phone) {
    return contacts.stream().anyMatch(cont -> cont.getPhone().equals(phone));
  }

  public static boolean isDuplicatedEdit(int id, String phone) {
    return contacts
      .stream()
      .anyMatch(cont -> cont.getID() != id && cont.getPhone().equals(phone));
  }

  public static boolean findId(int id) {
    for (Contact obj : contacts) {
      System.out.println(obj.getID() + " " + id);
      if (obj.getID() == id) {
        return true;
      }
    }
    return false;
  }

}
