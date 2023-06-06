/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.service;

import edu.neu.csye6200.model.ClassroomClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class classroomFactory {

    // Creating Static Map
    private static Map<Integer, ClassroomClass> map;

    // Instantiating the static map
    static {
        map = new HashMap<>();
        map.put(1, new ClassroomClass(1, 6, 12, 4, 3));
        map.put(2, new ClassroomClass(2, 13, 24, 5, 3));
        map.put(3, new ClassroomClass(3, 25, 35, 6, 3));
        map.put(4, new ClassroomClass(4, 36, 47, 8, 3));
        map.put(5, new ClassroomClass(5, 48, 59, 12, 2));
        map.put(6, new ClassroomClass(6, 60, 200, 15, 2));
    }

    // Factory
    public static ClassroomClass readClassRoom(int age) {
        
        return map.get(readStudentClass(age));
       
    }
    
    private static int readStudentClass(int age) {
        if (age >= 6 && age <= 12) {
            return 1;
        } else if (age >= 13 && age <= 24) {
            return 2;
        } else if (age >= 25 && age <= 35) {
            return 3;
        } else if (age >= 36 && age <= 47) {
            return 4;
        } else if (age >= 48 && age <= 59) {
            return 5;
        }
        
        return 6;
    }
    
    public static List<ClassroomClass> readAllClassRooms() {
        return new ArrayList<ClassroomClass>(map.values());
    }
    
    public static void diplayAllClassrooms() {
        
        readAllClassRooms().forEach(System.out::println);
        
    }
    
}
