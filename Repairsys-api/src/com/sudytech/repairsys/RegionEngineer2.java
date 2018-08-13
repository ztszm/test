package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface RegionEngineer2 extends RegionEngineer  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<RegionEngineer2> JoinRoot = new JoinRoot<RegionEngineer2>(RegionEngineer2.class, "RegionEngineerPO");
		/** 所属区域 */
	Refer<RegionEngineer2, Region2> Region = new Refer<RegionEngineer2, Region2>(RegionEngineer2.class, Region2.class, "region_");
		/** 所属人员 */
	Refer<RegionEngineer2, User2> User = new Refer<RegionEngineer2, User2>(RegionEngineer2.class, User2.class, "user_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属区域 */
	Region2 getRegion();
	/**所属人员 */
	User2 getUser();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}