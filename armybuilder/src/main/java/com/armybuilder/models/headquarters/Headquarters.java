package com.armybuilder.models.headquarters;

/**
* Headquarters consists of 3-5 high ranking marines. The rank requirement is dependant on what type of group the headquarters is added to.
* A headquarters cannot exist without the group that it is added to. A platoon HQ consists of a Platoon Commander, a Platoon Sergeant, and a 
* Platoon Guide
*/
public class Headquarters {
    //private Marine platoonCommander;
    //private Marine platoonSergeant;
    //private Marine platoonGuide;
    //
    //public Headquarters(String name, Marine platoonCommander, Marine platoonSergeant, Marine platoonGuide) {
    //    if (platoonCommander.getRank().ordinal() <= 2) {
    //        throw new IllegalArgumentException("A Platoon Commander must be at least ranked Lieutenant or above.");
    //    } else if (platoonSergeant.getRank().ordinal() <= 1) {
    //        throw new IllegalArgumentException("A Platoon Sergeant must be at least ranked Sergeant or above.");
    //    } else if (platoonGuide.getRank().ordinal() <= 1) {
    //        throw new IllegalArgumentException("A Platoon Guide must be at least ranked Sergeant or above.");
    //    } else {
    //        this.platoonCommander = platoonCommander;
    //        this.platoonSergeant = platoonSergeant;
    //        this.platoonGuide = platoonGuide;
    //    }
    //}
    //
    //public Marine getPlatoonCommander() {
    //    return platoonCommander;
    //}
    //
    //public Marine getPlatoonSergeant() {
    //    return platoonSergeant;
    //}
    //
    //public Marine getPlatoonGuide() {
    //    return platoonGuide;
    //}
    //
    //public void setPlatoonCommander(Marine platoonCommander) {
    //    this.platoonCommander = platoonCommander;
    //}
    //
    //public void setPlatoonSergeant(Marine platoonSergeant) {
    //    this.platoonSergeant = platoonSergeant;
    //}
    //
    //public void setPlatoonGuide(Marine platoonGuide) {
    //    this.platoonGuide = platoonGuide;
    //}
    //
    //@Override
    //public String toString() {
    //    return "Headquarters \n[platoonCommander=" + platoonCommander + ", platoonSergeant=" + platoonSergeant
    //            + ", platoonGuide=" + platoonGuide + "]";
    //}
}
