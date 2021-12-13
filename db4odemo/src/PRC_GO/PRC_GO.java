/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC_GO;

import Hospital_PED.*;
import Hospital_GO.*;
import System.Baby.*;
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
public class PRC_GO {
    private ArrayList<GODNurse> GODNurseList;

    public PRC_GO() {
        //this.GODocList
    }

    public ArrayList<GODNurse> getGODNurseList() {
        return GODNurseList;
    }

    public void setGODNurseList(ArrayList<GODNurse> GODNurseList) {
        this.GODNurseList = GODNurseList;
    }
    
    
    
}
