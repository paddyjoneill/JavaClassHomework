public class Printer {

    private int sheetsOfPaper;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheetsOfPaper = sheets;
        this.toner = toner;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void print(int copies, int pages) {
        int totalPages;
        totalPages = copies * pages;
        if (totalPages <= this.sheetsOfPaper && totalPages <= this.toner) {
            this.sheetsOfPaper = this.sheetsOfPaper - totalPages;
            this.toner = this.toner - totalPages;
        }
    }

    public int getToner() {
        return toner;
    }
}
