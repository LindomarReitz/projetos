package com.estudos.jooq.main;

import static test.generated.public_.tables.Estado.ESTADO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.Factory;

public class Main {
	public static void main(String[] args) {
        Connection conn = null;

        String userName = "postgres";
        String password = "teste";
        String url = "jdbc:postgresql://localhost:5432/exemplojpa";
        
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);

            Factory create = new Factory(conn, SQLDialect.POSTGRES);
            
            Result<Record> result = create.select().from(ESTADO).orderBy(ESTADO.NOME.asc()).fetch();
            
            for (Record r : result) {
            	Long id = r.getValue(ESTADO.ID);
            	String nome = r.getValue(ESTADO.NOME);
            	
            	System.out.println("id: " + id + "\nNome: " + nome);
            	System.out.println("--------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }
        }
	}
}