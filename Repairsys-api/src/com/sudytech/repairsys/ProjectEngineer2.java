package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface ProjectEngineer2 extends ProjectEngineer  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<ProjectEngineer2> JoinRoot = new JoinRoot<ProjectEngineer2>(ProjectEngineer2.class, "ProjectEngineerPO");
		/** 所属项目 */
	Refer<ProjectEngineer2, Project2> Project = new Refer<ProjectEngineer2, Project2>(ProjectEngineer2.class, Project2.class, "project_");
		/** 所属人员 */
	Refer<ProjectEngineer2, User2> User = new Refer<ProjectEngineer2, User2>(ProjectEngineer2.class, User2.class, "user_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属人员 */
	User2 getUser();
	/**所属项目 */
	Project2 getProject();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}