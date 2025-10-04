package com.murilloantoniobento.todolist.user;

import lombok.Data;

@Data
public class UserModel {
  
  private String username; // Se eu defino public, qualquer classe pode acessar
  private String name; // Se eu não defino nada, é public por padrão
  private String password; // Se eu defino private, só a própria classe pode acessar


  

}
