package com.syntax.GroupProject2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println(email);
        } else {
            System.out.println("Invalid Email");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Username cannot be empty");
        }else{
            this.userName = userName;
            System.out.println(userName);
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.isEmpty()){
            System.out.println("Password cannot be empty");
        } else if (password.length() <7){
            System.out.println("Password is too . It must have at least 6 characters");
        }else {
            this.password = password;
            System.out.println(password);
        }
    }
}
