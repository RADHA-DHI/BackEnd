public class Operators{
    public static void main(String[] args)
    {
        //Arithmetic operator
        int num1=80;
        int num2=5;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        //Adding 5 numbers sum & Average
        int Tamil=94;
        int Eng=91;
        int Maths=96;
        int Sci=96;
        int Social=94;
        int Total=Tamil+Eng+Maths+Sci+Social;
        float Avg=Total/5;
        System.out.println(Total);
        System.err.println(Avg);

        //Celcius to Faranheit
        int C = 40;
        int F = (C * 9 / 5) + 32;
        System.out.println(F);

        //Area of Circle
        int Radius = 5;
        float Area = (float)(3.14 *  Radius * Radius);
        System.out.println(Area);

       // Area of Triangle - b*h/2
        int B = 10;
        int H = 20;
        float TArea = (float) (B * H) / 2;
        System.out.println(TArea);

        //Area of Rectangle - l*b
        int Length=6;
        int Breadth=4;
        int RArea=Length*Breadth;
        System.out.println(RArea);

        //Area of Square
        int Side = 5;
        int SArea = Side * Side;
        System.out.println(SArea);

        // Ass.Opr - +=,-=,*=,%=,/=
        int a = 10;
        int b = 2;
        a += b;
        //a=a+b;
        b += a;
        //b=b+a;
        System.out.println(a);
        System.out.println(b);

        a -= b;
        a*=b;
        a%=b;
        a/=b;
        System.out.println(a);
        System.out.println(b);

        int x=5;
        int y=10;
        int z=x+y;
        System.out.println(z);
        System.out.println(x+y);

        //Relational Operator- >,>=,<,<=,==,!=
        int a1=10;
        int b1=20;
        boolean check =a1 == b1;
        System.out.println(check);
        System.out.println(a1 == b1);
        System.out.println(a1!=b1);
        System.out.println(a1>b1);
        System.out.println(a1>=b1);
        System.out.println(a1<b1);
        System.out.println(a1<=b1);

        //Logical Operator - && , || ,!
        int a2=5;
        int b2=5;
        System.out.println(a2==b2 && a2<=b2 && a2>=b2);
        System.out.println(a2<=b2 || a2>=b2);
        System.out.println(!(a==b));


        //Inc& Dec Operator 

        int n=10;
        int ans=n++;
        System.out.println(n);
        System.out.println(ans);
    }
}