package org.NextGeTechSchool.NextGen.Tech.School.Model;



import lombok.Data;

@Data
public class Holiday {
	private final String day;
    private final String reason;
    private final Type type;

    public String getDay() {
		return day;
	}

	public String getReason() {
		return reason;
	}

	public Holiday(String day, String reason, Type type) {
		super();
		this.day = day;
		this.reason = reason;
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
