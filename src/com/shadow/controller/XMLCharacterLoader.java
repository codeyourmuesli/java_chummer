package com.shadow.controller;

import com.shadow.model.Character;
import com.shadow.model.XML_Char;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.util.*;

import static com.shadow.controller.XMLLoadingHandler.parseFile;

public class XMLCharacterLoader {

    private String xmlStart = "character";
    private String local_file = "chars/elfi.chum";
    private XML_Char loaded_char = null;
    private Character createdCharacter;


    public XMLCharacterLoader(String configFile) {
        // load character in loaded_char
        parseXMLFile(configFile);
        // create character out of it
        createdCharacter = loaded_char.createChar();
        //System.out.println(createdCharacter.toString());
    }

    private void parseXMLFile(String configFile) {
        try {
            configFile = local_file;
            // read the XML document
            //load all data into a hash map
            HashMap<String,Object> myMap = XMLLoadingHandler.parseFile(configFile);

            //create XML_Char with that information
            XML_Char xmlChar = new XML_Char();
            xmlChar.setXMLAttributes(myMap);
            // save as global variable
            loaded_char = xmlChar;
        } catch (FileNotFoundException | XMLStreamException e1) {
            e1.printStackTrace();
        }
    }

    public Character getCreatedCharacter() {
        return createdCharacter;
    }
}
