package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface DormPlan2 extends DormPlan  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<DormPlan2> JoinRoot = new JoinRoot<DormPlan2>(DormPlan2.class, "DormPlanPO");
		/** 所属宿舍 */
	Refer<DormPlan2, Dorm2> Dorm = new Refer<DormPlan2, Dorm2>(DormPlan2.class, Dorm2.class, "dorm_");
			/**所属宿舍 */
	Dorm2 getDorm();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}