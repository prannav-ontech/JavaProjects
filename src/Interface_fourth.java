interface member
{
void callback();
}


class store {
    member[] mem = new member[100]; // i created array type as member because it means that it is a usewr defined data type
    int count = 0;                //  by which i want that when ever a new user is entered all the features of MEMBER interface will be used....

    void register(member m) {mem[count] = m;
        count++;
    }

    void inviteSale() {
        for (int i = 0 ; i<count ;i++)
        {
            mem[i].callback();


        }
    }
}

class customer implements member
{
    String name ;
    customer (String name)
    {
        this.name = name;
    }

    public void callback()
    {
        System.out.println("Hello " + name + "Diwali sale has started !! You  should visit the store....");
    }

}



public class Interface_fourth
{
    public static void main (String []args)
        {
          store s = new store();
          customer c1 = new customer("Raj");
          customer c2 = new customer("Amit");

          s.register(c1);
          s.register(c2);

          s.inviteSale();
        }
}
