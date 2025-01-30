package OOP.OOP.Lab7.Checkpoint2;
class Audiobook extends LibraryItem {
    private String barcode;
    private String title;

    public Audiobook(String barcode, String title) {
        this.title = title;
        this.barcode = barcode;
    }
@Override
    public int getLoanPeriod() {
    return 14 ;  
    }
    
@Override
    public void checkout(String borrowerName) {
    System.out.println("Audiobook checked out by " + borrowerName);
    }
}

