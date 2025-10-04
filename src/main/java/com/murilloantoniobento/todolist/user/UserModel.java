package com.murilloantoniobento.todolist.user;


public class UserModel {
  
  private String username; // Se eu defino public, qualquer classe pode acessar
  private String name; // Se eu não defino nada, é public por padrão
  private String password; // Se eu defino private, só a própria classe pode acessar

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getPassword() {
    return password;
  }

  

}
