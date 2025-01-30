package OOP.OOP.Lab7.Checkpoint2;

abstract class LibraryItem {
    public abstract String getBarcode();

    public abstract String getTitle();

    public abstract int getLoanPeriod();
    
    public abstract void checkout(String borrowerName);
}

