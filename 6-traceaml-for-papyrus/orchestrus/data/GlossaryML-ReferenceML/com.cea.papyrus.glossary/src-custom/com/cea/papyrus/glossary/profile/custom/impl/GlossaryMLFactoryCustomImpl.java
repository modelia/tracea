/**
 */
package com.cea.papyrus.glossary.profile.custom.impl;

import GlossaryML.GlossaryMLFactory;
import GlossaryML.Term;
import GlossaryML.Glossary;
import GlossaryML.impl.GlossaryMLFactoryImpl;


public class GlossaryMLFactoryCustomImpl extends GlossaryMLFactoryImpl implements GlossaryMLFactory {

	public Term createTerm() {
		TermCustomImpl term = new TermCustomImpl();
		return term;
	}
	
	public Glossary createGlossary() {
		GlossaryCustomImpl glossary = new GlossaryCustomImpl();
		return glossary;
	}

} //GlossaryMLFactoryImpl
