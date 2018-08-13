package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface PlanningUse2 extends PlanningUse  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<PlanningUse2> JoinRoot = new JoinRoot<PlanningUse2>(PlanningUse2.class, "PlanningUsePO");
			
	
	
	//////////end start和end之间不要修改和增加代码
	
}