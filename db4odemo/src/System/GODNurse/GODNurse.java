/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.GODNurse;

import System.PRC.PRC;

/**
 *
 * @author harold
 */
public class GODNurse {
    private String name;
    private String usrname;
    private String Number;
    private int id;
    private static int count = 1;
    private PRC PRC;

    public GODNurse() {
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

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public PRC getPRC() {
        return PRC;
    }

    public void setPRC(PRC PRC) {
        this.PRC = PRC;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
}
