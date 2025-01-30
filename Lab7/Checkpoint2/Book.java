package OOP.OOP.Lab7.Checkpoint2;
class Book extends LibraryItem {
    private String barcode;
    private String title;

    public Book(String barcode, String title) {
        this.title = title;
        this.barcode = barcode;
    }

    @Override
    public int getLoanPeriod() {
        return 21 ;
    }

    @Override
    public void checkout(String borrowerName) {
        System.out.println("Book checked out by " + borrowerName);
    }
}


