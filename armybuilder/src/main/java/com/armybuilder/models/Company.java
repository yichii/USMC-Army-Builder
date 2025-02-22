package com.armybuilder.models;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.armybuilder.models.headquarters.CompanyHeadquarters;
import com.armybuilder.models.platoon.RiflePlatoon;
import com.armybuilder.models.platoon.WeaponPlatoon;
/**
 * A company consists of three rifle platoons plus a weapons platoon. It also consists of a headquarters with 8-10 high ranking marines. 
 */
@ToString
public class Company extends Unit{
    private @Getter @Setter CompanyHeadquarters companyHQ;
    private @Getter @Setter List<RiflePlatoon> riflePlatoons;
    private @Getter @Setter WeaponPlatoon weaponPlatoon;

    Company(String name, CompanyHeadquarters companyHQ, List<RiflePlatoon> riflePlatoons, WeaponPlatoon weaponPlatoon) {
        super(name);
        this.companyHQ = companyHQ;
        this.riflePlatoons = new ArrayList<RiflePlatoon>();
        this.weaponPlatoon = weaponPlatoon;
    }
}
