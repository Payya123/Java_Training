package inheritance;

public class branch_Office extends Office {

    public  branch_Office()
    {
        System.out.println("welcome to branch_office");
    }
    public static void main(String[] args) {
        branch_Office bff=new branch_Office();
        bff.work();
        bff.wfm();
        bff.recuit();
        System.out.println(bff.salary);
    }
    public void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
}
