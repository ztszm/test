package com.sudytech.repairsys;
import com.sudytech.data.ITransactionalPM;
public interface IRepairsysFactory {
	
	//////////start start和end之间不要增加和修改代码
	RepairSysManager openManager() throws RepairsysException;
	
	RepairSysManager openManager(String mode) throws RepairsysException;
	
	RepairSysManager openManager(ITransactionalPM pm) throws RepairsysException;
	
	RepairSysManager openManager(String mode, ITransactionalPM pm) throws RepairsysException;
	//////////end start和end之间不要修改和增加代码
	
}