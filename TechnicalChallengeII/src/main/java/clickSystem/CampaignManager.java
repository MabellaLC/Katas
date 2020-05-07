package clickSystem;

import clickSystem.Domain.Campaign;
import clickSystem.Domain.Click;
import clickSystem.insfraestructure.ClicksRepository;

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
        /*for ( Click clickActual : clicksInMemory.getList() ){
            campaign.chargeForClick(clickActual);
        }*/
        //clicksInMemory.compareClicks(campaign.chargeForClick(click));
       // campaign.chargeForClick(clicksInMemory.compareClicks());

    }

    public void chargeClicks(Campaign campaign) {

        clicksInMemory.chargeClicks(campaign);
    }
}
