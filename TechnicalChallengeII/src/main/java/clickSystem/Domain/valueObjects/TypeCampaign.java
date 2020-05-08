package clickSystem.Domain.valueObjects;

import clickSystem.controller.Commands;
import clickSystem.controller.DemoPrizeCampaign;
import clickSystem.controller.FriendlyPrizeCampaign;
import clickSystem.controller.StandardPrizeCampaign;

public enum TypeCampaign {
    DEMO,
    STANDARD,
    FRIENDLY;

    public static TypeCampaign isType(String typeOf) {
        if ( typeOf == "friendly" )
            return FRIENDLY;
        if ( typeOf == "demo" )
            return DEMO;
        return STANDARD;
    }

    public Commands returnCommands(TypeCampaign type) {
        if (type.equals(FRIENDLY)) {
            return new FriendlyPrizeCampaign();
        } else if (type.equals(STANDARD)) {
            return new StandardPrizeCampaign();
        } else if (type.equals(TypeCampaign.DEMO)) {
            return new DemoPrizeCampaign();
        }
        throw new UnknownError("error message");
    }
}
