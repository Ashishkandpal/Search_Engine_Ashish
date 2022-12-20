package com.example.search_engine_ashish;

import java.sql.Timestamp;

public class HistoryResult {
    private String keyword;
    private Timestamp timestamp;

    //we have to make getter and setter for these variables

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp time) {
        this.timestamp = time;
    }

    //now constructor of this class
    HistoryResult(String keyword, Timestamp time) {
        this.keyword = keyword;
        this.timestamp = time;
    }

}
