/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sos.dal;

import java.sql.*;

/**
 *
 * @author Tiago
 */
public class ModuloConexao {
    //metodo responsavel em estabecer conexao com o banco.
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chamar"  o driver.
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando informacoes referente ao banco.
        String url = "jdbc:mysql://localhost:3306/dbservicos";
        String user = "root";
        String password = "1234";
        // Estabelecendo conexao com o banco.
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
