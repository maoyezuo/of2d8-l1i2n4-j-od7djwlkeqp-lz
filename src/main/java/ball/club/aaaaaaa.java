package ball.club;

import java.util.List;

import application.ApplicationContextHelper;
import dao.TBallPlayerMapper;
import dao.pojo.TBallPlayer;
import dao.pojo.TBallPlayerExample;

public class aaaaaaa {
	
	public static void main(String[] args) {
		TBallPlayerMapper mapper = (TBallPlayerMapper)ApplicationContextHelper.getInstance().getBean("TBallPlayerMapper");
		TBallPlayerExample example = new TBallPlayerExample();
		example.setOrderByClause("`id` asc limit 3");// limit 3
		List<TBallPlayer> list2 = mapper.selectByExample(example);
		System.out.println(list2.size());
	}

}
