package com.kipet.kipet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by Bruno on 06/09/2016.
 */
public class DB extends _Default implements Runnable {
    private Connection conn;
    private String host = "interhome.meuipbx.com.br";
    private String db = "kipet";
    private String user = "kipet";
    private String pass = "kipet";
    private String url = "jdbc:mysql://%s/%s";

    public DB(){
        this.url = String.format(this.url,this.host,this.db);

        this.conecta();
        this.desconecta();
    }

    @Override
    public void run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(this.url,this.user,this.pass);

        }catch (Exception e){
            this._mensagem = e.getMessage();
            this._status = false;
        }
    }

    private void conecta(){
        Thread thread = new Thread(this);
        thread.start();
        try{
            thread.join();
        }catch (Exception e){
            this._mensagem = e.getMessage();
            this._status = false;
        }
    }

    private void desconecta(){
        if(this.conn!=null){
            try{
                this.conn.close();
            }catch(Exception e){
                //TODO
            }finally {
                this.conn = null;
            }
        }
    }

    public ResultSet select(String query){
        this.conecta();
        ResultSet resultSet = null;
        try {
            resultSet = new ExecuteBD(this.conn,query).execute().get();
        }catch (Exception e){
            this._status = false;
            this._mensagem = e.getMessage();
        }
        return resultSet;
    }

    public ResultSet execute(String query){
        this.conecta();
        ResultSet resultSet = null;
        try {
            resultSet = new ExecuteBD(this.conn,query).execute().get();
        }catch (Exception e){
            this._status = false;
            this._mensagem = e.getMessage();
        }
        return resultSet;
    }
}