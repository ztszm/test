package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 宿舍安排（只读）
*/
public interface DormPlan extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/** */
	int getId();
	/** */
	void setId(int id);
	/**迁出日期 */
	java.util.Date getOutDate();
	/**迁出日期 */
	void setOutDate(java.util.Date outDate);
	/**辅助ID */
	java.lang.String getAuxid();
	/**辅助ID */
	void setAuxid(java.lang.String auxid);
	/**学号 */
	java.lang.String getStudentCode();
	/**学号 */
	void setStudentCode(java.lang.String studentCode);
	/**入住日期 */
	java.util.Date getInDate();
	/**入住日期 */
	void setInDate(java.util.Date inDate);
	/**床位号 */
	java.lang.String getBedBumber();
	/**床位号 */
	void setBedBumber(java.lang.String bedBumber);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements DormPlan{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/** */
		private int id;
		/**迁出日期 */
		private java.util.Date outDate;
		/**辅助ID */
		private java.lang.String auxid;
		/**学号 */
		private java.lang.String studentCode;
		/**入住日期 */
		private java.util.Date inDate;
		/**床位号 */
		private java.lang.String bedBumber;
		/**{@inheritDoc} */
		public int getId(){
			return this.id;
		}
		/**{@inheritDoc} */
		public void setId(int id){
			this.id = id;
		}
		/**{@inheritDoc} */
		public java.util.Date getOutDate(){
			return this.outDate;
		}
		/**{@inheritDoc} */
		public void setOutDate(java.util.Date outDate){
			this.outDate = outDate;
		}
		/**{@inheritDoc} */
		public java.lang.String getAuxid(){
			return this.auxid;
		}
		/**{@inheritDoc} */
		public void setAuxid(java.lang.String auxid){
			this.auxid = auxid;
		}
		/**{@inheritDoc} */
		public java.lang.String getStudentCode(){
			return this.studentCode;
		}
		/**{@inheritDoc} */
		public void setStudentCode(java.lang.String studentCode){
			this.studentCode = studentCode;
		}
		/**{@inheritDoc} */
		public java.util.Date getInDate(){
			return this.inDate;
		}
		/**{@inheritDoc} */
		public void setInDate(java.util.Date inDate){
			this.inDate = inDate;
		}
		/**{@inheritDoc} */
		public java.lang.String getBedBumber(){
			return this.bedBumber;
		}
		/**{@inheritDoc} */
		public void setBedBumber(java.lang.String bedBumber){
			this.bedBumber = bedBumber;
		}
		
		
		public static void copy(DormPlan bean, DormPlan from){
			 SuperBean.copy(bean, from);
			bean.setId(from.getId());
			bean.setOutDate(from.getOutDate());
			bean.setAuxid(from.getAuxid());
			bean.setStudentCode(from.getStudentCode());
			bean.setInDate(from.getInDate());
			bean.setBedBumber(from.getBedBumber());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}