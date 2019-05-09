package liquibase.statement.core;

@FunctionalInterface
public interface CurrentTimeFunction {
	String getTime();
}