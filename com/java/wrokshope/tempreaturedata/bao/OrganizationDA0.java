
package main.java.com.vetias.java.workshop.tempdata.DAO;

import java.sql.Connection;

public class OrganizationDA0 {
    public void createTable(){
        JdbcDataSource h2dDataSource = new jdbcSource();
        h2dDataSource.setUrl("jdbc:memtempdataDB");
        h2dDataSource.setUser("sa");
        try(Connection dbConnection = h2dDataSource.getCOnnection()){
            Statemement statement = dbConnection.createStatement();
            statement.execute("""
                    create table organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR9(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    )
                    """;)
        }
    }

}