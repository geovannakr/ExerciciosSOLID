public class EmailNotificatorService implements InvoiceNotifier {

    @Override
    public void sendInvoiceCreated(Invoice invoice) {
        System.out.println("Email sent to: " + invoice.getCustomerEmail() + ", invoice=" + invoice.getId() + ", total="
                + invoice.getTotal());
    }

}