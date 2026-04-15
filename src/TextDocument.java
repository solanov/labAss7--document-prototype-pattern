class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public void setFilePath(String filePath) { this.filePath = filePath; }
    public String getFilePath() { return filePath; }

    public void setEncoding(String encoding) { this.encoding = encoding; }
    public String getEncoding() { return encoding; }

    public void setWordCount(int wordCount) { this.wordCount = wordCount; }
    public int getWordCount() { return wordCount; }

    @Override
    public Document clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed for TextDocument.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text";
    }
}