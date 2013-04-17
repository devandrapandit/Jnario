package org.jnario.typing;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.xtend.core.typesystem.XtendTypeComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationResult;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.legacy.StandardTypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter;
import org.eclipse.xtext.xbase.typesystem.references.ParameterizedTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.jnario.Assertion;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ShouldThrow;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class JnarioTypeComputer extends XtendTypeComputer {
	
	@Inject CommonTypeComputationServices services;
	@Inject TypeReferences  typeReferences;
	
	@Override
	public void computeTypes(XExpression expression, ITypeComputationState state) {
		if(expression instanceof Assertion){
			_computeType((Assertion)expression, state);
		}else if(expression instanceof ShouldThrow){
			_computeType((ShouldThrow)expression, state);
		}else{
			super.computeTypes(expression, state);
		}
	}
	
	private void _computeType(ShouldThrow expression, ITypeComputationState state) {
		ITypeComputationState expressionState = state.withoutExpectation();
		expressionState.computeTypes(expression.getExpression());
		state.acceptActualType(getPrimitiveVoid(state), ConformanceHint.NO_IMPLICIT_RETURN);
	}

	private void _computeType(Assertion assertion, ITypeComputationState state){
		ITypeComputationState conditionExpectation = state.withExpectation(getTypeForName(Boolean.TYPE, state));
		conditionExpectation.computeTypes(assertion.getExpression());
	}
	
}