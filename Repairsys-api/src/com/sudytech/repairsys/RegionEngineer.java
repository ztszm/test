package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 区域维修工
*/
public interface RegionEngineer extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/** */
	int getId();
	/** */
	void setId(int id);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements RegionEngineer{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/** */
		private int id;
		/**{@inheritDoc} */
		public int getId(){
			return this.id;
		}
		/**{@inheritDoc} */
		public void setId(int id){
			this.id = id;
		}
		
		
		public static void copy(RegionEngineer bean, RegionEngineer from){
			 SuperBean.copy(bean, from);
			bean.setId(from.getId());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}