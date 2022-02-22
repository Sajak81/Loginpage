package org.personal.loginPage.modal;

public class Login {
    private String username;
    private String password;
    private String first_name;
    private String last_name;

    public Login(){

    }
    public Login(String username, String password , String first_name , String last_name){
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getUserName() {return username;}
    public void setUserName(String username) {this.username = username;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getFirstName() {return this.first_name;}
    public void setFirstName(String first_name) {this.first_name = first_name;}

    public String getLastName() {return last_name;}
    public void setLastName(String last_name) {this.last_name = last_name;}


    @Override
    public String toString(){
        return "Login{"
                +", username='" + username + '\''
                +", password='"+ password + '\''
                +", first_name='"+ first_name + '\''
                +", last_name='"+ last_name+ '\''
                +'}';
    }
}
