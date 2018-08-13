package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface BuildingEngineer2 extends BuildingEngineer  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<BuildingEngineer2> JoinRoot = new JoinRoot<BuildingEngineer2>(BuildingEngineer2.class, "BuildingEngineerPO");
		/** 所属人员 */
	Refer<BuildingEngineer2, User2> User = new Refer<BuildingEngineer2, User2>(BuildingEngineer2.class, User2.class, "user_");
		/** 所属楼宇 */
	Refer<BuildingEngineer2, Building2> Building = new Refer<BuildingEngineer2, Building2>(BuildingEngineer2.class, Building2.class, "building_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属人员 */
	User2 getUser();
	/**所属楼宇 */
	Building2 getBuilding();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}