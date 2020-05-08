package clickSystem.controller;

import clickSystem.Domain.Click;

public class UnknownCampaign extends RuntimeException {
    public UnknownCampaign(String message){
        super(message);
    }
}
