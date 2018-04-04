package hello;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ball.player.PlayerInfo;
import ball.transfermarket.MarketData;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";
    public static AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    	String jj = "<div style=\"color:#00FF00\"> <h3>This is a header%s</h3> <p>This is a paragraph.</p> </div>";
        return String.format(jj, ""+counter.incrementAndGet());
//        return new Greeting(counter.incrementAndGet(),
//        		"<div style=\"color:#00FF00\"> <h3>This is a header</h3> <p>This is a paragraph.</p> </div>");
     
    }
    
    @RequestMapping("/playerlist")
    public String playerlist() {
    	String jj = "<div style=\"color:#00FF00\"> <h4>%s</h4>  </div>";
    	StringBuffer sb0 = new StringBuffer();
    	Iterator<Entry<Long, PlayerInfo>> it =  MarketData.getPlayerMap().entrySet().iterator();
		while(it.hasNext()){
		    Entry<Long, PlayerInfo> entry = it.next();
		    
		    PlayerInfo playerInfo = entry.getValue();
		    StringBuffer sb = new StringBuffer();
		    sb.append(playerInfo.getId());
		    sb.append(" ");
		    sb.append(playerInfo.getAge());
		    sb.append(" ");
		    sb.append(playerInfo.getClubId());
		    sb.append(" ");
		    sb.append(playerInfo.getName());
		    sb.append(" ");
		    sb.append(playerInfo.getNationId());
		    sb.append(" ");
		    sb.append(playerInfo.getPass());
		    sb.append(" ");
		    sb.append(playerInfo.getPrice());
		    sb.append(" ");
		    sb.append(playerInfo.getSense());
		    sb.append(" ");
		    sb.append(playerInfo.getSex());
		    sb.append(" ");
		    sb.append(playerInfo.getShoot());
		    sb.append(" ");
		    sb.append(playerInfo.getTeamId());
		    sb.append(" ");
		    sb.append(playerInfo.getTrapping());
		    sb.append(" ");
		    sb.append(playerInfo.getPosition());
		    
		    sb0.append(String.format(jj, sb.toString()));
		}
    	
        return sb0.toString();
     
    }
    
    
    
}
