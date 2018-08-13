package com.sudytech.repairsys;
import com.sudytech.orm2.surpport.SuperBean;
import com.sudytech.orm2.surpport.Attribute;

/**
* 这是一个只读的用户对象，直接映射到系统的T_USER上
*/
public interface User extends  Attribute {
	
	//////////start start和end之间不要修改和增加代码
	
	/**登录名 */
	java.lang.String getLoginName();
	/**登录名 */
	void setLoginName(java.lang.String loginName);
	/**生日 */
	java.util.Date getBirthday();
	/**生日 */
	void setBirthday(java.util.Date birthday);
	/**办公电话 */
	java.lang.String getOfficePhone();
	/**办公电话 */
	void setOfficePhone(java.lang.String officePhone);
	/**性别 */
	java.lang.String getSex();
	/**性别 */
	void setSex(java.lang.String sex);
	/**姓名 */
	java.lang.String getName();
	/**姓名 */
	void setName(java.lang.String name);
	/**手机号 */
	java.lang.String getMobile();
	/**手机号 */
	void setMobile(java.lang.String mobile);
	
	//////////end start和end之间不要修改和增加代码
	
	class object extends  SuperBean  implements User{
		private static final long serialVersionUID = 1L;
		//////////start start和end之间不要修改和增加代码
		/**登录名 */
		private java.lang.String loginName;
		/**生日 */
		private java.util.Date birthday;
		/**办公电话 */
		private java.lang.String officePhone;
		/**性别 */
		private java.lang.String sex;
		/**姓名 */
		private java.lang.String name;
		/**手机号 */
		private java.lang.String mobile;
		/**{@inheritDoc} */
		public java.lang.String getLoginName(){
			return this.loginName;
		}
		/**{@inheritDoc} */
		public void setLoginName(java.lang.String loginName){
			this.loginName = loginName;
		}
		/**{@inheritDoc} */
		public java.util.Date getBirthday(){
			return this.birthday;
		}
		/**{@inheritDoc} */
		public void setBirthday(java.util.Date birthday){
			this.birthday = birthday;
		}
		/**{@inheritDoc} */
		public java.lang.String getOfficePhone(){
			return this.officePhone;
		}
		/**{@inheritDoc} */
		public void setOfficePhone(java.lang.String officePhone){
			this.officePhone = officePhone;
		}
		/**{@inheritDoc} */
		public java.lang.String getSex(){
			return this.sex;
		}
		/**{@inheritDoc} */
		public void setSex(java.lang.String sex){
			this.sex = sex;
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
		public java.lang.String getMobile(){
			return this.mobile;
		}
		/**{@inheritDoc} */
		public void setMobile(java.lang.String mobile){
			this.mobile = mobile;
		}
		
		
		public static void copy(User bean, User from){
			 SuperBean.copy(bean, from);
			bean.setLoginName(from.getLoginName());
			bean.setBirthday(from.getBirthday());
			bean.setOfficePhone(from.getOfficePhone());
			bean.setSex(from.getSex());
			bean.setName(from.getName());
			bean.setMobile(from.getMobile());
			
		}
		//////////end start和end之间不要修改和增加代码
	}
	
}