package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 楼宇区域
*/
public interface BuildingRegion extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/** */
	java.lang.String getSid();
	/** */
	void setSid(java.lang.String sid);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements BuildingRegion{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/** */
		private java.lang.String sid;
		/**{@inheritDoc} */
		public java.lang.String getSid(){
			return this.sid;
		}
		/**{@inheritDoc} */
		public void setSid(java.lang.String sid){
			this.sid = sid;
		}
		
		
		public static void copy(BuildingRegion bean, BuildingRegion from){
			 SuperBean.copy(bean, from);
			bean.setSid(from.getSid());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}