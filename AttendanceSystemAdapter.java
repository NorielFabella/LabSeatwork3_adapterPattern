public class AttendanceSystemAdapter implements SchoolManagementApp
{
    private AttendanceSystem attendSys;

    public AttendanceSystemAdapter(AttendanceSystem attendSys)
    {
        this.attendSys = attendSys;
    }

    public String markAttendance()
    {
        return attendSys.markAttendance();
    }

    @Override
    public String integrateSystem() {
        return attendSys.markAttendance();
    }
}