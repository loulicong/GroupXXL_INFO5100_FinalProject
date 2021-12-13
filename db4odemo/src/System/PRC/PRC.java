/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PRC;

import System.PRC_GO.PRC_GO;
import System.PRC_PED.PRC_PED;
import System.BabyNurse.BabyNurse;
import System.Community.Community;
import System.GODNurse.GODNurse;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class PRC {
    private String name;
    private Community community;
    int id;
    private static int count = 1;
    ArrayList<PRC_GO> PRC_GO;
    ArrayList<PRC_PED> PRC_PED;
    
    
    public PRC() {
        id = count;
        PRC_GO=new ArrayList<>();
        PRC_PED=new ArrayList<>();
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<PRC_GO> getPRC_GO() {
        return PRC_GO;
    }

    public void setPRC_GO(ArrayList<PRC_GO> PRC_GO) {
        this.PRC_GO = PRC_GO;
    }

    public ArrayList<PRC_PED> getPRC_PED() {
        return PRC_PED;
    }

    public void setPRC_PED(ArrayList<PRC_PED> PRC_PED) {
        this.PRC_PED = PRC_PED;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    
    
    
}
