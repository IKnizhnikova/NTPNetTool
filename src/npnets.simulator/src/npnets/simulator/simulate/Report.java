package npnets.simulator.simulate;

import java.util.ArrayList;
import java.util.List;

public class Report {
	private List<String> report=new ArrayList<String>();
	private static List<String> log=new ArrayList<String>();
	private int index=-1;
	private static int logIndex=-1;
	
	public void appendToReport(String message){
		if(index>=0)
			report.get(index).concat(message);
		else{
			appendLineToReport(message);
		}
	}
	public void appendLineToReport(String message){
		report.add(message);
		index++;
	}
	public void appendLineToReport(String message,boolean toLog){
		if(toLog){
			log.add(message);
			logIndex++;
			System.out.println(getLastLogLine()+"\n");
		}
		report.add(message);
		index++;
	}
	public void clearReport(){
		report.clear();
	}
	public void removeLastLine(){
		report.remove(index);
	}
	public String getReportText(){
		String res="";
		for(String str:report){
			res+=str+"\n";
		}
		return res;
	}
	public List<String> getLog(){
		return log;
	}
	public String getLogText(){
		String res="";
		for(String str:log){
			res+=str+"\n";
		}
		return res;
	}
	public List<String> getReport(){
		return report;
	}
	public String getLastLine(){
		return report.get(index);
	}
	public String getLastLogLine(){
		return log.get(log.size()-1);
	}
	public void printLastLine(){
		System.out.println(getLastLine());
	}
	public void putToLog(){
		log.addAll(report);
		logIndex+=index+1;
		System.out.println(getReportText());
	}
	
}
