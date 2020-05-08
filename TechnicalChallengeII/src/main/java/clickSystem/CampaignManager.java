package clickSystem;

import clickSystem.Domain.Campaign;
import clickSystem.Domain.Click;
import clickSystem.insfraestructure.ClicksRepository;

import java.util.Date;

public class CampaignManager {

    private ClicksRepository clicksInMemory;

    public CampaignManager(ClicksRepository clicksInMemory) {
        this.clicksInMemory = clicksInMemory;
    }

    public void activate(Campaign campaign) {
        campaign.activate();
    }

    public void pause(Campaign campaign) {
        campaign.pause();
    }

    public void addClickToAList(Click click, Campaign campaign) {
        clicksInMemory.addClicks(click, campaign);
    }

    public void chargeClicks(Campaign campaign) {
        clicksInMemory.chargeClicks(campaign);
    }

    public void findBotsFrom(Date date, Campaign campaign) {
        clicksInMemory.compareListOfClicksWithClicksByBoots(date, campaign);
    }

}
