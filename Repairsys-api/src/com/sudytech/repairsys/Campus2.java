package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Campus2 extends Campus  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Campus2> JoinRoot = new JoinRoot<Campus2>(Campus2.class, "CampusPO");
		/** 区域 */
	Refer<Campus2, Region2> Regions = new Refer<Campus2, Region2>(Campus2.class, Region2.class, "regions_");
		/** 报修 */
	Refer<Campus2, RepairApply2> RepairApplies = new Refer<Campus2, RepairApply2>(Campus2.class, RepairApply2.class, "repairApplies_");
		/** 楼宇 */
	Refer<Campus2, Building2> Buildings = new Refer<Campus2, Building2>(Campus2.class, Building2.class, "buildings_");
			/**区域 */
	List<? extends Region2> getRegions(PageCond pageCond, Search<? extends Region> search);
	/**报修 */
	List<? extends RepairApply2> getRepairApplies(PageCond pageCond, Search<? extends RepairApply> search);
	/**创建区域 */
	Region2 createAddRegion(Region bean ) throws RepairsysException;
	/**楼宇 */
	List<? extends Building2> getBuildings(PageCond pageCond, Search<? extends Building> search);
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}