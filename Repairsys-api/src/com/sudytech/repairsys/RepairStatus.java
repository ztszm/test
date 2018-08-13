package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 报修状态
*/
public interface RepairStatus extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/**代码，唯一值 */
	java.lang.String getCode();
	/**代码，唯一值 */
	void setCode(java.lang.String code);
	/**名称 */
	java.lang.String getName();
	/**名称 */
	void setName(java.lang.String name);
	/**排序 */
	java.lang.Integer getSort();
	/**排序 */
	void setSort(java.lang.Integer sort);
	/**是否启用 */
	boolean isEnabled();
	/**是否启用 */
	void setEnabled(boolean enabled);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements RepairStatus{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/**代码，唯一值 */
		private java.lang.String code;
		/**名称 */
		private java.lang.String name;
		/**排序 */
		private java.lang.Integer sort;
		/**是否启用 */
		private boolean enabled;
		/**{@inheritDoc} */
		public java.lang.String getCode(){
			return this.code;
		}
		/**{@inheritDoc} */
		public void setCode(java.lang.String code){
			this.code = code;
		}
		/**{@inheritDoc} */
		public java.lang.String getName(){
			return this.name;
		}
		/**{@inheritDoc} */
		public void setName(java.lang.String name){
			this.name = name;
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
		
		
		public static void copy(RepairStatus bean, RepairStatus from){
			 SuperBean.copy(bean, from);
			bean.setCode(from.getCode());
			bean.setName(from.getName());
			bean.setSort(from.getSort());
			bean.setEnabled(from.isEnabled());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}