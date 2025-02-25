package usergroupdemo.utils;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalTime;
// --- <<IS-END-IMPORTS>> ---

public final class date

{
	// ---( internal utility methods )---

	final static date _instance = new date();

	static date _newInstance() { return new date(); }

	static date _cast(Object o) { return (date)o; }

	// ---( server methods )---




	public static final void getDayOfWeek (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getDayOfWeek)>> ---
		// @sigtype java 3.5
		// [o] field:0:required dayOfWeek
    // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        IDataCursor pipelineCursor = pipeline.getCursor();
        IDataUtil.put( pipelineCursor, "dayOfWeek", dayOfWeek.toString());
        pipelineCursor.destroy();


        // Print the day of the week
    
	
		// --- <<IS-END>> ---

                
	}



	public static final void getPartOfDay (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getPartOfDay)>> ---
		// @sigtype java 3.5
		// [o] field:0:required partOfDay
		LocalTime currentTime = LocalTime.now();
		
		// Determine the part of the day
		String partOfDay;
		if (currentTime.isBefore(LocalTime.NOON)) {
		    partOfDay = "Morning";
		} else if (currentTime.isBefore(LocalTime.of(17, 0))) {
		    partOfDay = "Afternoon";
		} else {
		    partOfDay = "Evening";
		}
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "partOfDay", partOfDay );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

