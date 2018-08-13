package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 宿舍（只读）
*/
public interface Dorm extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/**代码，唯一值 */
	java.lang.String getCode();
	/**代码，唯一值 */
	void setCode(java.lang.String code);
	/**床位数 */
	java.lang.Integer getBedTotal();
	/**床位数 */
	void setBedTotal(java.lang.Integer bedTotal);
	/**房间号 */
	java.lang.String getRoomNumber();
	/**房间号 */
	void setRoomNumber(java.lang.String roomNumber);
	/**房间编号 */
	java.lang.String getRoomCode();
	/**房间编号 */
	void setRoomCode(java.lang.String roomCode);
	/**楼层 */
	java.lang.Integer getFloor();
	/**楼层 */
	void setFloor(java.lang.Integer floor);
	/**是否启用 */
	boolean isEnabled();
	/**是否启用 */
	void setEnabled(boolean enabled);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements Dorm{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/**代码，唯一值 */
		private java.lang.String code;
		/**床位数 */
		private java.lang.Integer bedTotal;
		/**房间号 */
		private java.lang.String roomNumber;
		/**房间编号 */
		private java.lang.String roomCode;
		/**楼层 */
		private java.lang.Integer floor;
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
		public java.lang.Integer getBedTotal(){
			return this.bedTotal;
		}
		/**{@inheritDoc} */
		public void setBedTotal(java.lang.Integer bedTotal){
			this.bedTotal = bedTotal;
		}
		/**{@inheritDoc} */
		public java.lang.String getRoomNumber(){
			return this.roomNumber;
		}
		/**{@inheritDoc} */
		public void setRoomNumber(java.lang.String roomNumber){
			this.roomNumber = roomNumber;
		}
		/**{@inheritDoc} */
		public java.lang.String getRoomCode(){
			return this.roomCode;
		}
		/**{@inheritDoc} */
		public void setRoomCode(java.lang.String roomCode){
			this.roomCode = roomCode;
		}
		/**{@inheritDoc} */
		public java.lang.Integer getFloor(){
			return this.floor;
		}
		/**{@inheritDoc} */
		public void setFloor(java.lang.Integer floor){
			this.floor = floor;
		}
		/**{@inheritDoc} */
		public boolean isEnabled(){
			return this.enabled;
		}
		/**{@inheritDoc} */
		public void setEnabled(boolean enabled){
			this.enabled = enabled;
		}
		
		
		public static void copy(Dorm bean, Dorm from){
			 SuperBean.copy(bean, from);
			bean.setCode(from.getCode());
			bean.setBedTotal(from.getBedTotal());
			bean.setRoomNumber(from.getRoomNumber());
			bean.setRoomCode(from.getRoomCode());
			bean.setFloor(from.getFloor());
			bean.setEnabled(from.isEnabled());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}