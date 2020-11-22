package ro.fasttrackit.homework.curs16;

public interface ShopItem<T,I,C> {

    T name();

    I price();

    C category();

}
