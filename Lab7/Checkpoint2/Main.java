package OOP.OOP.Lab7.Checkpoint2;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        String[] titles = {"The Hitchhiker's Guide to the Galaxy" ,"Moby Dick" ,"The Shawshank Redemption"};
        String[] barcodes = {"B001234" ,"A009876" ,"D005432"};
        
        Random rand = new Random();

        for (int i = 0; i < items.length; i++) {
            int typeLibraryItem = rand.nextInt(3);
            if (typeLibraryItem == 0) {
                items[i] = new Book(barcodes[i], titles[i]);
            } else if (typeLibraryItem == 1) {
                items[i] = new Audiobook(barcodes[i], titles[i]);
            } else {
                items[i] = new DVD(barcodes[i], titles[i]);
            }
        }
        for (LibraryItem Random : items) {
            System.out.println("Barcode : " + Random.getBarcode() + " ,Title : " + Random.getTitle() +" ,Loan Period : " + Random.getLoanPeriod() + " days");
            Random.checkout("John Doe");
            System.out.println();
        }
    }
}
