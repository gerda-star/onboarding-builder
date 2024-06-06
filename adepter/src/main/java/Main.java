import reportGenerator.PDFReportAdapter;
import reportGenerator.ReportGenerator;
import reportGenerator.typeReport.PDFReporter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new PDFReportAdapter();
        reportGenerator.generateReport("Report for: " + new Date().toString());
    }
}

