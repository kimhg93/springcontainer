package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
 * Auto Configuration - Xml Config(Annotation Scan)
 * Componet Scanning ( @Compoenet, @named, @Autowired, @inject)
 *	 			  	   @Service
 *				  	   @Controller
 *  				   @Repository
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/soundsystem/SoundSystemConfig.xml"})
public class SoundSystemXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired 
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	@Test 
	public void testCDPlayer() {
		assertNotNull(cdPlayer);
	}
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 붕붕 by 김하온",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
