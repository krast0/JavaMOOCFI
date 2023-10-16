
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
         int FirstAprtPrice = this.princePerSquare * this.squares;
         int SecoundAprtPrice = compared.princePerSquare * compared.squares;

         if(FirstAprtPrice > SecoundAprtPrice){
             return FirstAprtPrice - SecoundAprtPrice;
         } else if (SecoundAprtPrice > FirstAprtPrice) {
             return SecoundAprtPrice - FirstAprtPrice;
         }else{
             return 0;
         }
    }

    public boolean moreExpensiveThan(Apartment compared){
        int FirstAprtPrice = this.princePerSquare * this.squares;
        int SecoundAprtPrice = compared.princePerSquare * compared.squares;

        return FirstAprtPrice > SecoundAprtPrice;
    }

}
