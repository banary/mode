package com.circle.base.avro;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class AvroMain {

    public static void main(String[] args) throws Exception{
        // Leave favorite color null
        User user1 = new User();
        user1.setName("Alyssa");
        user1.setFavoriteNumber(256);

        // Alternate constructor
        User user2 = new User("Ben", 7, "red");

        // Construct via builder
        User user3 = User.newBuilder()
                .setName("Charlie")
                .setFavoriteColor("blue")
                .setFavoriteNumber(null)
                .build();
        serialize(Arrays.asList(user1, user2, user3));


        deserialize("users.avro");
    }

    public static void serialize(List<User> userList) throws Exception{
        DatumWriter<User> dataWriter = new SpecificDatumWriter<>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<>(dataWriter);
        dataFileWriter.create(userList.get(0).getSchema(), new File("users.avro"));
        for(User user : userList){
            dataFileWriter.append(user);
        }
        dataFileWriter.close();
    }

    public static void deserialize(String fileUrl) throws Exception{
        DatumReader<User> dataReader = new SpecificDatumReader<>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(new File(fileUrl), dataReader);
        User user = null;
        while(dataFileReader.hasNext()){
            user = dataFileReader.next(user);
            System.out.println(user);
        }
    }
}
