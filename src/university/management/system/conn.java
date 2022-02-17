package university.management.system;

import java.sql.*;//1.import the driver

public class conn {

         Connection c;//these bothe connection and statement are an interface
         Statement s;


        public conn(){//this is a constructor instead of a function .you can do using function as well.
            // in that case you woud have to do function call .here you just have to create the object
            try {
                //2.load and register the driver
                Class.forName("com.mysql.cj.jdbc.Driver");//this driver is in the libraries
                //3.create the connection
                String user="root";
                String password="niharikamala2001";
                String url="jdbc:mysql://localhost:3300/project";//jdbc:mysql://localhost:3300/database name
                c=DriverManager.getConnection(url,user,password);//con is an object of class Connection
                //4.this is for creating the statement
                s=c.createStatement();//by this statemnt all our queries will be executed
                //5 and 6 executing adn processing hte result is doen where you are mkaing the object
                //execute update() is for update, insert , delete
                //execute query() is for select statement


                //c.close();//7 close the connection


            }

            catch (Exception e){
                e.printStackTrace();

            }


        }

    }


