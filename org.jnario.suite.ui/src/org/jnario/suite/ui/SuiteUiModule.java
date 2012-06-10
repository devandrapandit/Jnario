/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.suite.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.ide.contentassist.ImportingTypesProposalProvider;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.jnario.suite.ui.highlighting.SuiteHighlightingCalculator;
import org.jnario.suite.ui.highlighting.SuiteHighlightingConfiguration;
import org.jnario.suite.ui.highlighting.SuiteTokenHighlighting;
import org.jnario.suite.ui.hover.SuiteHoverProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class SuiteUiModule extends org.jnario.suite.ui.AbstractSuiteUiModule {
	public SuiteUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
		return ImportingTypesProposalProvider.class;
	}
	
	@Override
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SuiteHighlightingCalculator.class;
	}
	
	@Override
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return SuiteHighlightingConfiguration.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return SuiteTokenHighlighting.class;
	}
	
	@Override
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return SuiteHoverProvider.class;
	}
}
