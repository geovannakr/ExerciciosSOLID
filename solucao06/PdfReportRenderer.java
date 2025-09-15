package solucao06;

class PdfReportRenderer implements ReportRenderer {
    @Override
    public byte[] render(ReportData data) {
        return ("[PDF] " + data.title + "\n" + String.join("\n", data.lines)).getBytes();
    }
}