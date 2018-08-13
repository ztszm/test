package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 报修申请
*/
public interface RepairApply extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/** */
	int getId();
	/** */
	void setId(int id);
	/**派修时间 */
	java.util.Date getPaiXiuShiJian();
	/**派修时间 */
	void setPaiXiuShiJian(java.util.Date paiXiuShiJian);
	/**故障描述 */
	java.lang.String getDescription();
	/**故障描述 */
	void setDescription(java.lang.String description);
	/**评价人员名称 */
	java.lang.String getAppraiserName();
	/**评价人员名称 */
	void setAppraiserName(java.lang.String appraiserName);
	/**维修工名称 */
	java.lang.String getEngineerName();
	/**维修工名称 */
	void setEngineerName(java.lang.String engineerName);
	/**派修人名称 */
	java.lang.String getPaiXiuRenName();
	/**派修人名称 */
	void setPaiXiuRenName(java.lang.String paiXiuRenName);
	/**派修说明 */
	java.lang.String getPaiXiuShuoMing();
	/**派修说明 */
	void setPaiXiuShuoMing(java.lang.String paiXiuShuoMing);
	/**评价人员Id */
	java.lang.Integer getAppraiserId();
	/**评价人员Id */
	void setAppraiserId(java.lang.Integer appraiserId);
	/**终止时间 */
	java.util.Date getTerminationDate();
	/**终止时间 */
	void setTerminationDate(java.util.Date terminationDate);
	/**报修人名称 */
	java.lang.String getReportorName();
	/**报修人名称 */
	void setReportorName(java.lang.String reportorName);
	/**驳回原因 */
	java.lang.String getRejectReason();
	/**驳回原因 */
	void setRejectReason(java.lang.String rejectReason);
	/**附件 */
	java.lang.String getAttachment();
	/**附件 */
	void setAttachment(java.lang.String attachment);
	/**驳回时间 */
	java.util.Date getRejectDate();
	/**驳回时间 */
	void setRejectDate(java.util.Date rejectDate);
	/**驳回活动 */
	java.lang.String getReject();
	/**驳回活动 */
	void setReject(java.lang.String reject);
	/**驳回人名称 */
	java.lang.String getRejectorName();
	/**驳回人名称 */
	void setRejectorName(java.lang.String rejectorName);
	/**评价评分 */
	java.lang.Integer getAppraiseScore();
	/**评价评分 */
	void setAppraiseScore(java.lang.Integer appraiseScore);
	/**终止原因 */
	java.lang.String getTerminationReason();
	/**终止原因 */
	void setTerminationReason(java.lang.String terminationReason);
	/**评价时间 */
	java.util.Date getAppraiseDate();
	/**评价时间 */
	void setAppraiseDate(java.util.Date appraiseDate);
	/**受理分钟（默认0） */
	java.lang.String getAcceptMinute();
	/**受理分钟（默认0） */
	void setAcceptMinute(java.lang.String acceptMinute);
	/**流水号 */
	java.lang.String getSerialNumber();
	/**流水号 */
	void setSerialNumber(java.lang.String serialNumber);
	/**详细地址 */
	java.lang.String getAddress();
	/**详细地址 */
	void setAddress(java.lang.String address);
	/**维修完成说明 */
	java.lang.String getFinishRemark();
	/**维修完成说明 */
	void setFinishRemark(java.lang.String finishRemark);
	/**派修人Id */
	java.lang.Integer getPaiXiuRenId();
	/**派修人Id */
	void setPaiXiuRenId(java.lang.Integer paiXiuRenId);
	/**照片 */
	java.lang.String getPhoto();
	/**照片 */
	void setPhoto(java.lang.String photo);
	/**评价内容 */
	java.lang.String getAppraiseContent();
	/**评价内容 */
	void setAppraiseContent(java.lang.String appraiseContent);
	/**受理用时 */
	java.lang.String getAcceptUsedTime();
	/**受理用时 */
	void setAcceptUsedTime(java.lang.String acceptUsedTime);
	/**排序 */
	java.lang.Integer getSort();
	/**排序 */
	void setSort(java.lang.Integer sort);
	/**驳回人Id */
	java.lang.Integer getRejectorId();
	/**驳回人Id */
	void setRejectorId(java.lang.Integer rejectorId);
	/**流程Id */
	java.lang.Integer getProcessinstId();
	/**流程Id */
	void setProcessinstId(java.lang.Integer processinstId);
	/**终止人名称 */
	java.lang.String getTerminationorName();
	/**终止人名称 */
	void setTerminationorName(java.lang.String terminationorName);
	/**联系方法 */
	java.lang.String getPhone();
	/**联系方法 */
	void setPhone(java.lang.String phone);
	/**评价满意度(1满意，2较满意，3不满意) */
	java.lang.Integer getAppraise();
	/**评价满意度(1满意，2较满意，3不满意) */
	void setAppraise(java.lang.Integer appraise);
	/**维修工Id */
	java.lang.Integer getEngineerId();
	/**维修工Id */
	void setEngineerId(java.lang.Integer engineerId);
	/**维修用时 */
	java.lang.String getRepairUsedTime();
	/**维修用时 */
	void setRepairUsedTime(java.lang.String repairUsedTime);
	/**终止人Id */
	java.lang.Integer getTerminationorId();
	/**终止人Id */
	void setTerminationorId(java.lang.Integer terminationorId);
	/**报修人Id */
	java.lang.Integer getReportorId();
	/**报修人Id */
	void setReportorId(java.lang.Integer reportorId);
	/**维修完成时间 */
	java.util.Date getFinishDate();
	/**维修完成时间 */
	void setFinishDate(java.util.Date finishDate);
	/**申请时间 */
	java.util.Date getApplyDate();
	/**申请时间 */
	void setApplyDate(java.util.Date applyDate);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements RepairApply{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/** */
		private int id;
		/**派修时间 */
		private java.util.Date paiXiuShiJian;
		/**故障描述 */
		private java.lang.String description;
		/**评价人员名称 */
		private java.lang.String appraiserName;
		/**维修工名称 */
		private java.lang.String engineerName;
		/**派修人名称 */
		private java.lang.String paiXiuRenName;
		/**派修说明 */
		private java.lang.String paiXiuShuoMing;
		/**评价人员Id */
		private java.lang.Integer appraiserId;
		/**终止时间 */
		private java.util.Date terminationDate;
		/**报修人名称 */
		private java.lang.String reportorName;
		/**驳回原因 */
		private java.lang.String rejectReason;
		/**附件 */
		private java.lang.String attachment;
		/**驳回时间 */
		private java.util.Date rejectDate;
		/**驳回活动 */
		private java.lang.String reject;
		/**驳回人名称 */
		private java.lang.String rejectorName;
		/**评价评分 */
		private java.lang.Integer appraiseScore;
		/**终止原因 */
		private java.lang.String terminationReason;
		/**评价时间 */
		private java.util.Date appraiseDate;
		/**受理分钟（默认0） */
		private java.lang.String acceptMinute;
		/**流水号 */
		private java.lang.String serialNumber;
		/**详细地址 */
		private java.lang.String address;
		/**维修完成说明 */
		private java.lang.String finishRemark;
		/**派修人Id */
		private java.lang.Integer paiXiuRenId;
		/**照片 */
		private java.lang.String photo;
		/**评价内容 */
		private java.lang.String appraiseContent;
		/**受理用时 */
		private java.lang.String acceptUsedTime;
		/**排序 */
		private java.lang.Integer sort;
		/**驳回人Id */
		private java.lang.Integer rejectorId;
		/**流程Id */
		private java.lang.Integer processinstId;
		/**终止人名称 */
		private java.lang.String terminationorName;
		/**联系方法 */
		private java.lang.String phone;
		/**评价满意度(1满意，2较满意，3不满意) */
		private java.lang.Integer appraise;
		/**维修工Id */
		private java.lang.Integer engineerId;
		/**维修用时 */
		private java.lang.String repairUsedTime;
		/**终止人Id */
		private java.lang.Integer terminationorId;
		/**报修人Id */
		private java.lang.Integer reportorId;
		/**维修完成时间 */
		private java.util.Date finishDate;
		/**申请时间 */
		private java.util.Date applyDate;
		/**{@inheritDoc} */
		public int getId(){
			return this.id;
		}
		/**{@inheritDoc} */
		public void setId(int id){
			this.id = id;
		}
		/**{@inheritDoc} */
		public java.util.Date getPaiXiuShiJian(){
			return this.paiXiuShiJian;
		}
		/**{@inheritDoc} */
		public void setPaiXiuShiJian(java.util.Date paiXiuShiJian){
			this.paiXiuShiJian = paiXiuShiJian;
		}
		/**{@inheritDoc} */
		public java.lang.String getDescription(){
			return this.description;
		}
		/**{@inheritDoc} */
		public void setDescription(java.lang.String description){
			this.description = description;
		}
		/**{@inheritDoc} */
		public java.lang.String getAppraiserName(){
			return this.appraiserName;
		}
		/**{@inheritDoc} */
		public void setAppraiserName(java.lang.String appraiserName){
			this.appraiserName = appraiserName;
		}
		/**{@inheritDoc} */
		public java.lang.String getEngineerName(){
			return this.engineerName;
		}
		/**{@inheritDoc} */
		public void setEngineerName(java.lang.String engineerName){
			this.engineerName = engineerName;
		}
		/**{@inheritDoc} */
		public java.lang.String getPaiXiuRenName(){
			return this.paiXiuRenName;
		}
		/**{@inheritDoc} */
		public void setPaiXiuRenName(java.lang.String paiXiuRenName){
			this.paiXiuRenName = paiXiuRenName;
		}
		/**{@inheritDoc} */
		public java.lang.String getPaiXiuShuoMing(){
			return this.paiXiuShuoMing;
		}
		/**{@inheritDoc} */
		public void setPaiXiuShuoMing(java.lang.String paiXiuShuoMing){
			this.paiXiuShuoMing = paiXiuShuoMing;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getAppraiserId(){
			return this.appraiserId;
		}
		/**{@inheritDoc} */
		public void setAppraiserId(java.lang.Integer appraiserId){
			this.appraiserId = appraiserId;
		}
		/**{@inheritDoc} */
		public java.util.Date getTerminationDate(){
			return this.terminationDate;
		}
		/**{@inheritDoc} */
		public void setTerminationDate(java.util.Date terminationDate){
			this.terminationDate = terminationDate;
		}
		/**{@inheritDoc} */
		public java.lang.String getReportorName(){
			return this.reportorName;
		}
		/**{@inheritDoc} */
		public void setReportorName(java.lang.String reportorName){
			this.reportorName = reportorName;
		}
		/**{@inheritDoc} */
		public java.lang.String getRejectReason(){
			return this.rejectReason;
		}
		/**{@inheritDoc} */
		public void setRejectReason(java.lang.String rejectReason){
			this.rejectReason = rejectReason;
		}
		/**{@inheritDoc} */
		public java.lang.String getAttachment(){
			return this.attachment;
		}
		/**{@inheritDoc} */
		public void setAttachment(java.lang.String attachment){
			this.attachment = attachment;
		}
		/**{@inheritDoc} */
		public java.util.Date getRejectDate(){
			return this.rejectDate;
		}
		/**{@inheritDoc} */
		public void setRejectDate(java.util.Date rejectDate){
			this.rejectDate = rejectDate;
		}
		/**{@inheritDoc} */
		public java.lang.String getReject(){
			return this.reject;
		}
		/**{@inheritDoc} */
		public void setReject(java.lang.String reject){
			this.reject = reject;
		}
		/**{@inheritDoc} */
		public java.lang.String getRejectorName(){
			return this.rejectorName;
		}
		/**{@inheritDoc} */
		public void setRejectorName(java.lang.String rejectorName){
			this.rejectorName = rejectorName;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getAppraiseScore(){
			return this.appraiseScore;
		}
		/**{@inheritDoc} */
		public void setAppraiseScore(java.lang.Integer appraiseScore){
			this.appraiseScore = appraiseScore;
		}
		/**{@inheritDoc} */
		public java.lang.String getTerminationReason(){
			return this.terminationReason;
		}
		/**{@inheritDoc} */
		public void setTerminationReason(java.lang.String terminationReason){
			this.terminationReason = terminationReason;
		}
		/**{@inheritDoc} */
		public java.util.Date getAppraiseDate(){
			return this.appraiseDate;
		}
		/**{@inheritDoc} */
		public void setAppraiseDate(java.util.Date appraiseDate){
			this.appraiseDate = appraiseDate;
		}
		/**{@inheritDoc} */
		public java.lang.String getAcceptMinute(){
			return this.acceptMinute;
		}
		/**{@inheritDoc} */
		public void setAcceptMinute(java.lang.String acceptMinute){
			this.acceptMinute = acceptMinute;
		}
		/**{@inheritDoc} */
		public java.lang.String getSerialNumber(){
			return this.serialNumber;
		}
		/**{@inheritDoc} */
		public void setSerialNumber(java.lang.String serialNumber){
			this.serialNumber = serialNumber;
		}
		/**{@inheritDoc} */
		public java.lang.String getAddress(){
			return this.address;
		}
		/**{@inheritDoc} */
		public void setAddress(java.lang.String address){
			this.address = address;
		}
		/**{@inheritDoc} */
		public java.lang.String getFinishRemark(){
			return this.finishRemark;
		}
		/**{@inheritDoc} */
		public void setFinishRemark(java.lang.String finishRemark){
			this.finishRemark = finishRemark;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getPaiXiuRenId(){
			return this.paiXiuRenId;
		}
		/**{@inheritDoc} */
		public void setPaiXiuRenId(java.lang.Integer paiXiuRenId){
			this.paiXiuRenId = paiXiuRenId;
		}
		/**{@inheritDoc} */
		public java.lang.String getPhoto(){
			return this.photo;
		}
		/**{@inheritDoc} */
		public void setPhoto(java.lang.String photo){
			this.photo = photo;
		}
		/**{@inheritDoc} */
		public java.lang.String getAppraiseContent(){
			return this.appraiseContent;
		}
		/**{@inheritDoc} */
		public void setAppraiseContent(java.lang.String appraiseContent){
			this.appraiseContent = appraiseContent;
		}
		/**{@inheritDoc} */
		public java.lang.String getAcceptUsedTime(){
			return this.acceptUsedTime;
		}
		/**{@inheritDoc} */
		public void setAcceptUsedTime(java.lang.String acceptUsedTime){
			this.acceptUsedTime = acceptUsedTime;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getSort(){
			return this.sort;
		}
		/**{@inheritDoc} */
		public void setSort(java.lang.Integer sort){
			this.sort = sort;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getRejectorId(){
			return this.rejectorId;
		}
		/**{@inheritDoc} */
		public void setRejectorId(java.lang.Integer rejectorId){
			this.rejectorId = rejectorId;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getProcessinstId(){
			return this.processinstId;
		}
		/**{@inheritDoc} */
		public void setProcessinstId(java.lang.Integer processinstId){
			this.processinstId = processinstId;
		}
		/**{@inheritDoc} */
		public java.lang.String getTerminationorName(){
			return this.terminationorName;
		}
		/**{@inheritDoc} */
		public void setTerminationorName(java.lang.String terminationorName){
			this.terminationorName = terminationorName;
		}
		/**{@inheritDoc} */
		public java.lang.String getPhone(){
			return this.phone;
		}
		/**{@inheritDoc} */
		public void setPhone(java.lang.String phone){
			this.phone = phone;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getAppraise(){
			return this.appraise;
		}
		/**{@inheritDoc} */
		public void setAppraise(java.lang.Integer appraise){
			this.appraise = appraise;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getEngineerId(){
			return this.engineerId;
		}
		/**{@inheritDoc} */
		public void setEngineerId(java.lang.Integer engineerId){
			this.engineerId = engineerId;
		}
		/**{@inheritDoc} */
		public java.lang.String getRepairUsedTime(){
			return this.repairUsedTime;
		}
		/**{@inheritDoc} */
		public void setRepairUsedTime(java.lang.String repairUsedTime){
			this.repairUsedTime = repairUsedTime;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getTerminationorId(){
			return this.terminationorId;
		}
		/**{@inheritDoc} */
		public void setTerminationorId(java.lang.Integer terminationorId){
			this.terminationorId = terminationorId;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getReportorId(){
			return this.reportorId;
		}
		/**{@inheritDoc} */
		public void setReportorId(java.lang.Integer reportorId){
			this.reportorId = reportorId;
		}
		/**{@inheritDoc} */
		public java.util.Date getFinishDate(){
			return this.finishDate;
		}
		/**{@inheritDoc} */
		public void setFinishDate(java.util.Date finishDate){
			this.finishDate = finishDate;
		}
		/**{@inheritDoc} */
		public java.util.Date getApplyDate(){
			return this.applyDate;
		}
		/**{@inheritDoc} */
		public void setApplyDate(java.util.Date applyDate){
			this.applyDate = applyDate;
		}
		
		
		public static void copy(RepairApply bean, RepairApply from){
			 SuperBean.copy(bean, from);
			bean.setId(from.getId());
			bean.setPaiXiuShiJian(from.getPaiXiuShiJian());
			bean.setDescription(from.getDescription());
			bean.setAppraiserName(from.getAppraiserName());
			bean.setEngineerName(from.getEngineerName());
			bean.setPaiXiuRenName(from.getPaiXiuRenName());
			bean.setPaiXiuShuoMing(from.getPaiXiuShuoMing());
			bean.setAppraiserId(from.getAppraiserId());
			bean.setTerminationDate(from.getTerminationDate());
			bean.setReportorName(from.getReportorName());
			bean.setRejectReason(from.getRejectReason());
			bean.setAttachment(from.getAttachment());
			bean.setRejectDate(from.getRejectDate());
			bean.setReject(from.getReject());
			bean.setRejectorName(from.getRejectorName());
			bean.setAppraiseScore(from.getAppraiseScore());
			bean.setTerminationReason(from.getTerminationReason());
			bean.setAppraiseDate(from.getAppraiseDate());
			bean.setAcceptMinute(from.getAcceptMinute());
			bean.setSerialNumber(from.getSerialNumber());
			bean.setAddress(from.getAddress());
			bean.setFinishRemark(from.getFinishRemark());
			bean.setPaiXiuRenId(from.getPaiXiuRenId());
			bean.setPhoto(from.getPhoto());
			bean.setAppraiseContent(from.getAppraiseContent());
			bean.setAcceptUsedTime(from.getAcceptUsedTime());
			bean.setSort(from.getSort());
			bean.setRejectorId(from.getRejectorId());
			bean.setProcessinstId(from.getProcessinstId());
			bean.setTerminationorName(from.getTerminationorName());
			bean.setPhone(from.getPhone());
			bean.setAppraise(from.getAppraise());
			bean.setEngineerId(from.getEngineerId());
			bean.setRepairUsedTime(from.getRepairUsedTime());
			bean.setTerminationorId(from.getTerminationorId());
			bean.setReportorId(from.getReportorId());
			bean.setFinishDate(from.getFinishDate());
			bean.setApplyDate(from.getApplyDate());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}