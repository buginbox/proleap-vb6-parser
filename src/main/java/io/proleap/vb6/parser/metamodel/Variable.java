/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel;

import java.util.List;

import io.proleap.vb6.VisualBasic6Parser.VariableSubStmtContext;
import io.proleap.vb6.parser.metamodel.call.VariableCall;
import io.proleap.vb6.parser.metamodel.oop.AssignableTypedElement;
import io.proleap.vb6.parser.metamodel.oop.Declaration;

public interface Variable extends AssignableTypedElement, Declaration, VbScopedElement {

	void addVariableCall(VariableCall variableCall);

	@Override
	VariableSubStmtContext getCtx();

	List<VariableCall> getVariableCalls();

	boolean isCollection();

	boolean isDeclaredAsArray();

	boolean isDeclaredAsStaticArray();

	boolean isModuleVariable();

	boolean isRedimed();

	void setDeclaredAsArray(boolean isArray);

	void setDeclaredAsStaticArray(boolean isStaticArray);

	void setIsRedimed(boolean isRedimed);
}