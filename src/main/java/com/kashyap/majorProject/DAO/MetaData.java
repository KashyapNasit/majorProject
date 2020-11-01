package com.kashyap.majorProject.DAO;

import java.util.HashMap;

public class MetaData {
    private DataRepository dataRepository;
    private String database;
    private String table;
    private HashMap<String , Object> primaryKeys;

    public DataRepository getDataRepository() {
        return dataRepository;
    }

    public MetaData setDataRepository(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public MetaData setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getTable() {
        return table;
    }

    public MetaData setTable(String table) {
        this.table = table;
        return this;
    }

    public HashMap<String, Object> getPrimaryKeys() {
        return primaryKeys;
    }

    public MetaData setPrimaryKeys(HashMap<String, Object> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "dataRepository=" + dataRepository +
                ", database='" + database + '\'' +
                ", table='" + table + '\'' +
                ", primaryKeys=" + primaryKeys +
                '}';
    }
}
