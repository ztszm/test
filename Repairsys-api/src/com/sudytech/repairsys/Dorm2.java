package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Dorm2 extends Dorm  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Dorm2> JoinRoot = new JoinRoot<Dorm2>(Dorm2.class, "DormPO");
		/** 宿舍安排 */
	Refer<Dorm2, DormPlan2> DormPlans = new Refer<Dorm2, DormPlan2>(Dorm2.class, DormPlan2.class, "dormPlans_");
		/** 所属楼宇 */
	Refer<Dorm2, Building2> Building = new Refer<Dorm2, Building2>(Dorm2.class, Building2.class, "building_");
			/**宿舍安排 */
	List<? extends DormPlan2> getDormPlans(PageCond pageCond, Search<? extends DormPlan> search);
	/**所属楼宇 */
	Building2 getBuilding();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}