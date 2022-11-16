package packages.coins;

public abstract class Moneda {

    public Moneda() {
    }

    public abstract int getValor();


    public String getSerie() {
        return Integer.toHexString(hashCode());
    }
}
