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
public class HospitalContact {
    String name;
    int id;
    private static int count = 1;
    
    
    
    public HospitalContact() {
        id = count;
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

    
    
}
