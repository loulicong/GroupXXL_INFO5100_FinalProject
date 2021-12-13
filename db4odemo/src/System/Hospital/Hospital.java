/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import System.Hospital_GO.Hospital_GO;
import System.Hospital_PED.Hospital_PED;
import System.Community.Community;
import System.GODoc.GODoc;
import System.PEDoc.PEDoc;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Hospital {
    private String name;
    private int id;
    private static int count = 1;
    private Community community;
    ArrayList<Hospital_GO> Hospital_GO;
    ArrayList<Hospital_PED> Hospital_PED;
    

    public Hospital() {
        id = count;
        Hospital_GO=new ArrayList<>();
        Hospital_PED=new ArrayList<>();
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

    public ArrayList<Hospital_GO> getHospital_GO() {
        return Hospital_GO;
    }

    public void setHospital_GO(ArrayList<Hospital_GO> Hospital_GO) {
        this.Hospital_GO = Hospital_GO;
    }

    public ArrayList<Hospital_PED> getHospital_PED() {
        return Hospital_PED;
    }

    public void setHospital_PED(ArrayList<Hospital_PED> Hospital_PED) {
        this.Hospital_PED = Hospital_PED;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    
    
    
    @Override
    public String toString() {
        return name;
    }
}
