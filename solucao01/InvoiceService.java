public class InvoiceService {
    private final InvoiceCalculator calculator;
    private final InvoiceNotifier notifier;
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceCalculator calculator, InvoiceNotifier notifier, InvoiceRepository repository) {
        this.calculator = calculator;
        this.notifier = notifier;
        this.repository = repository;
    }

    public Invoice creatInvoice(String id, String customerEmail, java.util.List<Double> items, double tax){
        double total = this.calculator.calculateTotal(items, tax);
        Invoice invoice = new Invoice(id, customerEmail, total);
        repository.save(invoice);
        notifier.sendInvoiceCreated(invoice);
        return invoice;
    }
}