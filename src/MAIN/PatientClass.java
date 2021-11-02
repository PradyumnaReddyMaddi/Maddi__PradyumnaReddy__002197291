/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class PatientClass extends PersonClass {
    static ArrayList<VitalSignsClass> array = new ArrayList<VitalSignsClass>();
   
    static Map<PatientClass, ArrayList<VitalSignsClass>> encounterHistory = new HashMap<PatientClass,ArrayList<VitalSignsClass>>();

    public static Map<PatientClass, ArrayList<VitalSignsClass>> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(Map<PatientClass, ArrayList<VitalSignsClass>> encounterHistory) {
        PatientClass.encounterHistory = encounterHistory;
    }
   
    
    
    
    
    public static ArrayList<VitalSignsClass> getArray() {
       
        return array;
    }


    public static void setArray(ArrayList<VitalSignsClass> array) {
        PatientClass.array = array;
    }
    
    public static void addVitalSigns(VitalSignsClass vs)
    {
        array.add(vs);
    }
    
   public static Comparator<VitalSignsClass> dateComparator = (VitalSignsClass v1, VitalSignsClass v2) -> {
       LocalDateTime date1 = v1.getEntryDateTime();
       LocalDateTime date2 = v2.getEntryDateTime();
       //descending  order
       return date2.compareTo(date1);
       
       
   
       
    };
}
