package com.armybuilder.factories;

import com.armybuilder.models.headquarters.Headquarters;

public class PlatoonFactory {
    SquadFactory squadFactory = new SquadFactory();
    Headquarters headquarters = new Headquarters(null, null, null, null);
}
