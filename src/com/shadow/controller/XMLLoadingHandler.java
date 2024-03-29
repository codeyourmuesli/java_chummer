package com.shadow.controller;


import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
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


    public static HashMap<String, Object> parseFile(String xmlFile) throws XMLStreamException, FileNotFoundException {
        XMLEventReader eventReader = GetXMLEventReader(xmlFile);
        //hash map for storing all the XML data
        HashMap<String, Object> myMap = new HashMap<>();
        //for every child with sub-children, a new hashMap will be created.
        HashMap<String, Object> currentMap = myMap;
        //for depth handling
        Stack<HashMap<String, Object>> currentPrevMaps = new Stack<>();
        Stack<String> prevAttributeNames = new Stack<>();
        String attributeName = "";

        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();

            if (event.isStartElement()) {
                // neue ebene beginnt

                StartElement startElement = event.asStartElement();
                String key = startElement.getName().getLocalPart();
                //attributeName = startElement.getName().getLocalPart();

                //if (xmlChar.containsXMLKey(key)) {
                while (eventReader.peek().getEventType() == XMLStreamConstants.SPACE ||
                        (eventReader.peek().getEventType() == XMLStreamConstants.CHARACTERS &&
                                eventReader.peek().asCharacters().getData().replaceAll("\\s+", "").equals("")
                        )
                ) {
                    // ignore spaces, look at the next relevant element
                    event = eventReader.nextEvent();
                }
                if (eventReader.peek().getEventType() == XMLStreamConstants.CHARACTERS) {
                    //so ein attribut:
                    // <name>BOD</name>
                    String value = eventReader.peek().asCharacters().getData();
                    currentMap.put(key, value);
                } else if (eventReader.peek().getEventType() == XMLStreamConstants.START_ELEMENT) {
                    //so ein attribut:
                    // <skillgroups><skillgroup>
                    // go one step deeper:
                    // create new currentMap and attributeName
                    // put old ones on stack

                    currentPrevMaps.push(currentMap);
                    currentMap = new HashMap<>();
                    prevAttributeNames.push(attributeName);
                    attributeName = key;
                }
            }
            // If we reach the end of an item element, we add it to the list
            else if (event.isEndElement()) {
                if (event.asEndElement().getName().getLocalPart().equals(attributeName)) {
                    // go one level higher
                    HashMap<String, Object> localMap = currentMap;
                    currentMap = currentPrevMaps.pop();
                    // add created map as value
                    if (!currentMap.containsKey(attributeName)) {
                        currentMap.put(attributeName, localMap);
                        attributeName = prevAttributeNames.pop();
                    } else {
                        // hole das Objekt
                        HashMap<String, Object> local = (HashMap<String, Object>) currentMap.get(attributeName);
                        // wenn es seinen eigenen Key nicht enthält, ist es das
                        // Originalobjekt; <skill> <skill /> </skill> ist verboten
                        //
                        // wenn es schon eine liste ist, hat es das erste Objekt unter seinem Key abgespeichert
                        if (local.containsKey(attributeName)) {
                            int i = 2;
                            while (local.containsKey(attributeName + "_" + i)) {
                                i++;
                            }
                            local.put(attributeName + "_" + i, localMap);
                            currentMap.put(attributeName, local);
                        } else {
                            HashMap<String, Object> localList = new HashMap<>();
                            // put local map in a new list
                            localList.put(attributeName, local);
                            // add new map
                            localList.put(attributeName + "_2", localMap);

                            // and the new list in the current global map
                            currentMap.put(attributeName, localList);
                        }
                        attributeName = prevAttributeNames.pop();
                    }
                }
            }
        }
        return myMap;
    }
}
