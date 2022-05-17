package Practices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YourClassName {


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
                    System.out.println(actualText);
                    String expectedText = extractTextFromPdf(expectedPdf);
                    System.out.println(expectedText);

                    if (actualText.equals(expectedText)) {
                        writer.write(actualText + " Matches with: "+"\n\n\n\n" + expectedText + "\n");
                    } else {
                        writer.write(actualPdf + " does not match " + expectedPdf + "\n");
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
