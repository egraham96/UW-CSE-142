/* Write a class HarvardLawyer to accompany the other law firm classes described in this chapter. 
Harvard lawyers are like normal lawyers, but they make 20% more money than a normal lawyer, they get 3 days more vacation, 
and they have to fill out four of the lawyer's forms to go on vacation. That is, the getVacationForm method should return "pinkpinkpinkpink". 
Make sure to interact with the superclass as appropriate. */


public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return (super.getSalary() * 0.2) + super.getSalary();
    }
    public int getVacationDays() {
        return super.getVacationDays() + 3; 
    } 
    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}