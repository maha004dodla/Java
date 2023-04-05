import java.util.*;
class account
{
    String accno,cname;
    double bal;
    public account(String accno,String cname,double bal)
    {
        this.accno=accno;
        this.cname=cname;
        this.bal=bal;
    }
    public String getaccno()
    {
        return accno;
    }
    public double getbal()
    {
        return bal;
    }
    public void displayaccount()
    {
        System.out.println("accno is: "+accno+" and customer name is: "+cname);
        System.out.println("balance amount is:"+bal);
    }
}
class bank
{
    static String bname="state bank";
    account customer[]=new account[10];
    int i=0;
    public void addcustomer(account a)
    {
        customer[i]=a;
        i++;
    }
    public void deposit(String accno,double amt)
    {
        int j;
        for(j=0; j<i; j++)
        {
            if(accno.equals(customer[j].getaccno()))
            {
                customer[j].bal=customer[j].bal+amt;
                break;   
            }
        }
        if(i==j)
        {
            System.out.println("invalid acc number\n");
        }
    }
    public void withdraw(String accno,double amt)
    {
        int j;
        for(j=0; j<i; j++)
        {
            if(accno.equals(customer[j].getaccno()))
            {
                customer[j].bal=customer[j].bal-amt;
                break;   
            }
        }
        if(i==j)
        {
            System.out.println("invalid acc number\n");
        }
        if(customer[j].bal<amt)
        {
            System.out.println("invalid money");
        }

    }
    public void transfer(String sen_accno,String rec_accno,double amt)
    {
        int j,p=-1,q=-1;
        for(j=0; j<i; j++)
        {
            if(sen_accno.equals(customer[j].getaccno()))
            {
                p=j;
                break;
            }
        }
        for(j=0; j<i; j++)
        {
            if(rec_accno.equals(customer[j].getaccno()))
            {
                q=j;
                break;
            }
        }
        if(p!=-1 && q!=-1)
        {
            customer[p].bal=customer[p].bal-amt;
            customer[q].bal=customer[q].bal+amt;
        }
        else
        {
            System.out.println("invalid account details");
        }
    }
    public void display(String accno)
    {
        int j;
        for(j=0; j<i; j++)
        {
            if(accno.equals(customer[j].getaccno()))
            {
                customer[j].displayaccount();
                break;
            }
        }
    }
    public void delete_customer(String accno)
    {
        int j,k=0;
        for(j=0; j<i; j++)
        {
            if(accno.equals(customer[j].getaccno()))
            {
                customer[k++]=customer[j];
            }
        }
        i=k;
    }
    public void list_customers()
    {
        int j;
        for(j=0; j<i; j++)
        {
            customer[j].displayaccount();
        }
    }
    public static void main(String args[])
    {
        account a;
        bank b=new bank();
        Scanner sc=new Scanner(System.in);
        String accno,cname,rec_accno;
        int ch;
        double amt;
        while(true)
        {
            System.out.println("1.add account\n2.deposit\n3.withdraw\n4.transfer\n5.display\n6.delete customer\n7.list customers\n8.exit\n");
            System.out.println("enter your choice");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    accno=sc.nextLine();
                    cname=sc.nextLine();
                    amt=sc.nextDouble();
                    sc.nextLine();
                    a=new account(accno,cname,amt);
                    b.addcustomer(a);
                    break;
                case 2:
                    accno=sc.nextLine();
                    amt=sc.nextDouble();
                    sc.nextLine();
                    b.deposit(accno,amt);
                    break;
                case 3:
                    accno=sc.nextLine();
                    amt=sc.nextDouble();
                    //sc.nextLine();
                    b.withdraw(accno,amt);
                    break;
                case 4:
                    accno=sc.nextLine();
                    rec_accno=sc.nextLine();
                    amt=sc.nextInt();
                    b.transfer(accno,rec_accno,amt);
                    break;
                case 5:
                    accno=sc.nextLine();
                    b.display(accno);
                    break;
                case 6:
                    accno=sc.nextLine();
                    b.delete_customer(accno);
                case 7:
                    b.list_customers();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}