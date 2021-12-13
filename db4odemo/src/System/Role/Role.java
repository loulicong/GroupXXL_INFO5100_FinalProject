/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.Organization;
import System.UserAccount.UserAccount;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Hospital_GO("Hospital_GO"),
        Hospital_PED("Hospital_PED"),
        PRC_GO("PRC_GO"),
        PRC_PED("PRC_PED"),
        Baby("Baby"),
        BabyNurse("BabyNurse"),
        GODNurse("GODNurse"),
        GODoc("GODoc"),
        Hospital("Hospital"),
        HospitalContact("HospitalContact"),
        PEDoc("PEDoc"),
        PRCContact("PRCContact"),
        PRC("PRC"),
        Pregnant("Pregnant"),
//        Customer("Customer"),
//        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");

        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea( JPanel userProcessContainer,
                                          UserAccount account,
                                          CareCenterSystem system);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}