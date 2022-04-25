public class Main
{
    public static void main(String[] args)
    {
        Employee calisan=new Employee("Kemal",2000.0,45,1985);
        calisan.toString(calisan);

    }
    public static class Employee
    {
        public String name;
        public double salary;
        public int workHours;
        public int hireYear;

        public Employee(String name, double salary, int workHours,int hireYear)
        {
            this.name=name;
            this.salary=salary;
            this.workHours=workHours;
            this.hireYear=hireYear;
        }

        public double tax()
        {
            double vergi=0;
            if (salary<1000){
                vergi=0;

            }
            else if(salary>1000) {
                vergi = salary * 0.03;

            }
            return vergi;
        }

        public double bonus()
        {
            double bonus = 0;
            if (workHours>40)
                bonus=(workHours-40)*30;
            return bonus;
        }
        public double raiseSalary()
        {
            double maas_artisi=0;
            if (2021-hireYear<10)
                maas_artisi=(salary*0.05);
            else if (2021-hireYear>9 && 2021-hireYear<20)
                maas_artisi=(salary*0.10);
            else if (2021-hireYear>19)
                maas_artisi=(salary*0.15);
            return maas_artisi;
        }
        public void toString(Employee employee)
        {
            System.out.println("Adı: "+ employee.name);
            System.out.println("Maaşı: "+ employee.salary);
            System.out.println("Çalışma Saati: "+employee.workHours);
            System.out.println("Başlangıç Yılı: "+ employee.hireYear);
            System.out.println("Vergi "+ employee.tax());
            System.out.println("Bonus: "+ employee.bonus());
            System.out.println("Maaş Artışı: "+employee.raiseSalary());
            double a=employee.salary-employee.tax()+ employee.bonus();
            System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+ a);
            double b=employee.salary-employee.tax()+employee.bonus()+ employee.raiseSalary();
            System.out.println("Toplam Maaş: "+ b);
        }
    }
}
