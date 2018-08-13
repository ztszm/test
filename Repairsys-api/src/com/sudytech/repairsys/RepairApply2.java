package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.criteria.join.JoinRoot;
import com.sudytech.orm2.surpport.criteria.join.Refer;
import com.sudytech.orm2.surpport.data.PageCond;

public interface RepairApply2 extends RepairApply  , com.sudytech.data.mgr.IManagedObject {
	
	//////////start start和end之间不要修改和增加代码
	JoinRoot<RepairApply2> JoinRoot = new JoinRoot<RepairApply2>(RepairApply2.class, "RepairApplyPO");
		/** 终止人学工号 */
	Refer<RepairApply2, User2> Termination = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "termination_");
		/** 所属状态 */
	Refer<RepairApply2, RepairStatus2> RepairStatus = new Refer<RepairApply2, RepairStatus2>(RepairApply2.class, RepairStatus2.class, "repairStatus_");
		/** 所属校区 */
	Refer<RepairApply2, Campus2> Campus = new Refer<RepairApply2, Campus2>(RepairApply2.class, Campus2.class, "campus_");
		/** 所属宿舍 */
	Refer<RepairApply2, Dorm2> Dorm = new Refer<RepairApply2, Dorm2>(RepairApply2.class, Dorm2.class, "dorm_");
		/** 所属维修项目 */
	Refer<RepairApply2, Project2> Project = new Refer<RepairApply2, Project2>(RepairApply2.class, Project2.class, "project_");
		/** 所属楼宇 */
	Refer<RepairApply2, Building2> Building = new Refer<RepairApply2, Building2>(RepairApply2.class, Building2.class, "building_");
		/** 所属来源 */
	Refer<RepairApply2, RepairSource2> RepairSource = new Refer<RepairApply2, RepairSource2>(RepairApply2.class, RepairSource2.class, "repairSource_");
		/** 派修人 */
	Refer<RepairApply2, User2> PaiXiuRen = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "paiXiuRen_");
		/** 驳回人 */
	Refer<RepairApply2, User2> Rejector = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "rejector_");
		/** 评价人 */
	Refer<RepairApply2, User2> Appraiser = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "appraiser_");
		/** 报修人 */
	Refer<RepairApply2, User2> Reportor = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "reportor_");
		/** 所属区域 */
	Refer<RepairApply2, Region2> Region = new Refer<RepairApply2, Region2>(RepairApply2.class, Region2.class, "region_");
		/** 所属维修工人员 */
	Refer<RepairApply2, User2> User = new Refer<RepairApply2, User2>(RepairApply2.class, User2.class, "user_");
			 	/** */
	void update() throws RepairsysException;
	 	 	/** */
	void delete() throws RepairsysException;
	 		/**所属宿舍 */
	Dorm2 getDorm();
	/**所属校区 */
	Campus2 getCampus();
	/**所属维修工人员 */
	User2 getUser();
	/**报修人 */
	User2 getReportor();
	/**驳回人 */
	User2 getRejector();
	/**所属来源 */
	RepairSource2 getRepairSource();
	/**设置状态 */
	void setRepairStatus(RepairStatus bean ) throws RepairsysException;
	/**所属区域 */
	Region2 getRegion();
	/**终止人学工号 */
	User2 getTermination();
	/**评价人 */
	User2 getAppraiser();
	/**所属状态 */
	RepairStatus2 getRepairStatus();
	/**所属楼宇 */
	Building2 getBuilding();
	/**所属维修项目 */
	Project2 getProject();
	/**派修人 */
	User2 getPaiXiuRen();
	
	
	
	//////////end start和end之间不要修改和增加代码
	
}