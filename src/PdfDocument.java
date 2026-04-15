class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public void setFileName(String fileName) { this.fileName = fileName; }
    public String getFileName() { return fileName; }

    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }

    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public int getPageCount() { return pageCount; }

    @Override
    public Document clone() {
        try {
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for PdfDocument.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}