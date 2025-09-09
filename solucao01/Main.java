import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> items = Arrays.asList(100.0, 200.0, 50.0);
        double tax = 0.1;

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoiceNotifier notifier = new EmailNotificatorService();
        InvoiceRepository repository = new InMemoryInvoiceRepository();

        InvoiceService service = new InvoiceService(calculator, notifier, repository);

        Invoice invoice = service.creatInvoice("INV-001", "matheus.quost@edu.sc.senai.br", items, tax);
        System.out.println("Fatura criada: " + invoice.getId() + " Total=" + invoice.getTotal());

            List<Double> items2 = Arrays.asList(200.0, 50.0);


        Invoice invoice2 = service.creatInvoice("INV-002", "bruno.silva@edu.sc.senai.br", items2, tax);
        System.out.println("Fatura criada: " + invoice2.getId() + " Total=" + invoice2.getTotal());

    }
}