/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import System.Baby.BabyDirectory;
import System.BabyNurse.BabyNurseDirectory;
import System.City.CityList;
import System.Community.CommunityList;
import System.GODNurse.GODNurseDirectory;
import System.Pregnant.PregnantDirectory;
import System.GODoc.GODocDirectory;
import System.Hospital.HospitalDirectory;
import System.HospitalContact.HospitalContactDirectory;
import System.Role.Role;
import System.Role.SystemAdminRole;
import System.UserAccount.UserAccountDirectory;
import System.InRequest.InRequestList;
import System.PEDoc.PEDocDirectory;
import System.PRC.PRCDirectory;
import System.PRCContact.PRCContactDirectory;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class CareCenterSystem extends Organization{
    
    private static CareCenterSystem system;
    private HospitalDirectory hospitalDirectory;
    private PregnantDirectory pregnantDirectory;
    private BabyDirectory babyDirectory;
    private BabyNurseDirectory babynurseDirectory;
    private CityList cityList;
    private CommunityList communityList;
    private GODNurseDirectory GODnurseDirectory;
    private HospitalContactDirectory hospitalcontactDirectory;
    private PEDocDirectory PEdocDirectory;
    private PRCDirectory PRCDirectory;
    private PRCContactDirectory PRCcontactDirectory;
    private GODocDirectory GODocDirectory;
    private InRequestList inRequestList;
    private UserAccountDirectory userAccountDirectory;

    public CareCenterSystem(HospitalDirectory hospitalDirectory, PregnantDirectory userDirectory, 
            BabyDirectory babyDirectory, BabyNurseDirectory babynurseDirectory, CityList cityList, 
            CommunityList communityList, GODNurseDirectory GODnurseDirectory, HospitalContactDirectory hospitalcontactDirectory, 
            PEDocDirectory PEdocDirectory, PRCDirectory PRCDirectory, PRCContactDirectory PRCcontactDirectory, 
            GODocDirectory GODocDirectory, InRequestList inRequestList, UserAccountDirectory userAccountDirectory) {
        this.hospitalDirectory = hospitalDirectory;
        this.pregnantDirectory = userDirectory;
        this.babyDirectory = babyDirectory;
        this.babynurseDirectory = babynurseDirectory;
        this.cityList = cityList;
        this.communityList = communityList;
        this.GODnurseDirectory = GODnurseDirectory;
        this.hospitalcontactDirectory = hospitalcontactDirectory;
        this.PEdocDirectory = PEdocDirectory;
        this.PRCDirectory = PRCDirectory;
        this.PRCcontactDirectory = PRCcontactDirectory;
        this.GODocDirectory = GODocDirectory;
        this.inRequestList = inRequestList;
        this.userAccountDirectory = userAccountDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PregnantDirectory getPregnantDirectory() {
        return pregnantDirectory;
    }

    public void setPregnantDirectory(PregnantDirectory pregnantDirectory) {
        this.pregnantDirectory = pregnantDirectory;
    }

    public BabyDirectory getBabyDirectory() {
        return babyDirectory;
    }

    public void setBabyDirectory(BabyDirectory babyDirectory) {
        this.babyDirectory = babyDirectory;
    }

    public BabyNurseDirectory getBabynurseDirectory() {
        return babynurseDirectory;
    }

    public void setBabynurseDirectory(BabyNurseDirectory babynurseDirectory) {
        this.babynurseDirectory = babynurseDirectory;
    }

    public CityList getCityList() {
        return cityList;
    }

    public void setCityList(CityList cityList) {
        this.cityList = cityList;
    }

    public CommunityList getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityList communityList) {
        this.communityList = communityList;
    }

    public GODNurseDirectory getGODnurseDirectory() {
        return GODnurseDirectory;
    }

    public void setGODnurseDirectory(GODNurseDirectory GODnurseDirectory) {
        this.GODnurseDirectory = GODnurseDirectory;
    }

    public HospitalContactDirectory getHospitalcontactDirectory() {
        return hospitalcontactDirectory;
    }

    public void setHospitalcontactDirectory(HospitalContactDirectory hospitalcontactDirectory) {
        this.hospitalcontactDirectory = hospitalcontactDirectory;
    }

    public PEDocDirectory getPEdocDirectory() {
        return PEdocDirectory;
    }

    public void setPEdocDirectory(PEDocDirectory PEdocDirectory) {
        this.PEdocDirectory = PEdocDirectory;
    }

    public PRCDirectory getPRCDirectory() {
        return PRCDirectory;
    }

    public void setPRCDirectory(PRCDirectory PRCDirectory) {
        this.PRCDirectory = PRCDirectory;
    }

    public PRCContactDirectory getPRCcontactDirectory() {
        return PRCcontactDirectory;
    }

    public void setPRCcontactDirectory(PRCContactDirectory PRCcontactDirectory) {
        this.PRCcontactDirectory = PRCcontactDirectory;
    }

    public GODocDirectory getGODocDirectory() {
        return GODocDirectory;
    }

    public void setGODocDirectory(GODocDirectory GODocDirectory) {
        this.GODocDirectory = GODocDirectory;
    }
    
    

    @Override
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public static CareCenterSystem getSystem() {
        return system;
    }

    public static void setSyetem(CareCenterSystem system) {
        CareCenterSystem.system = system;
    }

    public HospitalDirectory getRestaurantDirectory() {
        return hospitalDirectory;
    }

    public void setRestaurantDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PregnantDirectory getCustomerDirectory() {
        return pregnantDirectory;
    }

    public void setCustomerDirectory(PregnantDirectory userDirectory) {
        this.pregnantDirectory = userDirectory;
    }

    public GODocDirectory getDeliveryManDirectory() {
        return GODocDirectory;
    }

    public void setDeliveryManDirectory(GODocDirectory GODocDirectory) {
        this.GODocDirectory = GODocDirectory;
    }

//    public CareCenterSystem(HospitalDirectory hospitalDirectory, PregnantDirectory pregnantDirectory, GODocDirectory GODocDirectory) {
//
//        this.hospitalDirectory = hospitalDirectory;
//        this.pregnantDirectory = pregnantDirectory;
//        this.GODocDirectory = GODocDirectory;
//    }
    

    //@Override
    public InRequestList getInRequestList() {
        return inRequestList;
    }

    //@Override
    public void setInRequestListe(InRequestList inRequestList) {
        this.inRequestList = inRequestList;
    }

    public static CareCenterSystem getInstance(){
        if(system==null){
            system=new CareCenterSystem();
        }
        return system;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private CareCenterSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
