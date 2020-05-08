package clickSystem.service;

import clickSystem.Domain.Click;

public class DemoCampaign implements CampaignType {
    @Override
    public double chargeForClick(Click click) {
        return 0.00;
    }
}
