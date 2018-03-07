package application;

import java.util.List;

import dao.TUserMapper;
import dao.pojo.TUser;
import dao.pojo.TUserExample;

public class DaoTest {

	public static void main(String[] args) {
		TUserMapper userMapper = (TUserMapper)ApplicationContextHelper.getInstance().getBean("TUserMapper");
		TUserExample example =  new TUserExample();
		example.createCriteria().andUuidEqualTo("1");
		List<TUser> clublist = userMapper.selectByExample(example);
		System.out.println(clublist.size());
		
		
		
		
	}
}
