package main.java.com.vetias.java.workshop.tempdata.DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class OrganizationDA0 {
    public void createTable(Connection dbConnection){
        try(Statemement statement = dbConnection.createStatement()){
            statement.execute("""
                    create table organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,   
                    DESCRIPTION VARCHAR(567))
                    """);
    }catch (SQLException sqlException){
        System.out.println("Error creating table"+sqlException);
    }                                      
 }
 public int save(Connection dbConnection,Organization vet){
    try( PreparedStatement preparedstatement = dbConnection.preparestatement("""
            insert into organization(name,website),email,contact_number,
            registration_no,description) values(?,?,?,?,?,?)
            """)){
                preparedstatement.setString(1, vet.name());
                preparedstatement.setString(2, vet.website());
                preparedstatement.setString(3, vet.email());
                preparedstatement.setString(4, vet.contact_Number());
                preparedstatement.setString(5, vet.registrationNumber());
                preparedstatement.setString(6, vet.description());
                preparedstatement.executeUpdate();
            }catch (SQLException sqlException){
                System.out.println("Erroe inserting into table :" + sqlException);
            }
   return 0;
 }
}