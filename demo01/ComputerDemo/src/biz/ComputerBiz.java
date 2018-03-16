package biz;

import entity.Computer;

public class ComputerBiz {
	Computer[] computers;
	
	public Computer[] getComputer(){
		return computers;
	}
	//初始化接口类型的对象
	public ComputerBiz() {
		init();
	}

	public void init(){
		computers=new Computer[20];
	}
	//添加电脑信息
	public void addComputer(Computer computer){
		for(int i=0;i<computers.length;i++){
			if(null==computers){
				computers[i]=computer;
				break;
			}	
		}		
	}
	//查找电脑信息
	public Computer findComputer(String IP){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&IP.equals(computers[i].getIP())){
				return computers[i];
			}
		}
		return null;
	}
	//修改电脑信息
	public boolean modifyComputer(Computer computer){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&computer.getNum()==(computers[i].getNum())){
				computers[i]=computer;
				return true;
			}
		}
		return false;
	}
	//删除电脑信息
	public void delComputer(String IP){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&IP.equals(computers[i].getIP())){
				computers[i]=null;
				clear();
			}
		}
	}
	//空元素往后
	 private void clear() {
	        for (int i = 0; i < computers.length - 1; i++) {
	            if (null == computers[i]) {
	            	computers[i] = computers[i + 1];
	            	computers[i + 1] = null;
	            }
	        }
	    }

}

