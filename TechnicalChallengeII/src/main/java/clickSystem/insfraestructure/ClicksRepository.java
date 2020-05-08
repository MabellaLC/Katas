package clickSystem.insfraestructure;

import clickSystem.Domain.Campaign;
import clickSystem.Domain.Click;

import java.util.Date;

public interface ClicksRepository {
    void addClicks(Click click, Campaign campaign);
    void chargeClicks(Campaign campaign);
    void compareListOfClicksWithClicksByBoots(Date date, Campaign campaign);
}
