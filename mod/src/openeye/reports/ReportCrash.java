package openeye.reports;

import java.util.Collection;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ReportCrash implements IReport {

	public static class StackTrace {
		@SerializedName("class")
		public String className;

		@SerializedName("method")
		public String methodName;

		@SerializedName("file")
		public String fileName;

		@SerializedName("line")
		public int lineNumber;

		@SerializedName("signatures")
		public Collection<String> signatures;
	}

	@SerializedName("stack")
	public List<StackTrace> stackTrace;

	@SerializedName("exception")
	public String exceptionCls;

	@SerializedName("message")
	public String message;

	@SerializedName("timestamp")
	public long timestamp;
}
