/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.Organization;
import System.UserAccount.UserAccount;
import userinterface.PregnantRole.CustomerAreaJPanel_;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class PregnantRole extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new CustomerAreaJPanel_(userProcessContainer,account,business);
    }
    
    
}
