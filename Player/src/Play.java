
public class Play {
    public Manager manager;
    
    public Play() {
    	manager = new Manager();
    }

    public void run() {
    	// Code here    	
    	// You must start with manager.batDau();
    	manager.batDau();
 
        manager.goTo(0);
        manager.ketNoi(0, 1);
        manager.ketNoi(0, 1);
        
        manager.goTo(1);
        manager.ketNoi(1, 0);
        manager.ketNoi(1, 1);
        manager.ketNoi(1, 2);
        manager.ketNoi(1, 3);
        manager.ketNoi(1, 4);
        
        manager.goTo(3);
        manager.ketNoi(3, 0);
        manager.ketNoi(3, 1);
        manager.ketNoi(3, 2);
        manager.ketNoi(3, 3);
        manager.ketNoi(3, 4);
        
        manager.goTo(2);
        manager.ketNoi(2, 1);
        
        // You must finish with manager.ketThuc()
        manager.ketThuc();
    }
}