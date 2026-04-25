package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double ticket() {
        return (gender == 'F') ? 8.0 : 10.0;
    }

    public double feeding() {
        return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
    }

    public double cover() {
        return (feeding() <= 30.0) ? 4.0 : 0.0;
    }

    public double total() {
        return ticket() + feeding() + cover();
    }

    public String toStringWithCover() {
       return "\nRELATÓRIO:" + "\nConsumo = R$ " + String.format("%.2f", feeding()) + "\nCouvert = R$ " + String.format("%.2f", cover()) + "\nIngresso = R$ " + String.format("%.2f\n", ticket()) + "\nValor a pagar = R$ " + String.format("%.2f", total());
    }

    public String toStringNoCover() {
        return "\nRELATÓRIO:" + "\nConsumo = R$ " + String.format("%.2f", feeding()) + "\nIsento de Couvert" + "\nIngresso = R$ " + String.format("%.2f\n", ticket()) + "\nValor a pagar = R$ " + String.format("%.2f", total());
    }
}

