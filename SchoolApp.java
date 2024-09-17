public class SchoolApp
{
    public static void main(String[] args)
    {
        AttendanceSystem attendSys = new AttendanceSystem();
        SchoolManagementApp attendSysApp = new AttendanceSystemAdapter(attendSys);

        GradingSystem gradeSys = new GradingSystem();
        SchoolManagementApp gradeSysApp = new GradingSystemAdapter(gradeSys);

        LibrarySystem librarySys = new LibrarySystem();
        SchoolManagementApp librarySysApp = new LibrarySystemAdapter(librarySys);

        System.out.println("Attendance System: " + attendSysApp.integrateSystem());
        System.out.println("Grading System: " + gradeSysApp.integrateSystem());
        System.out.println("Library System: " + librarySysApp.integrateSystem());

    }
}
