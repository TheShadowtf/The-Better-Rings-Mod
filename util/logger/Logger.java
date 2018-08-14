package com.xSowl.betterrings.util.logger;

import org.apache.logging.log4j.Level;

import com.xSowl.betterrings.main.Reference;

import cpw.mods.fml.common.FMLLog;

public class Logger
{
	public static boolean debug = false;
	public static void log(Level logLevel, Object object)
	{
		FMLLog.log(Reference.MODID, logLevel, String.valueOf(object), new Object[0]);
	}

	public static void error(Object object)
	{
		log(Level.ERROR, object);
	}

	public static void info(Object object)
	{
		log(Level.INFO, object);
	}

	public static void warn(Object object)
	{
		log(Level.WARN, object);
	}

	public static void debug(Object object)
	{
		if(debug) {
			log(Level.INFO, "[DEBUG:] "+object);
		}
	}
}