public class LibrarySystemAdapter implements SchoolManagementApp
{
    private LibrarySystem librarySys;

    public LibrarySystemAdapter(LibrarySystem librarySys)
    {
        this.librarySys = librarySys;
    }

    public String manageBooks()
    {
        return librarySys.manageBooks();
    }

    @Override
    public String integrateSystem() {
        return librarySys.manageBooks();
    }
}