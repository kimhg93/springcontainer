package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.SoundSystemConfig;

/*
*
*
* AutoConfiguratino - JavaConfig
* Componet Scanning ( @Compoenet, @named, @Autowired, @inject)
*					  @Service
*					  @Controller
*   				  @Repository
*
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SoundSystemConfig.class})
public class SoundSystemJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPalyer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	@Test
	public void testCDPlyerNull() {
		assertNotNull(cdPalyer);
	}
	@Test
	public void testPaly() {
		cdPalyer.play();
		assertEquals("Playing 지구멸망 by 양승호",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
