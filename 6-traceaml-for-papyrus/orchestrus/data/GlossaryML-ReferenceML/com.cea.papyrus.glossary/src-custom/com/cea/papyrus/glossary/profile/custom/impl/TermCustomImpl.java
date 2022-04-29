package com.cea.papyrus.glossary.profile.custom.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.util.UMLUtil;

import GlossaryML.Definition;
import GlossaryML.Term;
import GlossaryML.impl.TermImpl;

public class TermCustomImpl extends TermImpl implements Term {
	@Override 
	public EList<Definition> getMeanings() {
		EList<Definition> definitions = new BasicEList<>();
		Iterator<Comment> it = this.getBase_Class().getOwnedComments().iterator();
		while (it.hasNext()) {
			Comment p = it.next();
			if (UMLUtil.getStereotypeApplication(p, Definition.class) != null) {
				definitions.add(UMLUtil.getStereotypeApplication(p, Definition.class));
			}
		}
		return definitions;
	}

	@Override
	public Definition getCommonMeaning() {
		Definition commonDef = null; 
		Iterator<Comment> it = this.getBase_Class().getOwnedComments().iterator();
		while (commonDef == null && it.hasNext()) {
			Comment p = it.next();
			if (UMLUtil.getStereotypeApplication(p, Definition.class) != null && UMLUtil.getStereotypeApplication(p, Definition.class).isCommon() == true) {
				commonDef = UMLUtil.getStereotypeApplication(p, Definition.class);
			}
		}
		return commonDef;
	}
}
