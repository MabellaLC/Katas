package clickSystem.insfraestructure;

import clickSystem.Domain.Campaign;
import clickSystem.Domain.Click;

public interface ClicksRepository {
    void addClicks(Click click, Campaign campaign);
    void chargeClicks(Campaign campaign);
}
