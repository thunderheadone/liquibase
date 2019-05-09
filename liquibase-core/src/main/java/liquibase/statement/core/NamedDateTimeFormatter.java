package liquibase.statement.core;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.stream.Stream;

public enum NamedDateTimeFormatter implements CurrentTimeFunction {
	ISO_LOCAL_DATE("ISO_LOCAL_DATE", DateTimeFormatter.ISO_LOCAL_DATE);

	private final String name;
	private final DateTimeFormatter formatter;

	NamedDateTimeFormatter(String name, DateTimeFormatter formatter) {
		this.name = name;
		this.formatter = formatter;
	}

	static CurrentTimeFunction byNameOrPattern(String nameOrPattern) {
		return Stream.of(NamedDateTimeFormatter.values())
				.filter(ndtf -> Objects.equals(ndtf.getName(), nameOrPattern))
				.findFirst()
				.map(CurrentTimeFunction.class::cast)
				.orElse(() -> DateTimeFormatter.ofPattern(nameOrPattern).format(ZonedDateTime.now()));
	}

	public String getName() {
		return name;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	@Override
	public String getTime() {
		return formatter.format(ZonedDateTime.now());
	}


}
