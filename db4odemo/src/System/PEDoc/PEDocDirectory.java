/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.PEDoc;

import System.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PEDocDirectory {
    
    private ArrayList<PEDoc> PEDocList;

    public PEDocDirectory() {
        PEDocList = new ArrayList();
    }

    public ArrayList<PEDoc> getEmployeeList() {
        return PEDocList;
    }
    
    public PEDoc createEmployee(String name,Hospital hospital){
        PEDoc PEDoc = new PEDoc();
        PEDoc.setName(name);
        PEDoc.setHospital(hospital);
        PEDocList.add(PEDoc);
        return PEDoc;
    }
}