package Parte14Streams.Dominio;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Categoria categoria;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, double price, Categoria categoria) {
        this.title = title;
        this.price = price;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
