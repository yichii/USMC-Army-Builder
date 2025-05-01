package com.armybuilder.models.units;

import java.util.List;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Squad {
    private List<?> fireTeams;
    private Marine squadLeader;
}
