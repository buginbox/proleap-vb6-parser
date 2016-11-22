/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel.call;

import io.proleap.vb6.parser.metamodel.VbScopedElement;
import io.proleap.vb6.parser.metamodel.oop.NamedElement;
import io.proleap.vb6.parser.metamodel.oop.TypedElement;

public interface Call extends VbScopedElement, TypedElement, NamedElement {

	public enum CallContext {
		LET_LEFT_HAND_SIDE
	}

	public enum CallType {
		ApiEnumerationCall, ApiEnumerationConstantCall, ApiProcedureCall, ApiPropertyCall, ArgCall, ArrayElementCall, ConstantCall, DictionaryCall, EnumerationCall, EnumerationConstantCall, FunctionCall, MeCall, ModuleCall, PropertyGetCall, PropertyLetCall, PropertySetCall, ReturnValueCall, SubCall, UndefinedCall, VariableCall;
	}

	CallType getCallType();

	Call unwrap();
}