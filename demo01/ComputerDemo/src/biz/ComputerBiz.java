package biz;

import entity.Computer;

public class ComputerBiz {
	Computer[] computers;
	
	public Computer[] getComputer(){
		return computers;
	}
	//��ʼ���ӿ����͵Ķ���
	public ComputerBiz() {
		init();
	}

	public void init(){
		computers=new Computer[20];
	}
	//��ӵ�����Ϣ
	public void addComputer(Computer computer){
		for(int i=0;i<computers.length;i++){
			if(null==computers){
				computers[i]=computer;
				break;
			}	
		}		
	}
	//���ҵ�����Ϣ
	public Computer findComputer(String IP){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&IP.equals(computers[i].getIP())){
				return computers[i];
			}
		}
		return null;
	}
	//�޸ĵ�����Ϣ
	public boolean modifyComputer(Computer computer){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&computer.getNum()==(computers[i].getNum())){
				computers[i]=computer;
				return true;
			}
		}
		return false;
	}
	//ɾ��������Ϣ
	public void delComputer(String IP){
		for(int i=0;i<computers.length;i++){
			if(null!=computers&&IP.equals(computers[i].getIP())){
				computers[i]=null;
				clear();
			}
		}
	}
	//��Ԫ������
	 private void clear() {
	        for (int i = 0; i < computers.length - 1; i++) {
	            if (null == computers[i]) {
	            	computers[i] = computers[i + 1];
	            	computers[i + 1] = null;
	            }
	        }
	    }

}

