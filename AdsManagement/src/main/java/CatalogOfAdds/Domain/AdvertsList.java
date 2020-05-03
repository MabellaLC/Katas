package CatalogOfAdds.Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Creo aquesta classe per a que quan faig els tests de Catalog Repository a partir de la interface catalog
//Vull comprovar que la llista que jo creo al test sigui la mateixa que la del programa(per aixo faig add al test)
//Podria fer un get de la list de Catalog Repository fent public l'atribut (LLEIG)
//Prodria fer un get amagat de la llista amb una funcio(LLEIG)
// ->  public List<Advertisement> getAddList() {return new ArrayList<>(advertisementList);} immutabilitat al fer new no poden modificar la llista real
//pro llavors a la interface tindria una FirstCC (LLEIG)

public class AdvertsList {
    List<Advertisement> advertisementList;
    public AdvertsList (List<Advertisement> advertsLists){
        this.advertisementList = advertsLists;
    }

    /*public List<Advertisement> lines(){
        return new ArrayList<>(advertisementList);
    }*/

    @Override
    public String toString() {
        return  "" + advertisementList;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        AdvertsList that = (AdvertsList) o;
        return Objects.equals(advertisementList, that.advertisementList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advertisementList);
    }
}
