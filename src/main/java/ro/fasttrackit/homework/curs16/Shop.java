package ro.fasttrackit.homework.curs16;

import java.util.*;

public class Shop<T extends ShopItem> {

    List<ShopItem> shopItme = new ArrayList<ShopItem>();

    public void addItem(T item) {
        shopItme.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<ShopItem> result = new ArrayList<>();

        for (ShopItem n : shopItme) {
            if (n.category().equals(cat)) {
                result.add(n);
            }
        }
        return (List<T>) result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<ShopItem> result = new ArrayList<>();
        for (ShopItem n : shopItme) {
            if ((Integer) n.price() < maxPrice) {
                result.add(n);
            }
        }
        return (List<T>) result;
    }

    public Optional<T> findByName(String name) {

        for (ShopItem n : shopItme) {
            if (n.name().equals(name)) {
                return (Optional<T>) Optional.of(n);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
       List<ShopItem> toRemove=new ArrayList<>();
       for(ShopItem n:shopItme){
           if(n.name().equals(name)){
               toRemove.add(n);
               shopItme.removeAll(toRemove);
               return (Optional<T>) Optional.of(n);
           }
       }


       return Optional.empty();
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shopItme=" + shopItme +
                '}' + '\n';
    }
}
