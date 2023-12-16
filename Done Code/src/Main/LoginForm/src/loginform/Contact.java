package loginform;

import java.util.*;

import javax.swing.JOptionPane;

public class Contact {
    private String name;
    private String phone = "";
    private String ePhone = "";
    private String eEmail = "";
    private String address;
    private String email;
    private int ID = -1;

    public Contact() {
    }

    public Contact(String name, String phone, String Ephone, String address, String email, String eEmail,int id) {
        setName(name);
        setAddress(address);
        setPhone(phone);
        setEmail(email);
        this.ePhone = Ephone;
        this.eEmail = eEmail;
        this.ID = id;
    }

    public Contact(String email, String password) {
        System.out.println("two paras");
        setEmail(email);
    }

    public String getephone() {
        return this.ePhone;
    }

    public void setephone(String s) {
        this.ePhone = s;
    }

    public String geteEmail() {
        return this.eEmail;
    }

    public void seteEmail(String s) {
        this.eEmail = s;
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

        this.phone = phone;

    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (validAddress(address)) {
            this.address = address;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getID() {
        return this.ID;
    }

    static boolean validPhone(String phone) {
        phone=phone.trim();
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
        name = name.trim();
        if (name.matches("[a-zA-Z ]*")) {
            return true;
        }
        System.err.println("Invalid Name, please enter a valid one");
        return false;
    }

    static boolean validAddress(String address) {
        address = address.trim();
        if (address.matches(("^[a-zA-Z0-9.,\\s]+$"))) {
            return true;
        }
        System.out.println("Invalid address, please Enter a valid one");
        return false;
    }

    public void setID(int id) {
        this.ID = id;
    }
}
