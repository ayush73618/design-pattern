package com.company.BehaviouralPatterns.TemplateMethodPattern;


class CSVParser{

    public void parse(){
        openFile();
        System.out.println("Parsing CSV file");
        closeFile();


    }

    private void openFile(){
        System.out.println("Opening file");
    }

    private void closeFile(){
        System.out.println("Closing file");
    }
}

class XMLParser{

    public void parse(){
        openFile();
        System.out.println("Parsing XML file");
        closeFile();


    }

    private void openFile(){
        System.out.println("Opening file");
    }

    private void closeFile(){
        System.out.println("Closing file");
    }
}
public class WithoutTemplateMethod {

    public static void main(String[] args) {
        CSVParser csv = new CSVParser();
        csv.parse();
        XMLParser xml = new XMLParser();
        xml.parse();
    }

}
