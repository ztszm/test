package com.sudytech.repairsys;
import com.sudytech.data.ITransactionalPM;

public class RepairsysFactory implements IRepairsysFactory{
	
	//////////start start和end之间不要增加和修改代码
	private static final String ERROR_INIT_MESSAGE = "RepairsysFactory has not been init. Please call RepairsysFactory.init() on start";
	private IRepairsysFactory proxy;
	
	private static final RepairsysFactory INSTANCE = new RepairsysFactory();
	
	public static RepairsysFactory getInstance() {
		return INSTANCE;
	}

	@Override
	public RepairSysManager openManager() throws RepairsysException{
		if(proxy == null){
			throw new RuntimeException(ERROR_INIT_MESSAGE);
		}
		return proxy.openManager();
	}
	
	@Override
	public RepairSysManager openManager(String mode) throws RepairsysException{
		if(proxy == null){
			throw new RuntimeException(ERROR_INIT_MESSAGE);
		}
		return proxy.openManager(mode);
	}
	
	public RepairSysManager openManager(ITransactionalPM pm) throws RepairsysException{
		if(proxy == null){
			throw new RuntimeException(ERROR_INIT_MESSAGE);
		}
		return proxy.openManager(pm);
	}
	
	public RepairSysManager openManager(String mode, ITransactionalPM pm) throws RepairsysException{
		if(proxy == null){
			throw new RuntimeException(ERROR_INIT_MESSAGE);
		}
		return proxy.openManager(mode, pm);
	}
	
	public static void init(IRepairsysFactory factory){
		INSTANCE.proxy = factory;
	}
	
	public static void destory(){
		INSTANCE.proxy = null;
	}
	//////////end start和end之间不要修改和增加代码
}
