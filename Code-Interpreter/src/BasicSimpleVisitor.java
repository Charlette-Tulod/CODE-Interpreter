import java.util.HashMap;

public class BasicSimpleVisitor extends SimpleBaseVisitor<Object>{

    private HashMap<String, Object> variables = new HashMap<>();
    
    @Override
    public Object visitAssignment(SimpleParser.AssignmentContext ctx) {
        // TODO Auto-generated method stub
        // String dataType = ctx.DATATYPE().getText();
        // String identifier = ctx.IDENTIFIER().getText();
        // String expression = ctx.EXPRESSION().getText();

        String dataType = ctx.getChild(0).getText();  
        String identifier = ctx.getChild(1).getText();
        String expression = ctx.getChild(3).getText();

        //getChild(2) is the operation
        //checks if the data type really does containe valid values
        if(dataType.equals("INT")){

            try{
                Integer.parseInt(expression);
            }catch(Exception e){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a integer");
            }

        }else if(dataType.equals("FLOAT")){

            try{
                Float.parseFloat(expression);
            }catch(NumberFormatException e){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a floating point");
            }

        }else if(dataType.equals("CHAR")){

            if(expression.length() != 3 || expression.charAt(0) != '\'' || expression.charAt(2) != '\''){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a character");
            }
            
        }else if(dataType.equals("STRING")){

            if(expression.length() < 2 || expression.charAt(0) != '\"' || expression.charAt(expression.length()-1) != '\"'){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a string");
            }

        }else if(dataType.equals("BOOL")){

            if(!expression.equals("TRUE") && !expression.equals("FALSE")){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a boolean");
            }

        }

        //Checks if the variable name already exists
        if(!variables.containsKey(identifier)){
            variables.put(identifier, expression);
        }else{
            System.err.println("Error: Variable " + identifier + " already exists.");
        }

        return null;
    }
    

}