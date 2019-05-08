package liquibase.statement;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeFunction {


	private static final String Current_DT_WithZone = "Current_DateTime_WithZone";
	private static final String LocalDT = "LocalDateTime";
	private static final String LocalDate = "Local_Date";
	private static final String LocalTime = "Local_Time";
	private static final String OffsetDT = "Offset_DateTime";
	private static final String InstantDT = "Instant_DateTime";

	public String getDateTime(String datetimeParam) {

		if (datetimeParam.equalsIgnoreCase(Current_DT_WithZone)) {
			return ZonedDateTime.now().toString();
		} else if (datetimeParam.equalsIgnoreCase(LocalDT)) {
			return ZonedDateTime.now().toLocalDateTime().toString();
		} else if (datetimeParam.equalsIgnoreCase(LocalDate)) {
			return ZonedDateTime.now().toLocalDate().toString();
		} else if (datetimeParam.equalsIgnoreCase(LocalTime)) {
			return ZonedDateTime.now().toLocalTime().toString();
		} else if (datetimeParam.equalsIgnoreCase(OffsetDT)) {
			return ZonedDateTime.now().toOffsetDateTime().toString();
		} else {
			return ZonedDateTime.now().toInstant().toString();
		}


	}

}

