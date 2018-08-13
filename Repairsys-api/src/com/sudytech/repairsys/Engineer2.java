package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Engineer2 extends Engineer  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Engineer2> JoinRoot = new JoinRoot<Engineer2>(Engineer2.class, "EngineerPO");
		/** 所属人员 */
	Refer<Engineer2, User2> User = new Refer<Engineer2, User2>(Engineer2.class, User2.class, "user_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属人员 */
	User2 getUser();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}