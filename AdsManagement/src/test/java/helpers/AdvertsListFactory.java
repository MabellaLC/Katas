package helpers;

import CatalogOfAdds.Domain.Advertisement;
import CatalogOfAdds.Domain.AdvertsList;

import java.util.Arrays;

public class AdvertsListFactory {
    public static AdvertsList aAdvertsListContaining(Advertisement... advertisement){
        return new AdvertsList(Arrays.asList(advertisement));
    }
}
