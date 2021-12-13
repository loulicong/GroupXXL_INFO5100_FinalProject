/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PEDoc;

import System.Hospital.Hospital;

/**
 *
 * @author raunak
 */
public class PEDoc {
    
    private String name;
    private int id;
    private Hospital hospital;
    private static int count = 1;

    public PEDoc() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
