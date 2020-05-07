package clickSystem;

import clickSystem.Domain.Campaign;
import clickSystem.Domain.Click;

public class CampaignManager {

    public void activate(Campaign campaign) {
        campaign.activate();
    }

    public void pause(Campaign campaign) {
        campaign.pause();
    }

    public void chargeForClick(Campaign campaign, Click click) {
        campaign.chargeForClick(click);

    }
}
