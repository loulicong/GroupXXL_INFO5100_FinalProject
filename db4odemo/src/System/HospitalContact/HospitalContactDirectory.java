/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.HospitalContact;

import System.PRC.*;
import System.BabyNurse.BabyNurse;
import System.GODNurse.GODNurse;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HospitalContactDirectory {
    ArrayList<HospitalContact> hospitalList;

    public HospitalContactDirectory() {
        hospitalList = new ArrayList<>();
    }
    public HospitalContact createPRC(String name){
        HospitalContact hospitalcontact = new HospitalContact();
        hospitalcontact.setName(name);
        hospitalList.add(hospitalcontact);
        return hospitalcontact;
    }

    public ArrayList<HospitalContact> getPRCtArrayList() {
        return hospitalList;
    }
}
