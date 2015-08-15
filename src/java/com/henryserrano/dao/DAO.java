/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henryserrano.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Sistemas
 */
public class DAO {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public void Conectar() throws SQLException, Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e){
            throw e;
        }
        cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/registros?user=root&password=solouso30");
                     
    }
    
    public void Cerrar() throws Exception{
        try{
        if(cn!=null){
            if(cn.isClosed()==false){
                cn.close();
            }
        }
    }catch(Exception e){
        throw e;
        
    }
    }
    

}
