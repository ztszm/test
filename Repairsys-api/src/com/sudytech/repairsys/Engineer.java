package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 维修工
*/
public interface Engineer extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/**学工号 */
	java.lang.String getLoginName();
	/**学工号 */
	void setLoginName(java.lang.String loginName);
	/**备注 */
	java.lang.String getRemark();
	/**备注 */
	void setRemark(java.lang.String remark);
	/**排序 */
	java.lang.Integer getSort();
	/**排序 */
	void setSort(java.lang.Integer sort);
	/**是否启用 */
	boolean isEnabled();
	/**是否启用 */
	void setEnabled(boolean enabled);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements Engineer{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/**学工号 */
		private java.lang.String loginName;
		/**备注 */
		private java.lang.String remark;
		/**排序 */
		private java.lang.Integer sort;
		/**是否启用 */
		private boolean enabled;
		/**{@inheritDoc} */
		public java.lang.String getLoginName(){
			return this.loginName;
		}
		/**{@inheritDoc} */
		public void setLoginName(java.lang.String loginName){
			this.loginName = loginName;
		}
		/**{@inheritDoc} */
		public java.lang.String getRemark(){
			return this.remark;
		}
		/**{@inheritDoc} */
		public void setRemark(java.lang.String remark){
			this.remark = remark;
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
		public boolean isEnabled(){
			return this.enabled;
		}
		/**{@inheritDoc} */
		public void setEnabled(boolean enabled){
			this.enabled = enabled;
		}
		
		
		public static void copy(Engineer bean, Engineer from){
			 SuperBean.copy(bean, from);
			bean.setLoginName(from.getLoginName());
			bean.setRemark(from.getRemark());
			bean.setSort(from.getSort());
			bean.setEnabled(from.isEnabled());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}