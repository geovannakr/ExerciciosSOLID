package solucao06;

public class Main {
    public static void main(String[] args) {
        ReportData data = new ReportData();
        data.title = "Relatório de Vendas";
        data.lines.add("Produto A, 100");
        data.lines.add("Produto B, 200");

        ReportService service = new ReportService();

        System.out.println(new String(service.generate("CSV", data)));
        System.out.println("----");
        System.out.println(new String(service.generate("PDF", data)));
        System.out.println("----");
        System.out.println(new String(service.generate("XLS", data)));
    }
}
