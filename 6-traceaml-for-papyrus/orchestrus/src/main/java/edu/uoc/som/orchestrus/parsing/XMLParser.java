/*****************************************************************************
* Copyright (c) 2015, 2022 CEA-LIST & SOM-UOC, Edouard Batot
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
* UOC-SOM - Initial API and implementation
*  -> Edouard Batot (UOC SOM) ebatot@uoc.edu 
*****************************************************************************/


package edu.uoc.som.orchestrus.parsing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class XMLParser {
    
    static final String packageImport = "packageImport";
    static final String importedPackage = "importedPackage";

    static final String packagedElement = "packagedElement";
    static final String ownedAttribute = "ownedAttribute";
    
    static final String type = "type";
    static final String xmitype = "xmi:type";
    static final String href = "href";
    static final String ecore = "ecore";
    static final String uml = "uml";
    static final String notation = "notation";

    public List<Item> readConfig(String configFile) {
        List<Item> items = new ArrayList<Item>();
        try {
            // First, create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Setup a new eventReader
            InputStream in = new FileInputStream(configFile);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // read the XML document
            Item item = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    // If we have an item element, we create a new item
                        String elementName = startElement.getName().getLocalPart();
                        
                        switch (elementName) {
                        case type:
//                            item = new Item();
//                            // We read the attributes from this tag and add the date
//                            // attribute to our object
//                            Iterator<Attribute> attributes = startElement.getAttributes();
//                            while (attributes.hasNext()) {
//                                Attribute attribute = attributes.next();
//                                if (attribute.getName().toString().equals(DATE)) {
//                                    item.setDate(attribute.getValue());
//                                }
//                            }
//                            break;
//                        case MODE:
//                            event = eventReader.nextEvent();
//                            item.setMode(event.asCharacters().getData());
//                            break;
//                        case UNIT:
//                            event = eventReader.nextEvent();
//                            item.setUnit(event.asCharacters().getData());
//                            break;
//                        case CURRENT:
//                            event = eventReader.nextEvent();
//                            item.setCurrent(event.asCharacters().getData());
//                            break;
//                        case INTERACTIVE:
//                            event = eventReader.nextEvent();
//                            item.setInteractive(event.asCharacters().getData());
                            break;
                        }
                }
                    // If we reach the end of an item element, we add it to the list
                    if (event.isEndElement()) {
                        EndElement endElement = event.asEndElement();
                        if (endElement.getName().getLocalPart().equals(type)) {
                            items.add(item);
                        }
                    }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return items;
    }

}
