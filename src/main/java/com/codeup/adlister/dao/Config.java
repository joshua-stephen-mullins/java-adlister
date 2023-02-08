package com.codeup.adlister.dao;

import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUsername() {
        return "root";
    }
    public String getPassword() {
        return "codeup";
    }
}
