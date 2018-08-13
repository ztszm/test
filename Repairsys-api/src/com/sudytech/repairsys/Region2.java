package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Region2 extends Region  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Region2> JoinRoot = new JoinRoot<Region2>(Region2.class, "RegionPO");
		/** 区域维修工 */
	Refer<Region2, RegionEngineer2> RegionEngineers = new Refer<Region2, RegionEngineer2>(Region2.class, RegionEngineer2.class, "regionEngineers_");
		/** 所属校区 */
	Refer<Region2, Campus2> Campus = new Refer<Region2, Campus2>(Region2.class, Campus2.class, "campus_");
		/** 楼宇 */
	Refer<Region2, Building2> Buildings = new Refer<Region2, Building2>(Region2.class, Building2.class, "buildings_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**创建区域维修工 */
	RegionEngineer2 createAddRegionEngineer(RegionEngineer bean , User user) throws RepairsysException;
	/**所属校区 */
	Campus2 getCampus();
	/**区域维修工 */
	List<? extends RegionEngineer2> getRegionEngineers(PageCond pageCond, Search<? extends RegionEngineer> search);
	/**楼宇 */
	List<? extends Building2> getBuildings(PageCond pageCond, Search<? extends Building> search);
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}