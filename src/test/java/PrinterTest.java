import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100,200);
    }

    @Test
    public void has_100_pages_to_start(){
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void can_print(){
        printer.print(3,4);
        assertEquals(88, printer.getSheetsOfPaper());
    }

    @Test
    public void wont_print_if_not_enough_paper(){
        printer.print(10,11);
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void has_initial_toner_level(){
        assertEquals(200, printer.getToner());
    }

    @Test
    public void toner_level_decreases(){
        printer.print(1,10);
        assertEquals(190, printer.getToner());
    }

}
