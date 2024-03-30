public class A7 
{
    public static void main(String[] args)
    {
        String expression = args[0];
        String[] tokens = expression.split("");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i+=2) 
        {
            String operator = tokens[i];
            double value = Double.parseDouble(tokens[i+1]);
            switch (operator) 
            {
                case "+":
                    result += value;
                    break;
                case "-":
                    result -= value;
                    break;
                case "*":
                    result *= value;
                    break;
                case "/":
                    result /= value;
                    break;            
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }
        System.out.println(result);
    }    
}