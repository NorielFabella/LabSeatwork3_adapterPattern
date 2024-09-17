public class GradingSystemAdapter implements SchoolManagementApp
{
    private GradingSystem gradeSys;

    public GradingSystemAdapter(GradingSystem gradeSys)
    {
        this.gradeSys = gradeSys;
    }

    public String recordGrades()
    {
        return gradeSys.recordGrades();
    }

    @Override
    public String integrateSystem() {
        return gradeSys.recordGrades();
    }
}