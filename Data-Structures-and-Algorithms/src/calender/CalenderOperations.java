package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class CalenderOperations {
	
	public void loopBetweenDates(Date startDate,Date endDate){
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);

		Calendar end = Calendar.getInstance();
		end.setTime(endDate);
		while( !start.after(end)){
		    Date targetDay = start.getTime();
		    // Do Work Here
		    start.add(Calendar.DATE, 1);
		}
	}
	
	public Date readDate(String s){
		StringTokenizer st = new StringTokenizer(s);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date = formatter.parse(st.nextToken()+"-"+st.nextToken()+"-"+st.nextToken());
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
