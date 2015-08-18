/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henryserrano.dao;

import com.henryserrano.model.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sistemas
 */
public class PersonaDAO extends DAO {

    public void registrar(Persona per) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO persona (nombre, apellido,sexo,cedula,codigo) values (?,?,?,?,?)");
            st.setString(1, per.getNombre());
            st.setString(2, per.getApellido());
            st.setString(3, per.getSexo());
            st.setInt(4, (per.getCedula()));
            st.setLong(5, per.getCodigo());
            st.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public List<Persona> listar() throws Exception {
        List<Persona> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT id, nombre, apellido,sexo,cedula,codigo FROM persona");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                per.setApellido(rs.getString("apellido"));
                per.setSexo(rs.getString("sexo"));
                per.setCedula(rs.getInt("cedula"));
                per.setCodigo(rs.getLong("codigo"));
                lista.add(per);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    
    
       public Persona leerID(Persona per) throws Exception {
           Persona pers;
           ResultSet rs;
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT id, nombre, apellido, sexo, cedula, codigo WHERE id=?");
                   
            rs=st.executeQuery();
             while (rs.next()){
                 pers=new Persona();
                 per.setId(rs.getInt("id"));
                 per.setNombre(rs.getString("nombre"));
                per.setApellido(rs.getString("apellido"));
                per.setSexo(rs.getString("sexo"));
                per.setCedula(rs.getInt("cedula"));
                per.setCodigo(rs.getLong("codigo"));
             }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
return per;
    }
    
    
}
