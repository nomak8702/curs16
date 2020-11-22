package ro.fasttrackit.homework.curs16;

import java.util.List;
import java.util.Objects;

public class Electronics<T, I, C> implements ShopItem<T, I, C> {
    private T name;
    private I price;
    private C category;

    public Electronics(T name, I price, C category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public <E> Electronics(List<E> es) {

    }

    @Override
    public T name() {
        return name;
    }

    @Override
    public I price() {
        return price;
    }

    @Override
    public C category() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics<?, ?, ?> that = (Electronics<?, ?, ?>) o;
        return name.equals(that.name) &&
                price.equals(that.price) &&
                category.equals(that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name=" + name +
                ", price=" + price +
                ", category=" + category +
                '}' + '\n';
    }
}
