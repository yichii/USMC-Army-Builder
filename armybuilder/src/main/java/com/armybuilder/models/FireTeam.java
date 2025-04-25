package com.armybuilder.models;

import java.util.*;
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class FireTeam{
    private List<Marine> marines;
    private Marine teamLeader;
}
