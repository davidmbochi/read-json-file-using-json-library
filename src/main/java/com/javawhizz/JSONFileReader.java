package com.javawhizz;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JSONFileReader {
    public List<Student> readStudentsFromJSONFile(){
        JSONArray jsonArray = null;

        try (FileReader fileReader = new FileReader("student.json");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            StringBuilder stringBuilder = new StringBuilder();

            String jsonString;

            while ((jsonString = bufferedReader.readLine()) != null){
                stringBuilder.append(jsonString);
            }

            String jsonStringContent = stringBuilder.toString();

            jsonArray = new JSONArray(jsonStringContent);

        }catch (Exception e){
            e.printStackTrace();
        }

        List<Student> students = new ArrayList<>();

        JSONArray array = Objects.requireNonNull(jsonArray);

        for (int i = 0; i < array.length(); i++) {
            JSONObject student = jsonArray.getJSONObject(i);
            long studentId = student.getLong("studentId");
            String firstName = student.getString("firstName");
            String lastName = student.getString("lastName");
            String email = student.getString("email");

            Student theStudent = new Student(
                    studentId,
                    firstName,
                    lastName,
                    email);

            students.add(theStudent);
        }

        return students;
    }
}
