package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface Project2 extends Project  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<Project2> JoinRoot = new JoinRoot<Project2>(Project2.class, "ProjectPO");
		/** 父项目 */
	Refer<Project2, Project2> Parent = new Refer<Project2, Project2>(Project2.class, Project2.class, "parent_");
		/** 项目维修工 */
	Refer<Project2, ProjectEngineer2> ProjectEngineers = new Refer<Project2, ProjectEngineer2>(Project2.class, ProjectEngineer2.class, "projectEngineers_");
		/** 子项目 */
	Refer<Project2, Project2> Children = new Refer<Project2, Project2>(Project2.class, Project2.class, "children_");
		/** 报修 */
	Refer<Project2, RepairApply2> RepairApplies = new Refer<Project2, RepairApply2>(Project2.class, RepairApply2.class, "repairApplies_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**报修 */
	List<? extends RepairApply2> getRepairApplies(PageCond pageCond, Search<? extends RepairApply> search);
	/**子项目 */
	List<? extends Project2> getChildren(PageCond pageCond, Search<? extends Project> search);
	/**父项目 */
	Project2 getParent();
	/**创建子项目 */
	Project2 createAddChild(Project bean ) throws RepairsysException;
	/**项目维修工 */
	List<? extends ProjectEngineer2> getProjectEngineers(PageCond pageCond, Search<? extends ProjectEngineer> search);
	/**创建项目维修工 */
	ProjectEngineer2 createAddProjectEngineer(ProjectEngineer bean , User user) throws RepairsysException;
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}