/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import Hospital_GO.Hospital_GO;
import Hospital_PED.Hospital_PED;
import System.Community.Community;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import System.Pregnant.Pregnant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList = new ArrayList<>();
    }
    public Hospital createHospitalt(String name,Community community,ArrayList<Hospital_GO> Hospital_GO,ArrayList<Hospital_PED> Hospital_PED){
        Hospital hospital = new Hospital();
        hospital.setName(name);
        hospital.setHospital_GO(Hospital_GO);
        hospital.setHospital_PED(Hospital_PED);
        hospital.setCommunity(community);
        
        hospitalList.add(hospital);
        return hospital;
    }

    public ArrayList<Hospital> getHospitalArrayList() {
        return hospitalList;
    }
    
    public Hospital searchHospital(String name){
        for(Hospital h:hospitalList){
            if(h.getName().equals(name)){
                return h;
            }
        }
        return null;
        
    }
}
