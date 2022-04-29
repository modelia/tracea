package com.cea.papyrus.glossary.profile.commands.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

public class CreateGlossaryMLCommand extends ModelCreationCommandBase implements IModelCreationCommand {
	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Profile profileGlossary = (Profile) PackageUtil.loadPackage(
				URI.createURI("platform:/plugin/com.cea.papyrus.glossary/uml-profiles/GlossaryML.profile.uml"),
				owner.eResource().getResourceSet());
		if (profileGlossary != null) {
			PackageUtil.applyProfile((Package) owner, profileGlossary, true);
		}
		Profile profileReference = (Profile) PackageUtil.loadPackage(
				URI.createURI("platform:/plugin/com.cea.papyrus.referencemanagement/uml-profiles/ReferencesML.profile.uml"),
				owner.eResource().getResourceSet());
		if (profileReference != null) {
			PackageUtil.applyProfile((Package) owner, profileReference, true);
		}
	}
}
