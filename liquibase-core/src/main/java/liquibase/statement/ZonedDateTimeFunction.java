package liquibase.statement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class ZonedDateTimeFunction {

	private static final String ofLocalizedDate = "ofLocalizedDate";  		//'Thursday, May 9, 2019 '
	private static final String ofLocalizedTime = "ofLocalizedTIME"; 		//'3:37 AM'
	private static final String ofLocalizedDateTime = "ofLocalizedDateTime";//'May 9, 2019 3:37:52 AM'
	private static final String BASICISODATE = "BASIC_ISO_DATE";  			//'20111203'
	private static final String ISOLOCALDATE = "ISO_LOCAL_DATE";			//'2019-05-09'
	private static final String ISOOFFSETDATE = "ISO_OFFSET_DATE";			//'2019-05-09Z'
	private static final String ISODATE = "ISO_DATE";						//'2019-05-09'
	private static final String ISOLOCALTIME = "ISO_LOCAL_TIME";			//'03:48:22.687'
	private static final String ISOOFFSETTIME = "ISO_OFFSET_TIME";			//'10:15:30+01:00'
	private static final String ISOTIME = "ISO_TIME";						//'03:48:22.691Z'
	private static final String ISOLOCALDATETIME = "ISO_LOCAL_DATE_TIME";	//'2019-05-09T03:48:22.691'
	private static final String ISOOFFSETDATETIME = "ISO_OFFSET_DATE_TIME";	//'2019-05-09T03:48:22.691Z'
	private static final String ISOZONEDDATETIME = "ISO_ZONED_DATE_TIME";	//'2019-05-09T03:48:22.692Z[Etc/UTC]'
	private static final String ISODATETIME = "ISO_DATE_TIME";				//'2019-05-09T03:48:22.692Z[Etc/UTC]'
	private static final String ISOORDINALDATE = "ISO_ORDINAL_DATE";		//'2019-129Z'
	private static final String ISOWEEKDATE = "ISO_WEEK_DATE";				//'2019-W19-4Z'
	private static final String ISOINSTANT = "ISO_INSTANT";					//'2019-05-09T03:48:22.694Z'
	private static final String RFC_1123_DATE_TIME = "RFC_1123_DATE_TIME";	//'Thu, 9 May 2019 03:48:22 GMT'
	protected LocalDate ld = LocalDate.now();
	protected LocalTime lt = LocalTime.now();
	protected LocalDateTime ldt = LocalDateTime.of(ld, lt);


	public String getDateTime(String datetimeParam) {

		if (datetimeParam.equalsIgnoreCase(BASICISODATE)) {
			return DateTimeFormatter.BASIC_ISO_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOLOCALDATE)) {
			return DateTimeFormatter.ISO_LOCAL_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOOFFSETDATE)) {
			return DateTimeFormatter.ISO_OFFSET_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISODATE)) {
			return DateTimeFormatter.ISO_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOLOCALTIME)) {
			return DateTimeFormatter.ISO_LOCAL_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOOFFSETTIME)) {
			return DateTimeFormatter.ISO_OFFSET_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOTIME)) {
			return DateTimeFormatter.ISO_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOLOCALDATETIME)) {
			return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOOFFSETDATETIME)) {
			return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOZONEDDATETIME)) {
			return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISODATETIME)) {
			return DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOORDINALDATE)) {
			return DateTimeFormatter.ISO_ORDINAL_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOWEEKDATE)) {
			return DateTimeFormatter.ISO_WEEK_DATE.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ISOINSTANT)) {
			return DateTimeFormatter.ISO_INSTANT.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(RFC_1123_DATE_TIME)) {
			return DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now());
		} else if (datetimeParam.equalsIgnoreCase(ofLocalizedTime)){
			return DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt);
		} else if (datetimeParam.equalsIgnoreCase(ofLocalizedDateTime)){
			return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
		} else if (datetimeParam.equalsIgnoreCase(ofLocalizedDate)){
			return DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(ld);
		} else {
			return ZonedDateTime.now().toInstant().toString();
		}
	}
}

/*
    System.out.println("Short  Date: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(ld));  			//Short  Date: 5/9/19
    System.out.println("Long  Date: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(ld));				//Long  Date: May 9, 2019
    System.out.println("Full  Date: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(ld));				//Full  Date: Thursday, May 9, 2019     	-- used
    System.out.println("Short Time:  " + DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt));				//Short Time:  3:37 AM     					-- used
    System.out.println("Short  Datetime: " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(ldt));		//Short  Datetime: 5/9/19 3:37 AM
    System.out.println("Medium Datetime: " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt));	//Medium Datetime: May 9, 2019 3:37:52 AM 	-- used
*/



