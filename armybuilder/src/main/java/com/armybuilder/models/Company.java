package com.armybuilder.models;

import java.util.*;
/**
 * A company consists of three rifle platoons plus a weapons platoon. It also consists of a headquarters with 8-10 high ranking marines. 
 */
public class Company extends Unit{
    private CompanyHeadquarters companyHQ;
    private List<RiflePlatoon> riflePlatoons;
    private WeaponPlatoon weaponPlatoon;

    Company(String name, CompanyHeadquarters companyHQ, List<RiflePlatoon> riflePlatoons, WeaponPlatoon weaponPlatoon) {
        super(name);
        this.companyHQ = companyHQ;
        this.riflePlatoons = new ArrayList<RiflePlatoon>();
        this.weaponPlatoon = weaponPlatoon;
    }
}
