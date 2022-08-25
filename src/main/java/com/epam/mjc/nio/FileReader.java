package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String name = "";
        int age = 0;
        String email = "";
        long phone = 0L;
        try(java.io.FileReader fl = new java.io.FileReader(file)) {
            BufferedReader reader = new BufferedReader(fl);
            name = reader.readLine().split(":")[1].trim();
            age = Integer.parseInt(reader.readLine().split(":")[1].trim());
            email = reader.readLine().split(":")[1].trim();
            phone = Long.parseLong(reader.readLine().split(":")[1].trim());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Profile(name, age, email, phone);
    }
}
