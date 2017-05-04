/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.asg.metamodel.call.impl;

import org.antlr.v4.runtime.ParserRuleContext;

import io.proleap.vb6.asg.metamodel.Module;
import io.proleap.vb6.asg.metamodel.Scope;
import io.proleap.vb6.asg.metamodel.call.MeCall;
import io.proleap.vb6.asg.metamodel.type.Type;

public class MeCallImpl extends CallImpl implements MeCall {

	protected Module module;

	public MeCallImpl(final String name, final Module module, final Scope scope, final ParserRuleContext ctx) {
		super(name, module, scope, ctx);
	}

	@Override
	public CallType getCallType() {
		return CallType.MeCall;
	}

	@Override
	public Type getType() {
		return module;
	}

}
