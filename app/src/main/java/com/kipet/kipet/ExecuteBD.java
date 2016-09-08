package com.kipet.kipet;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Created by Bruno on 07/09/2016.
 */
public class ExecuteBD extends AsyncTask<String,Void,ResultSet> {

    private Connection connection;
    private String query;

    public ExecuteBD(Connection connection, String query) {
        this.connection = connection;
        this.query = query;
    }

    @Override
    protected ResultSet doInBackground(String... params) {
        ResultSet resultSet = null;

        try{
            resultSet = connection.prepareStatement(query).executeQuery();

        }catch (Exception e){

        }finally {
            try {
                connection.close();
            }catch (Exception e){

            }
        }
        return resultSet;
    }
}
