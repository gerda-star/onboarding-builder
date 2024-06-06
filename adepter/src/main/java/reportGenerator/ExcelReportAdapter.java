package reportGenerator;

import reportGenerator.typeReport.ExcelReporter;

public class ExcelReportAdapter implements ReportGenerator {
    ExcelReporter reporter = new ExcelReporter();
    @Override
    public void generateReport(String bodyReport) {
        reporter.createExcelFile(bodyReport);

    }
}
