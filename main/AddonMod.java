package com.xSowl.betterrings.main;

import com.xSowl.betterrings.main.manager.AddonEntityManager;
import com.xSowl.betterrings.main.manager.AddonMonsterManager;
import com.xSowl.betterrings.main.manager.AddonRenderManager;

public interface AddonMod {

	public AddonEntityManager getEntityManager();
	public AddonMonsterManager getMonsterManager();
	public AddonRenderManager getRenderManager();
	
}
