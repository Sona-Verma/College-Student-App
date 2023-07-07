package com.example.collegeapp.ebook;

public class EbookData {
    private String pdfTitle,pdfUrl;

    public EbookData(){

    }

    public EbookData(String name, String pdfUrl) {
        this.pdfTitle = name;
        this.pdfUrl = pdfUrl;
    }

    public void setPdfTitle(String pdfTitle) {
        this.pdfTitle = pdfTitle;
    }

    public String getPdfTitle() {
        return pdfTitle;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
    public String getPdfUrl() {
        return pdfUrl;
    }


}
