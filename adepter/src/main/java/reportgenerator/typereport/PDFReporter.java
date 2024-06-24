package reportGenerator.typeReport;

import java.io.DataInput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class PDFReporter {

    public void createPDFFile(String content) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("report.pdf"));
            document.open();
            document.add(new Paragraph(content));
            document.close();
            writer.close();
            System.out.println( "PDF отчет сформирован");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
