package CatalogOfAdds.Domain.Exceptions;

public class AdvertisementFormat extends RuntimeException {
    public AdvertisementFormat (String message){
        super(message);
    }
}
