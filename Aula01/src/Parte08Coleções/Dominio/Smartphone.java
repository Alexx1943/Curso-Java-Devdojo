package Parte08Coleções.Dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }


//    It is reflexive: for any non-null reference value x, x. equals(x) should return true.
//    It is symmetric: for any non-null reference values x and y, x. equals(y) should return true if and only if y. equals(x) returns true.
//    It is transitive: for any non-null reference values x, y, and z, if x. equals(y) returns true and y. equals(z) returns true, then x. equals(z) should return true.
//    It is consistent: for any non-null reference values x and y, multiple invocations of x. equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
//    For any non-null reference value x, x. equals(null) should return false


    // Reflexivo: x.equals(x) tem que ser true para tudo  que for diferente de null.
// Simétrico: para x e y diferentes  de null, se x.equals(y) == true, logo y.equals(x) == true.
// Trasitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo,  y.equals(z) == true.
// Consistente: x.equals(x) sempre retorna true se x for diferente de null.
// Para x diferente de null,  x.equals(null) tem que retornar falso.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode().
// se y.hashCode() == x.hashCode() não necessariamente o y.equals(x) tem que ser true.
// se x.equals(y) == false, o hashCode tem que ser diferente.
// se y.hashCode() != x.hashCode(), x.equals(y) devera ser false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
