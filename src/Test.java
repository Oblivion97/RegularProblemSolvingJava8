public class Test {
    private String DesignationCode;
    private String DesignationName;
    private String ShortFormOfDesignation;
    private String ProgramType;
    private String Description;
    private String JobAuthority;
    private String JobResponsibility;
    private String JobSummary;
    private String RequiredSkillSet;

    public String getDesignationCode() {
        return DesignationCode;
    }

    public void setDesignationCode(String designationCode) {
        DesignationCode = designationCode;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String designationName) {
        DesignationName = designationName;
    }

    public String getShortFormOfDesignation() {
        return ShortFormOfDesignation;
    }

    public void setShortFormOfDesignation(String shortFormOfDesignation) {
        ShortFormOfDesignation = shortFormOfDesignation;
    }

    public String getProgramType() {
        return ProgramType;
    }

    public void setProgramType(String programType) {
        ProgramType = programType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getJobAuthority() {
        return JobAuthority;
    }

    public void setJobAuthority(String jobAuthority) {
        JobAuthority = jobAuthority;
    }

    public String getJobResponsibility() {
        return JobResponsibility;
    }

    public void setJobResponsibility(String jobResponsibility) {
        JobResponsibility = jobResponsibility;
    }

    public String getJobSummary() {
        return JobSummary;
    }

    public void setJobSummary(String jobSummary) {
        JobSummary = jobSummary;
    }

    public String getRequiredSkillSet() {
        return RequiredSkillSet;
    }

    public void setRequiredSkillSet(String requiredSkillSet) {
        RequiredSkillSet = requiredSkillSet;
    }
    @Override
    public String toString() {
        return "Test{" +
                "DesignationCode='" + DesignationCode + '\'' +
                ", DesignationName='" + DesignationName + '\'' +
                ", ShortFormOfDesignation='" + ShortFormOfDesignation + '\'' +
                ", ProgramType='" + ProgramType + '\'' +
                ", Description='" + Description + '\'' +
                ", JobAuthority='" + JobAuthority + '\'' +
                ", JobResponsibility='" + JobResponsibility + '\'' +
                ", JobSummary='" + JobSummary + '\'' +
                ", RequiredSkillSet='" + RequiredSkillSet + '\'' +
                '}';
    }
}
