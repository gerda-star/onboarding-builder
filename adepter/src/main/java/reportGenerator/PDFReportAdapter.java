package reportGenerator;

import reportGenerator.typeReport.PDFReporter;

public class PDFReportAdapter implements ReportGenerator{
    PDFReporter reporter = new PDFReporter();

    @Override
    public void generateReport(String bodyReport) {
        reporter.createPDFFile(bodyReport);
    }
}
