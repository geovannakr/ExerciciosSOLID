package solucao06;

class CsvReportRenderer implements ReportRenderer {
    @Override
    public byte[] render(ReportData data) {
        return String.join("\n", data.lines).getBytes();
    }
}