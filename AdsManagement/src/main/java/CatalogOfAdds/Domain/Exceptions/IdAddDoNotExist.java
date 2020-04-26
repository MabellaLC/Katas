package CatalogOfAdds.Domain.Exceptions;

public class IdAddDoNotExist extends RuntimeException {
    public IdAddDoNotExist (String message){
        super(message);
    }
}
