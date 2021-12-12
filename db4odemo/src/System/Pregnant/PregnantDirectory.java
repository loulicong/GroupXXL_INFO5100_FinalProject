/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Pregnant;

import System.Baby.Baby;
import System.BabyNurse.BabyNurse;
import System.City.City;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.GODoc.GODoc;
import System.Hospital.Hospital;
import System.InRequest.InRequest;
import System.PEDoc.PEDoc;
import System.PRC.PRC;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PregnantDirectory {
    ArrayList<Pregnant> userArrayList;

    public PregnantDirectory() {
        this.userArrayList = new ArrayList<>();
    }

    public ArrayList<Pregnant> getCustomerArrayList() {
        return userArrayList;
    }

    public void setCustomerArrayList(ArrayList<Pregnant> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public Pregnant createCustomer(String name,int age,Community community,City city,String InPreDate,
            ArrayList<Baby> babyArrayList,String emergence,Hospital hospital,PRC prc,
            GODoc GODoc,PEDoc PEDoc,GODNurse GODNurse,BabyNurse BabyNurse,ArrayList<InRequest> HospitalinrequestList,
            ArrayList<InRequest> PRCinrequestList){
        Pregnant pregnant =new Pregnant();
        pregnant.setName(name);
        pregnant.setAge(age);
        pregnant.setCommunity(community);
        pregnant.setCity(city);
        pregnant.setInPreDate(InPreDate);
        pregnant.setBabyArrayList(babyArrayList);
        pregnant.setEmergence(emergence);
        pregnant.setBabyNurse(BabyNurse);
        pregnant.setGODNurse(GODNurse);
        pregnant.setGODoc(GODoc);
        pregnant.setHospital(hospital);
        pregnant.setPrc(prc);
        pregnant.setPEDoc(PEDoc);
        pregnant.setPRCinrequestList(PRCinrequestList);
        pregnant.setHospitalinrequestList(HospitalinrequestList);
        
        userArrayList.add(pregnant);
        return pregnant;
    }
    public Pregnant searchPregnant(String usrname){
        for(Pregnant p:userArrayList){
            if(p.getUsrname().equals(usrname)){
                return p;
            }
        }
        return null;
        
    }
}
