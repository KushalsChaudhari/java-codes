//not understand 

class Main {

    public static void main(String[] args) {
        cal obj = new cal();                          //object of 1st class

        adv_cal object=new adv_cal();                  //obbject of 2nd class
        // obj.num1 = 4;
        // obj.num2 = 5;
        // obj.num3 = 7;
        int res_add = obj.add(4,5);                      //fn call with object
        int res_add_overload = obj.add(4,5,6);
        int res_sub = obj.sub(7,8);
        int res_mul = obj.mul(9,9);

        int res_adv_cal_add=object.add(3,7);

        System.out.println(res_add);
        System.out.println(res_add_overload);
        System.out.println(res_sub);
        System.out.println(res_mul);

        System.out.println(res_adv_cal_add);

        
    }

}



class cal {
    // int num1, num2,num3,res;      //field

    // cal (int p,int q)        //constructor
    // {
    // num1=p;
    // num2=q;
    // }
    int add(int num1,int num2) {
        int res;
        res = num1 + num2;
        return res;
    }

    int add(int num1,int num2,int num3) //overload fn
    {
        int res;
        res = num1 + num2 + num3;
        return res;
    }

    int sub(int num1,int num2) {
        int res;
        res = num2 - num1;
        return res;
    }

    int mul(int num1,int num2) {
        int res;
        res = num1 * num2;
        return res;
    }
}

class adv_cal
{
    int add(int num1,int num2)           //override fn
    {
        int res;
        res=num1+num2;
        return res;
    }
}
