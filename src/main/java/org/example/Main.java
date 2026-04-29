package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> liste = new LinkedList<>();
        Employee e1 = new Employee(1, "Ali", "Veli");
        Employee e2 = new Employee(2, "Hasan", "Huseyn");

        liste.add(e1);
        liste.add(e2);
        liste.add(e1);
    }
    public static List<Employee> findDuplicates(List<Employee> employes){
Set<Employee> seen=new HashSet<>();
Set<Employee> dublicate =new HashSet<>();
for(Employee employee: employes) {
    if(!seen.add(employee)) {
        dublicate.add(employee);
    }
    }
        List<Employee> dublicateList=new ArrayList<>(dublicate);
        return dublicateList;

    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> result = new HashMap<>();
        for(Employee e : list){
            if(!result.containsKey(e.getId())){
                result.put(e.getId(), e);
            }
        }
        return result;
    }
    public static List<Employee> removeDuplicates(List<Employee> list){
        Map<Employee,Integer> siyahi=new HashMap();
        for(Employee employe:list){
            siyahi.put(employe,siyahi.getOrDefault(employe,0)+1);
        }
        List<Employee> tekrarsizlar=new LinkedList<>();
        for(Employee employee:siyahi.keySet()){
            if(siyahi.get(employee)==1){
                tekrarsizlar.add(employee);
            }
        }
        return  tekrarsizlar;
    }
}