package clickSystem.controller;

import clickSystem.Domain.Click;

public class DemoPrizeCampaign implements Commands {
    @Override
    public double chargeForClick(Click click) {
        return 0.00;
    }
}
