package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        System.out.println(Divide(2,1));
//        System.out.println(Divide(5,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.txt");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()){
            System.out.println(student + " " + CheckFileExtension(studentFiles.get(student)));
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by 0");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x / y;

    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int points = 0;
        try {
            if (fileName.contains(".java")) {
                points = 1;
            } else if (fileName.equals("")) {
                points = -1;
                throw new NullPointerException("File name is empty");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return points;
    }

}
