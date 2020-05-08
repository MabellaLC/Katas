package helpers;

import clickSystem.Domain.Click;
import clickSystem.Domain.valueObjects.IDClick;
import clickSystem.Domain.valueObjects.IDUser;
import clickSystem.Domain.valueObjects.StateClick;
import clickSystem.controller.Commands;
import clickSystem.controller.PremiumCampaign;
import clickSystem.controller.StandardCampaign;

import java.util.Date;

public class ClickBuilder {
    private IDClick iD;
    private IDUser iDUser;
    private Date instantDate;
    private StateClick typeOfClick;
    private Commands interpreter;

    public static ClickBuilder aClick(){
        return new ClickBuilder();
    }

    public ClickBuilder withID(IDClick iD){
        this.iD = iD;
        return this;
    }

    public ClickBuilder withIDUser(IDUser iDUser){
        this.iDUser = iDUser;
        return this;
    }

    public ClickBuilder at(Date instantDate){
        this.instantDate = instantDate;
        return this;
    }

    public ClickBuilder isType(StateClick typeOfClick){
        this.typeOfClick = typeOfClick;
        return this;
    }

    public ClickBuilder prizeFriendly(){
        this.interpreter = new PremiumCampaign();
        return this;
    }
    public ClickBuilder prizeStandard(){
        this.interpreter = new StandardCampaign();
        return this;
    }

    public Click build(){
        return new Click(iD, iDUser, instantDate, typeOfClick);
    }

    /*public ClickNew builder(){
        return new ClickNew(new Click(iD, iDUser, instantDate, typeOfClick), interpreter);
    }*/
}
