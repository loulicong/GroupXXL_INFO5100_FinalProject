/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODNurse;

import System.PRC.PRC;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class GODNurseDirectory {
    ArrayList<GODNurse> GODNurseArrayList;

    public GODNurseDirectory() {
        GODNurseArrayList =new ArrayList<>();
    }
    public ArrayList<GODNurse> getDeliveryManArrayList() {
        return GODNurseArrayList;
    }
    public GODNurse createDeliverMan(String name,String usrname,String number,PRC prc){
        GODNurse GODNurse =new GODNurse();
        GODNurse.setName(name);
        GODNurse.setNumber(number);
        GODNurse.setPRC(prc);
        GODNurse.setUsrname(usrname);
        GODNurseArrayList.add(GODNurse);
        return GODNurse;
    }
}
