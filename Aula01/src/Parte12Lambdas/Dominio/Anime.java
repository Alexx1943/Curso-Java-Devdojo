package Parte12Lambdas.Dominio;

public class Anime {
    private String title;
    private int epsodies;

    public Anime(String title, int epsodies) {
        this.title = title;
        this.epsodies = epsodies;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + epsodies +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpsodies() {
        return epsodies;
    }
}
