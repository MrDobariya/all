public class UpdateApplet extends java.applet.Applet  
    implements Runnable {  
     
    private Thread updateThread;  
    int updateInterval = 1000;  

    public void run( ) {  
        while ( updateThread != null ) {  
            try {    
                Thread.sleep(5000 );   
            }
            catch (InterruptedException e ) { 
                return;
            }  
            repaint( );  
        }  
    }  
  
    public void start( ) {  
        if ( updateThread == null ) {  
            updateThread = new Thread(this);  
            updateThread.start( );  
        }  
    }  

    public void stop( ) {  
        if ( updateThread != null ) {  
            Thread runner = updateThread;
            updateThread = null;  // flag to quit
            runner.interrupt( );   // wake up if asleep
        }  
    }  
}

/*
<APPLET code=AppletLoop.class height=500 width=500>
</APPLET>
*/