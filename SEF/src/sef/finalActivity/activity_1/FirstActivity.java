package sef.finalActivity.activity_1;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FirstActivity<map, sorted_map> extends Employee {

    public static void main(String[] args) {

        Employee person1 = new Employee();
        person1.setName("Rachel");
        person1.setSalary(5000);

        Employee person2 = new Employee();
        person2.setName("Tim");
        person2.setSalary(3000);

        Employee person3 = new Employee();
        person3.setName("Chris");
        person3.setSalary(2000);

    }

//        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
//        Map<Integer, Employee> employeeMapBySalary = new TreeMap<Integer, Employee>();
//
//        HashMap<String, Integer> map = new HashMap<>();
//        ValueComparator bvc = new ValueComparator(map);
//        TreeMap<String, Integer> sorted_map = new TreeMap<>(bvc);
//
//        map.put("Rachel", 5000);
//        map.put("Tim", 3000);
//        map.put("Chris", 2000);
//
//        System.out.println("unsorted map: " + map);
//        sorted_map.putAll(map);
//        System.out.println("results: " + sorted_map);

    }
