package solucao06;

class ReportService {
    public byte[] generate(String format, ReportData data) {
        ReportRenderer renderer = ReportRendererFactory.getRenderer(format);
        return renderer.render(data);
    }
}