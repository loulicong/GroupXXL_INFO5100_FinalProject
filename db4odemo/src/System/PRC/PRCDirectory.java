/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC;

import PRC_GO.PRC_GO;
import PRC_PED.PRC_PED;
import System.BabyNurse.BabyNurse;
import System.Community.Community;
import System.GODNurse.GODNurse;
import System.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRCDirectory {
    ArrayList<PRC> PRCList;
    ArrayList<PRC_GO> PRC_GO;
    ArrayList<PRC_PED> PRC_PED;

    public PRCDirectory() {
        PRCList = new ArrayList<>();
        PRC_GO=new ArrayList();
        PRC_PED=new ArrayList();
    }
    public PRC createPRC(String name,Community community,ArrayList<GODNurse> GODNurse,
            ArrayList<PRC_GO> PRC_GO,ArrayList<PRC_PED> PRC_PED){
        PRC prc = new PRC();
        prc.setName(name);
        prc.setPRC_GO(PRC_GO);
        prc.setPRC_PED(PRC_PED);
        prc.setCommunity(community);
        PRCList.add(prc);
        return prc;
    }

    public ArrayList<PRC> getPRCtArrayList() {
        return PRCList;
    }
    
    public PRC searchPRC(String name){
        for(PRC prc:PRCList){
            if(prc.getName().equals(name)){
                return prc;
            }
        }
        return null;
        
    }
}
