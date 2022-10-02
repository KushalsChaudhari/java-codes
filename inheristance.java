public class inheristance_demo {
    public static void main (String [] args)
    {
        child_class object=new child_class();
        int res_add=object.add(4,5);
        int res_sub= object.sub(7,4);

    System.out.println(res_add);
    System.out.println(res_sub);



    }
}

class parent_class
{
    int add(int num1,int num2)
    {
return num1+num2;
    }

}

class child_class extends parent_class
{
    int sub(int num1,int num2)
    {
        return num1-num2;
    }

}
