package usergroupdemo.utils;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
// --- <<IS-END-IMPORTS>> ---

public final class string

{
	// ---( internal utility methods )---

	final static string _instance = new string();

	static string _newInstance() { return new string(); }

	static string _cast(Object o) { return (string)o; }

	// ---( server methods )---




	public static final void multiConcat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(multiConcat)>> ---
		// @sigtype java 3.5
		// [i] field:1:required inputList
		// [i] field:0:required separator
		// [o] field:0:required concatString
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String[]	inputList = IDataUtil.getStringArray( pipelineCursor, "inputList" );
			String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputList.length; i++) {
			sb.append(inputList[i]);
			if((i+1) < inputList.length)
				sb.append(separator);
		
		}
			
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "concatString", sb.toString() );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

