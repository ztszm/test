package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface BuildingRegion2 extends BuildingRegion  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<BuildingRegion2> JoinRoot = new JoinRoot<BuildingRegion2>(BuildingRegion2.class, "BuildingRegionPO");
		/** 所属区域 */
	Refer<BuildingRegion2, Region2> Region = new Refer<BuildingRegion2, Region2>(BuildingRegion2.class, Region2.class, "region_");
		/** 所属楼宇 */
	Refer<BuildingRegion2, Building2> Building = new Refer<BuildingRegion2, Building2>(BuildingRegion2.class, Building2.class, "building_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属区域 */
	Region2 getRegion();
	/**所属楼宇 */
	Building2 getBuilding();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}