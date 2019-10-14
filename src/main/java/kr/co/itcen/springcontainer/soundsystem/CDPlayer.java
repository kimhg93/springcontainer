package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	// 와이어링 1 @Autowired	
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc compactDisc;	
	
	// 와이어링 2
	//@Inject // 스프링 기반의 와이어링 어노테이션을 사용할 수 없는 경우 
			// @Autowierd와 별차이는 없다. 선호하는 것을 일관성 있게 사용하면 된다
	//@Autowired
	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public CDPlayer() {
		System.out.println("CDPlayer 기본생성자 호출");
	}
	
	// 와이어링 3 @Autowired + setter
	//@Autowired
	public void setCd(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	// 와이어링 3 @Autowired + 일반 메소드
	//@Autowired
	public void insertCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public void play() {
		compactDisc.play();
	}
}
