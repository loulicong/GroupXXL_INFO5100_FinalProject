/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC_PED;

import PRC_GO.*;
import Hospital_PED.*;
import Hospital_GO.*;
import System.Baby.*;
import System.BabyNurse.BabyNurse;
import System.GODNurse.GODNurse;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import System.Pregnant.Pregnant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harold
 */
public class PRC_PED {
    private ArrayList<BabyNurse> BabyNurseList;

    public PRC_PED() {
        //this.GODocList
    }

    public ArrayList<BabyNurse> getBabyNurseList() {
        return BabyNurseList;
    }

    public void setBabyNurseList(ArrayList<BabyNurse> BabyNurseList) {
        this.BabyNurseList = BabyNurseList;
    }
    
    
    
}
