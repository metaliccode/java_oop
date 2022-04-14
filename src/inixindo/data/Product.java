package inixindo.data;

// package inixindo.data;
// penggunaaan public, private, dan protected, no modifier
public class Product {
    // private String name;
    // private hanya boleh di akses di class yang sama
    // protected String name;
    // protected int Price;
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // overriding to string methode
    public String toString() {
        return "Product Name: " + name + " Price: " + price;
    }

    // pengecekan dengan equals
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        if (price != product.price)
            return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
