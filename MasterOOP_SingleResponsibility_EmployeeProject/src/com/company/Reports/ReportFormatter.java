package com.company.Reports;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {

        switch(formatType){
            case CSV:
                convertObjectToCSV(formatType);
                break;
            case XML:
                convertObjectToXML(formatType);
                break;
        }
    }

    private String convertObjectToXML(Object object){
        System.out.println("Converting Object to XML...");
        return "Converting Object to XML";
    }

    private String convertObjectToCSV(Object object){
        System.out.println("Converting Object to CSV...");
        return "Converting Object to CSV";
    }

    public String getFormattedValue(){
        System.out.println("Retreiving Formatted Value...");
        return "Retrieving Formatted Value: " + formattedOutput;
    }



}
