package solucao06;

class ReportRendererFactory {
    public static ReportRenderer getRenderer(String format) {
        switch (format) {
            case "PDF": return new PdfReportRenderer();
            case "CSV": return new CsvReportRenderer();
            case "XLS": return new XlsReportRenderer();
            default: throw new IllegalArgumentException("Formato Inválido: " + format);
        }
    }
}