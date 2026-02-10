public class Macaron extends Bakery {
    private int piece;
    private int toadd;

    public Macaron(int piece, String flavor, double untiPrice) {
        super(flavor, untiPrice);
        this.piece = piece;
    }

    public boolean isPackingBox() {
        return this.piece >= 10;

        // if (piece >= 6) return true;
        // return false;
    }

    public int getNumber() {
        if (isPackingBox()) {
            return this.piece / 10;
        }
        return 0;
    }

    public int getToadd() {
        if (piece >= 10)
            return (piece / 10) ;
        return 0 ;
    }


    @Override
    public int getPackingCost() {
        if (isPackingBox())
            return getNumber() * super.getPackingCost();
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getUnitPrice() * this.piece) + getPackingCost();
    }

    public String toString() {
        return super.toString() +
                "\nMacaron (" + getFlavor() + ") with " +
                (isPackingBox() ? getNumber() + " Box " : " ") +
                (getToadd() >= 1 ? "\n You get Free = " + getToadd() + " piece.": "")+
                "\n Total price of Macaron = " + calculateTotalPrice() + "Baht.";
    }

}
