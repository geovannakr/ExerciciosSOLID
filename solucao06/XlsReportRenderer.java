package solucao06;

class XlsReportRenderer implements ReportRenderer {
    @Override
    public byte[] render(ReportData data) {
        return ("[XLS] " + data.title + "\n" + String.join(";", data.lines)).getBytes();
    }
}