package practice.People.CompanySalary;
    abstract class Employee {
        public abstract double earnings();
    }
    class YearWorker extends Employee {
        public double earnings() {
            return 12000;
        }
        //重写earnings()方法
    }
    class MonthWorker extends Employee {
        public double earnings() {
            return 12*2300 ;
        }
        //重写earnings()方法
    }
    class WeekWorker extends Employee {
        public double earnings() {
            return 52*780;
        }
        //重写earnings()方法。
    }
class DayWorker extends Employee {
    public double earnings() {
        return 100;
    }
    //重写earnings()方法
}
    class Company {
        Employee[] employee;
        double salaries = 0;
        Company(Employee[] employee) {
            this.employee = employee;
        }
        public double salariesPay() {
            salaries = 0;
            for (int i = 0; i < employee.length; i++) {
                salaries=salaries+employee[i].earnings();
            }
            return salaries;
        }
    }
    public class CompanySalary {
        public static void main(String args[]) {
            Employee [] employee=new Employee[29]; //公司有29名雇员
            for(int i=0;i<employee.length;i++) {   //雇员简单地分成三类
                if(i%4==0)
                    employee[i]=new DayWorker();
                else if(i%4==1)
                    employee[i]=new WeekWorker();
                else if(i%4==2)
                    employee[i]=new MonthWorker();
                else if(i%4==3)
                    employee[i]=new YearWorker();
            }
            Company company=new Company(employee);
            System.out.println("公司薪水总额:"+company.salariesPay()+"元");
        }
    }

