/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeatureAccessingExtensionFieldMethods;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureBackgroundStepsReferencingOtherSteps;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureDuplicateExtensionViaStepRerferences;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureErrorMessagesInStepReferences;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureExtensionFields;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureExtensionFieldsInAndStep;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureFieldInitialization;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureOrderingInStepReferences;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureScenarioReferencesTwoStepsFromDifferentScenariosWhichDefineTheSameField;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureStepReferencesWithExtensionsInSameScenario;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureSteps;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureStepsWithShortNames;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureUsingClosuresInSteps;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureUsingFieldsFromOtherSteps;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Contains({ ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario.class, ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword.class, ReferencesForStepsFeatureUsingFieldsFromOtherSteps.class, ReferencesForStepsFeatureStepsWithShortNames.class, ReferencesForStepsFeatureFieldInitialization.class, ReferencesForStepsFeatureSteps.class, ReferencesForStepsFeatureExtensionFields.class, ReferencesForStepsFeatureExtensionFieldsInAndStep.class, ReferencesForStepsFeatureUsingClosuresInSteps.class, ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache.class, ReferencesForStepsFeatureAccessingExtensionFieldMethods.class, ReferencesForStepsFeatureBackgroundStepsReferencingOtherSteps.class, ReferencesForStepsFeatureStepReferencesWithExtensionsInSameScenario.class, ReferencesForStepsFeatureScenarioReferencesTwoStepsFromDifferentScenariosWhichDefineTheSameField.class, ReferencesForStepsFeatureDuplicateExtensionViaStepRerferences.class, ReferencesForStepsFeatureErrorMessagesInStepReferences.class, ReferencesForStepsFeatureOrderingInStepReferences.class })
@Named("References for steps")
@CreateWith(FeatureTestCreator.class)
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeature {
}
