import java.util.ArrayList;
import java.util.List;

public class InMemoryInvoiceRepository implements InvoiceRepository {

    List<Invoice> invoices = new ArrayList<>();

    @Override
    public void save(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("[Mock] Fatura salva em memória: ID=" + invoice.getId() + ", total=" + invoice.getTotal());
    }
}