package org.powerbot.bot.rt4.client;

import org.powerbot.bot.reflect.ContextAccessor;
import org.powerbot.bot.reflect.ReflectionEngine;

public class NpcConfig extends ContextAccessor {
	public NpcConfig(final ReflectionEngine engine, final Object parent) {
		super(engine, parent);
	}

	public int getId() {
		return engine.accessInt(this);
	}

	public int getLevel() {
		return engine.accessInt(this);
	}

	public String getName() {
		return engine.access(this, String.class);
	}

	public String[] getActions() {
		return engine.access(this, String[].class);
	}

	public int[] getConfigs() {
		return engine.access(this, int[].class);
	}

	public int getVarpbitIndex() {
		return engine.accessInt(this);
	}

	public int getVarbit() {
		return engine.accessInt(this);
	}
}
