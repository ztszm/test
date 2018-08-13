package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface RepairSource2 extends RepairSource  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<RepairSource2> JoinRoot = new JoinRoot<RepairSource2>(RepairSource2.class, "RepairSourcePO");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		
	
	
	//////////end start和end之间不要修改和增加代码
	
}