package clickSystem.Domain;

import clickSystem.Domain.valueObjects.IDClick;
import clickSystem.Domain.valueObjects.IDUser;
import clickSystem.Domain.valueObjects.StateClick;

import java.util.Date;
import java.util.Objects;

public class Click {

    private IDClick iDClick;
    private IDUser iDUser;
    private Date instantClick;
    private StateClick stateClick;

    public Click(int iDClick, int iDUser, Date instantClick, String stateClick) {
        this.iDClick = new IDClick(iDClick);
        this.iDUser = new IDUser(iDUser);
        this.instantClick = instantClick;
        this.stateClick = StateClick.CheckStateClick(stateClick);
    }

    public double chargeForClick() {
        if ( stateClick.equals(StateClick.PREMIUM) ) {
            return Double.parseDouble(String.format("%.2f", 0.05));
        }
        return Double.parseDouble(String.format("%.2f", 0.01));
    }

    public boolean differenceBiggerThanFifteenSeconds(Click click) {
        long secondsOfDiference = 0;
        long difference = instantClick.getTime() - click.instantClick.getTime();
        if ( difference != 0 ){
            secondsOfDiference = difference / 1000;
        }
        return Math.abs(secondsOfDiference) > 15;
    }

    @Override
    public String toString() {
        return "Click{" +
                "iDClick=" + iDClick +
                ", iDUser=" + iDUser +
                ", instantClick=" + instantClick +
                ", stateClick=" + stateClick +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Click click = (Click) o;
        return Objects.equals(iDClick, click.iDClick) &&
                Objects.equals(iDUser, click.iDUser) &&
                Objects.equals(instantClick, click.instantClick) &&
                stateClick == click.stateClick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iDClick, iDUser, instantClick, stateClick);
    }
}
