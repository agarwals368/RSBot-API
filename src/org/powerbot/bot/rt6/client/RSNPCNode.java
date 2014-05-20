package org.powerbot.bot.rt6.client;

import org.powerbot.bot.reflect.ContextAccessor;
import org.powerbot.bot.reflect.ReflectionEngine;

public class RSNPCNode extends ContextAccessor {
	public RSNPCNode(final ReflectionEngine engine, final Object parent) {
		super(engine, parent);
	}

	public RSNPC getRSNPC() {
		return new RSNPC(engine, engine.access(this));
	}
}
