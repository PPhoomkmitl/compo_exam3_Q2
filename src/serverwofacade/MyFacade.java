/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author Phoom1645
 */
public class MyFacade {
    private static MyFacade myFacadeObj = null;
    /* Singleton */
    public static MyFacade getMyFacadeObj(){
        if(myFacadeObj == null) {
            myFacadeObj = new MyFacade();
        }
        return myFacadeObj;   
    }
    
    public void ServerFacade(){
        ScheduleServer scheduleServer = new ScheduleServer();
	scheduleServer.startBooting();
	scheduleServer.readSystemConfigFile();
	scheduleServer.init();
	scheduleServer.initializeContext();
	scheduleServer.initializeListeners();
	scheduleServer.createSystemObjects();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	scheduleServer.releaseProcesses();
	scheduleServer.destory();
	scheduleServer.destroySystemObjects();
	scheduleServer.destoryListeners();
	scheduleServer.destoryContext();
	scheduleServer.shutdown();
    }
}
