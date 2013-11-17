package endtoend;

import static com.objogate.wl.swing.matcher.IterableComponentsMatcher.matching;
import static com.objogate.wl.swing.matcher.JLabelTextMatcher.withLabelText;
import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.equalTo;
//import static java.lang.String.valueOf;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.table.JTableHeader;

import ui.Main;
import ui.Main.MainWindow;

import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.AWTEventQueueProber;
//import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
//import com.objogate.wl.swing.driver.JTableDriver;
//import com.objogate.wl.swing.driver.JTableHeaderDriver;
//import com.objogate.wl.swing.driver.JTextFieldDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;




public class AuctionSniperDriver extends JFrameDriver { 
	public AuctionSniperDriver(int timeoutMillis) { 
		super(new GesturePerformer(), 
				JFrameDriver.topLevelFrame( 
						named(MainWindow.MAIN_WINDOW_NAME), 
						showingOnScreen()), 
						new AWTEventQueueProber(timeoutMillis, 100)); 
	}

	public void showSniperStatus(String statusText) {
		new JLabelDriver(
				this, named(Main.SNIPER_STATUS_NAME)).hasText(equalTo(statusText));
	}
}
