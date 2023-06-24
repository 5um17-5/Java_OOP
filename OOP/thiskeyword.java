package OOP;

public class thiskeyword {
	int variable = 5;
	
	void method (int variable)
    {
        //variable = 10;
        System.out.println ("Value of Instance variable: " + this.variable);
        System.out.println ("Value of Local variable: " + variable);
    }
    void method ()
    {
        int variable = 40;
        System.out.println ("Value of Instance variable: " + this.variable);
        System.out.println ("Value of Local variable: " + variable);
    }
}
