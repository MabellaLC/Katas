package clickSystem.controller;

import clickSystem.Domain.Click;
import clickSystem.Domain.valueObjects.StateClick;

public class FriendlyPrizeCampaign implements Commands {

    @Override
    public double chargeForClick(Click click) {
       if ( click.stateClick().equals(StateClick.PREMIUM) ) {
            return Double.parseDouble(String.format("%.2f", 0.02));
        }
        return Double.parseDouble(String.format("%.2f", 0.01));
    }

}

