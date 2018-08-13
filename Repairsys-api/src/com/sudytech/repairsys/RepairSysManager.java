package com.sudytech.repairsys;
import java.util.List;

import com.sudytech.data.mgr.IManagedObject;
import com.sudytech.data.mgr.IManager;
import com.sudytech.orm2.surpport.criteria.Search;
import com.sudytech.orm2.surpport.data.PageCond;
import com.sudytech.orm2.surpport.hiber.NamedQuery.QueryEntity;
import com.sudytech.orm2.surpport.proxy.AccessCheck;

/**
* 
*/
public interface RepairSysManager extends IManager,AccessCheck  {

	//////////start start和end之间不要修改和增加代码
	/**区域 */
	List<? extends Region2> getRegions(PageCond pageCond, Search<? extends Region> search);
 	/**楼宇 */
	Building2 loadBuilding(java.lang.String id);
 	/**区域维修工 */
	RegionEngineer2 loadRegionEngineer(int id);
 	/**楼宇维修工 */
	BuildingEngineer2 loadBuildingEngineer(int id);
 	/**报修来源 */
	List<? extends RepairSource2> getRepairSources(PageCond pageCond, Search<? extends RepairSource> search);
 	/**楼宇维修工 */
	List<? extends BuildingEngineer2> getBuildingEngineers(PageCond pageCond, Search<? extends BuildingEngineer> search);
 	/**创建报修状态 */
	RepairStatus2 createRepairStatus(RepairStatus bean ) throws RepairsysException;
 	/**校区 */
	List<? extends Campus2> getCampuses(PageCond pageCond, Search<? extends Campus> search);
 	/**报修状态 */
	RepairStatus2 loadRepairStatus(java.lang.String id);
 	/**项目维修工 */
	ProjectEngineer2 loadProjectEngineer(int id);
 	/**用户 */
	User2 loadUser(java.lang.String id);
 	/**维修工 */
	List<? extends Engineer2> getEngineers(PageCond pageCond, Search<? extends Engineer> search);
 	/**用户 */
	List<? extends User2> getUsers(PageCond pageCond, Search<? extends User> search);
 	/**项目维修工 */
	List<? extends ProjectEngineer2> getProjectEngineers(PageCond pageCond, Search<? extends ProjectEngineer> search);
 	/**报修申请 */
	RepairApply2 loadRepairApply(int id);
 	/**创建报修来源 */
	RepairSource2 createRepairSource(RepairSource bean ) throws RepairsysException;
 	/**校区 */
	Campus2 loadCampus(java.lang.String id);
 	/**报修来源 */
	RepairSource2 loadRepairSource(java.lang.String id);
 	/**维修项目 */
	List<? extends Project2> getProjects(PageCond pageCond, Search<? extends Project> search);
 	/**宿舍 */
	List<? extends Dorm2> getDorms(PageCond pageCond, Search<? extends Dorm> search);
 	/**宿舍安排 */
	List<? extends DormPlan2> getDormPlans(PageCond pageCond, Search<? extends DormPlan> search);
 	/**宿舍安排 */
	DormPlan2 loadDormPlan(int id);
 	/**报修申请 */
	List<? extends RepairApply2> getRepairApplys(PageCond pageCond, Search<? extends RepairApply> search);
 	/**维修项目 */
	Project2 loadProject(java.lang.String id);
 	/**区域 */
	Region2 loadRegion(java.lang.String id);
 	/**创建顶层维修项目 */
	Project2 createTopProject(Project bean ) throws RepairsysException;
 	/**维修工 */
	Engineer2 loadEngineer(java.lang.String id);
 	/**创建维修工 */
	Engineer2 createEngineer(Engineer bean , User user) throws RepairsysException;
 	/**宿舍 */
	Dorm2 loadDorm(java.lang.String id);
 	/**报修状态 */
	List<? extends RepairStatus2> getRepairStatuses(PageCond pageCond, Search<? extends RepairStatus> search);
 	/**区域维修工 */
	List<? extends RegionEngineer2> getRegionEngineers(PageCond pageCond, Search<? extends RegionEngineer> search);
 	/**楼宇 */
	List<? extends Building2> getBuildings(PageCond pageCond, Search<? extends Building> search);
 	 
				/**命名query */
	List query(QueryEntity queryEntity);
				/**数据分析--楼宇分析 */
	java.util.List<java.util.Map> seachBuildingAnalysisStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**维修排名--区域效率排名 */
	java.util.List<java.util.Map> seachRegionEfficiencyStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**维修排名--个人效率排名 */
	java.util.List<java.util.Map> seachPersonalEfficiencyStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**维修排名--区域满意度排名 */
	java.util.List<java.util.Map> seachBuildingEfficiencyStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**维修排名--个人满意度排名 */
	java.util.List<java.util.Map> seachProjectEfficiencyStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**报修管理 */
	java.util.List<java.util.Map> seachRepairApplyByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据统计--维修项目统计 */
	java.util.List<java.util.Map> seachProjectStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**区域管理--查询eos岗位表 */
	java.util.List<java.util.Map> seachPositionByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据统计--片区工作量统计 */
	java.util.List<java.util.Map> seachRegionStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据统计--个人工作量统计 */
	java.util.List<java.util.Map> seachPersonalStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据统计--楼宇维修量统计 */
	java.util.List<java.util.Map> seachBuildingStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据分析--时间分析 */
	java.util.List<java.util.Map> seachTimeAnalysisStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据分析--时间分析（周） */
	java.util.List<java.util.Map> seachTimeWeekStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据分析--来源分析 */
	java.util.List<java.util.Map> seachSourceAnalysisStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据分析--评价分析 */
	java.util.List<java.util.Map> seachEvaluateAnalysisStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	/**数据分析--维修项目分析 */
	java.util.List<java.util.Map> seachProjectAnalysisStatisticsByParam(java.util.Map<java.lang.String, java.lang.Object> paramMap, com.sudytech.orm2.surpport.data.PageCond pageCond) ;
	
	//////////end start和end之间不要修改和增加代码
	
}