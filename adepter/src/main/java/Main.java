import reportGenerator.ExcelReportAdapter;
import reportGenerator.PDFReportAdapter;
import reportGenerator.ReportGenerator;
import reportGenerator.typeReport.ExcelReporter;
import reportGenerator.typeReport.PDFReporter;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReportGenerator reportGenerator =  selectFormat();
        reportGenerator.generateReport("Report for: " + new Date().toString());
    }

    public static ReportGenerator selectFormat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбираем формат: PDF, XLS");
        String format = in.nextLine().toLowerCase();
        in.close();

        return setGenerator(format);
    }

    public static ReportGenerator setGenerator(String format) {
        ReportGenerator reportGenerator;
        switch (format) {
            case "pdf":
                System.out.println("==== Your choice: PDF ====");
                reportGenerator = new PDFReportAdapter();
                return reportGenerator;
            case "xls":
                System.out.println("==== Your choice: XLS ====");
                reportGenerator = new ExcelReportAdapter();
                return reportGenerator;
            default:
                System.out.println("неизвестный формат");
                return null;
        }
    }
}

