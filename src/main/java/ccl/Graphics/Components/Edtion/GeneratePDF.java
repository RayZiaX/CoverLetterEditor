package ccl.Graphics.Components.Edtion;

import java.io.FileOutputStream;
import java.text.AttributedString;
import java.text.NumberFormat.Style;

import javax.swing.event.DocumentListener;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import ccl.Graphics.GUI.MainFrame;

public class GeneratePDF {


    private String _path = "./Files/";
    private String _nameFile;
    private String[] _extentionFile = {".pdf"};

    public GeneratePDF(String nameFile){
        this._nameFile = nameFile;
    }

    public void createPDFFile(){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(this._path+this._nameFile+this._extentionFile[0]));
            document.open();
            Paragraph para = new Paragraph(MainFrame.getInstance()._textPane.getText());
            document.add(para);
            document.close();
            System.out.println("Finished");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void test(AttributedString attr){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(this._path+this._nameFile+this._extentionFile[0]));
            document.open();
            Paragraph para = new Paragraph((Chunk) attr.getIterator());
            document.add(para);
            document.close();
            System.out.println("Finished");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
