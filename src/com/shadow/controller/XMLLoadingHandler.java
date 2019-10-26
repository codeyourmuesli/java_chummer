package com.shadow.controller;


import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Stack;

public class XMLLoadingHandler {

    public XMLLoadingHandler(){

    }

    public static XMLEventReader GetXMLEventReader(String filePath) throws FileNotFoundException, XMLStreamException {
        String configFile = filePath;
        // First, create a new XMLInputFactory
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        // Setup a new eventReader
        InputStream in = new FileInputStream(configFile);
        XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
        // read the XML document with eventReader
        return eventReader;
    }
}
