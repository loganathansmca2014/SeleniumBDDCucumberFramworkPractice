package Practices;

import jdk.internal.org.jline.utils.DiffHelper;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.text.*;
import org.apache.commons.text.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class compare {
    public static void main(String[] args) {
        String actualPdfDir = "E:\\Hackathon_Api_AutomationAirRule\\src\\test\\resources\\results\\actual";
        String expectedPdfDir = "E:\\Hackathon_Api_AutomationAirRule\\src\\test\\resources\\results\\expected";
        String logFilePath = "comparison_results.txt";

        try {
            List<String> actualPdfFiles = getPdfFiles(actualPdfDir);
            List<String> expectedPdfFiles = getPdfFiles(expectedPdfDir);

            comparePdfLists(actualPdfFiles, expectedPdfFiles, logFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getPdfFiles(String directory) throws IOException {
        List<String> pdfFiles = new ArrayList<>();
        File dir = new File(directory);
        File[] files = dir.listFiles((dir1, name) -> name.toLowerCase().endsWith(".pdf"));
        if (files != null) {
            for (File file : files) {
                pdfFiles.add(file.getAbsolutePath());
            }
        } else {
            throw new IOException("Error accessing directory or directory is empty: " + directory);
        }
        return pdfFiles;
    }

    public static void comparePdfLists(List<String> actualPdfFiles, List<String> expectedPdfFiles, String logFilePath) throws IOException {
        if (actualPdfFiles.size() != expectedPdfFiles.size()) {
            throw new IllegalArgumentException("Lists have different sizes, cannot compare.");
        }

        try (FileWriter writer = new FileWriter(logFilePath)) {
            for (int i = 0; i < actualPdfFiles.size(); i++) {
                String actualPdf = actualPdfFiles.get(i);
                String expectedPdf = expectedPdfFiles.get(i);
                String actualText = extractTextFromPdf(actualPdf);
                String expectedText = extractTextFromPdf(expectedPdf);

                writer.write("Comparison result for files: "+"\n\n" + actualPdf + " and " +"\n\n"+ expectedPdf + "\n");

                if (actualText.equals(expectedText)) {
                    writer.write("Match: Content of "+"\n\n" + actualPdf + " matches content of " +"\n\n"+ expectedPdf + "\n\n");
                    writer.write("Actual Content:\n" + actualText + "\n\n");
                    writer.write("Expected Content:\n" + expectedText + "\n\n");

                } else {
                    writer.write("Mismatch: Content of " + actualPdf + " does not match content of " + expectedPdf + "\n\n");

                }
            }
        }
    }

    public static String extractTextFromPdf(String pdfPath) throws IOException {
        try (PDDocument document = PDDocument.load(new File(pdfPath))) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }


}
