package OOP.OOP.Lab7.Checkpoint2;
class DVD extends LibraryItem {
    private String barcode;
    private String title;

    public DVD(String barcode, String title) {
        this.title = title;
        this.barcode = barcode;
    }

    @Override
    public int getLoanPeriod() {
        return 7 ;
    }
    @Override
    public void checkout(String borrowerName) {
        System.out.println("DVD checked out by " + borrowerName);
    }
}