package com.es.jdbc.service;

public class DataTransferService {

    public static void main(String[] args) {
        // MysqlDataTransferEexcutor exeEexcutor = new MysqlDataTransferEexcutor();
        // exeEexcutor.start();

        RedshiftDataTransferEexcutor exeEexcutor = new RedshiftDataTransferEexcutor();
        exeEexcutor.start();
    }
}
