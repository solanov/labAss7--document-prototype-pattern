class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument();

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument();

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    // Renamed from createSheep, createCow, etc. to align with domain
    public PdfDocument createPdfDocument() {
        return (PdfDocument) pdfPrototype.clone();
    }

    public TextDocument createTextDocument() {
        return (TextDocument) textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheetDocument() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}