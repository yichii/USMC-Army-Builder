package com.armybuilder.models;

import java.util.List;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Squad {
    private List<FireTeam> fireTeams;
    private Marine squadLeader;
}
