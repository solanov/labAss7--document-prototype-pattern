class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public void setSpreadsheetName(String spreadsheetName) { this.spreadsheetName = spreadsheetName; }
    public String getSpreadsheetName() { return spreadsheetName; }

    public void setRowCount(int rowCount) { this.rowCount = rowCount; }
    public int getRowCount() { return rowCount; }

    public void setColumnCount(int columnCount) { this.columnCount = columnCount; }
    public int getColumnCount() { return columnCount; }

    @Override
    public Document clone() {
        try {
            return (SpreadsheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for SpreadsheetDocument.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}