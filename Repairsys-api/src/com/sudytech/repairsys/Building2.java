package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Building2 extends Building  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Building2> JoinRoot = new JoinRoot<Building2>(Building2.class, "BuildingPO");
		/** 所在校区 */
	Refer<Building2, Campus2> Campus = new Refer<Building2, Campus2>(Building2.class, Campus2.class, "campus_");
		/** 报修 */
	Refer<Building2, RepairApply2> RepairApplies = new Refer<Building2, RepairApply2>(Building2.class, RepairApply2.class, "repairApplies_");
		/** 宿舍 */
	Refer<Building2, Dorm2> Dorms = new Refer<Building2, Dorm2>(Building2.class, Dorm2.class, "dorms_");
		/** 所属规划用途 */
	Refer<Building2, PlanningUse2> PlanningUse = new Refer<Building2, PlanningUse2>(Building2.class, PlanningUse2.class, "planningUse_");
		/** 所属区域 */
	Refer<Building2, Region2> Region = new Refer<Building2, Region2>(Building2.class, Region2.class, "region_");
		/** 楼宇维修工 */
	Refer<Building2, BuildingEngineer2> BuildingEngineers = new Refer<Building2, BuildingEngineer2>(Building2.class, BuildingEngineer2.class, "buildingEngineers_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**报修 */
	List<? extends RepairApply2> getRepairApplies(PageCond pageCond, Search<? extends RepairApply> search);
	/**所在校区 */
	Campus2 getCampus();
	/**宿舍 */
	List<? extends Dorm2> getDorms(PageCond pageCond, Search<? extends Dorm> search);
	/**所属区域 */
	Region2 getRegion();
	/**楼宇维修工 */
	List<? extends BuildingEngineer2> getBuildingEngineers(PageCond pageCond, Search<? extends BuildingEngineer> search);
	/**所属规划用途 */
	PlanningUse2 getPlanningUse();
	/**创建楼宇维修工 */
	BuildingEngineer2 createAddBuildingEngineer(BuildingEngineer bean , User user) throws RepairsysException;
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}