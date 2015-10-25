package npnets.simulator.simulate;

import java.util.ArrayList;
import java.util.List;

import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.Token;

public class TokenTimeList {
 public TokenTimeList() {
		super();
		list=new ArrayList<TokenTime>();
}
private List<TokenTime> list;

public void add(TokenTime token){
	list.add(token);
}

public TokenTime get(int i){
	return list.get(i);
}
public TimeBound findBound(Token token){
	for(TokenTime tt:list){
		if(tt.getToken()==token)
			return tt.getTime();
	}
	return null;
}
public List<TokenTime> getList(){
	return list;
}

public void unlockAll(){
	for(TokenTime tt:list)
		tt.unlock();
}

public void addAll(TokenTimeList addList){
	for(TokenTime tt:addList.getList()){
		list.add(tt);
	}
}

public boolean containsToken(Token newToken) {
	for(TokenTime tt:list){
		if(newToken==tt.getToken())
			return true;
	}
	return false;
}
	public TokenTime findByToken(Token t)
	{
		for(TokenTime tt:list)
		{
			if(tt.getToken()==t)
				return tt;
		}
		return null;
	}
 
}
