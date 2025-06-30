package com.company.BehaviouralPatterns.TemplateMethodPattern;


abstract  class DataParser{
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("Opening File");
    }

    protected void closeFile(){
        System.out.println("Closing File");
    }

    protected abstract void parseData();

}

class CSVParserII extends DataParser{

    @Override
    protected void parseData(){
        System.out.println("CSV Parser is Being Processed");
    }
}

class XMLParserII extends DataParser{

    @Override
    protected void parseData(){
        System.out.println("XML Parser is Being Processed");
    }
}


public class WithTemplateMethod {
    public static void main(String[] args) {
        DataParser csv = new CSVParserII();
        csv.parse();
        DataParser xml = new XMLParserII();
        xml.parse();

    }
}
