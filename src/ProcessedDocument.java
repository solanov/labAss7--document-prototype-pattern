public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        // First PDF
        PdfDocument doc1 = registry.createPdfDocument();
        doc1.setFileName("annual_report_2024.pdf");
        doc1.setAuthor("Acme Corp");
        doc1.setPageCount(150);
        doc1.open();
        System.out.printf("Type: %s, File: %s, Author: %s, Pages: %d\n",
                doc1.getType(), doc1.getFileName(), doc1.getAuthor(), doc1.getPageCount());

        // Text Document
        TextDocument doc2 = registry.createTextDocument();
        doc2.setFilePath("meeting_notes.txt");
        doc2.setEncoding("UTF-8");
        doc2.setWordCount(250);
        doc2.open();
        System.out.printf("Type: %s, Path: %s, Encoding: %s, Words: %d\n",
                doc2.getType(), doc2.getFilePath(), doc2.getEncoding(), doc2.getWordCount());

        // Spreadsheet Document
        SpreadsheetDocument doc3 = registry.createSpreadsheetDocument();
        doc3.setSpreadsheetName("sales_data_q1.xlsx");
        doc3.setRowCount(1000);
        doc3.setColumnCount(20);
        doc3.open();
        System.out.printf("Type: %s, Name: %s, Rows: %d, Columns: %d\n",
                doc3.getType(), doc3.getSpreadsheetName(), doc3.getRowCount(), doc3.getColumnCount());

        // Second PDF
        PdfDocument doc4 = registry.createPdfDocument();
        doc4.setFileName("summary_report.pdf");
        doc4.setAuthor("Acme Corp");
        doc4.setPageCount(30);
        doc4.open();
    }
}