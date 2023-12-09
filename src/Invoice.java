
class Marker{
  int price;
  int year;
  String color;
  String name;

  public Marker(int price, int year, String color, String name) {
    this.price = price;
    this.year = year;
    this.color = color;
    this.name = name;
  }

}


public class Invoice {
  private Marker marker;
  private int quantity;
  public int calculatePrice(){
    return quantity* marker.price;
  }
  public void invoice(Marker marker, int quantity){
    this.marker = marker;
    this.quantity = quantity;
  }
  public void saveToDB(Marker marker, int quantity){
    this.marker = marker;
    this.quantity = quantity;
  }
}


class PrintInvoice{
  private Invoice invoice;

  public PrintInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  private void invoicePrinter(){
    System.out.println("printing the invoice");
  }
}

interface invoiceDao {
  void save(Invoice invoice);
}
class InvoiceDaoDb implements invoiceDao{
  @Override
  public void save(Invoice invoice){
    System.out.println("Saving to db");
  }
}

class FileInvoiceDao implements invoiceDao{
  @Override
  public void save(Invoice invoice) {
    System.out.println("saving to file");
  }
}

