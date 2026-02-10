public class Cupcake extends Bakery{
    private int piece;

    public Cupcake(int piece,String flavor ,double untiPrice){
        super(flavor,untiPrice);
        this.piece=piece;
    }
    public boolean isPackingBox(){
        return this.piece >=6;

       // if (piece >= 6) return true;
       // return false;
    }
    public int getNumber(){
        if(isPackingBox()){
            return this.piece / 6;
        }
        return 0;
    }
    public int getBagNumber(){
        return this.piece%6;
    }
    @Override
    public int getPackingCost(){
        if(isPackingBox())
            return getNumber()*super.getPackingCost();
        return 0;
    }
    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice()*this.piece)+getPackingCost() + (getBagNumber()*0.5);
    }
    public String toString() {
        return super.toString() +
                "\nCupcake (" + getFlavor() + ")with" +
                (isPackingBox() ? getNumber() + "Box " : " ") + getBagNumber() + "Bag" +
         "\n =Total price of Cup Cake = "+ calculateTotalPrice();
    }
}
