package com.company;


public class quadratic {
    private double _A;
    private double _B;
    private double _C;


    public quadratic(double a, double b, double c) {
        _A = a;
        _B = b;
        _C = c;

    }

    public String directionOfOpening (){
        if (_A > 0){
            String direction = "The Quadratic is opening up";
            System.out.println(direction);
            return direction;
        }
        if (_A < 0){
            String direction = "The Quadratic is opening down";
            System.out.println(direction);
            return direction;
        }
        else{
            String direction = "false";
            System.out.println(direction);
            return direction;
        }
    }

    public double vertex(){
        double vertexBeforeSign = _B/_A*2;
        double finalVertex = vertexBeforeSign*-1;
        System.out.println("The Vertex of this quadratic is: "+finalVertex);
        return finalVertex;

    }

    public double yIntercept (){
       double yIntercept = _C;
        System.out.println("The Y-Intercept of this quadratic is: "+yIntercept);
        return yIntercept;

    }

    public String vertexForm(){
        double xVertex = _B/2 * _A;
        double yVertex = (_A * xVertex * xVertex) + (_B * xVertex) + _C;
        //String formTest = "";
        String vertexForm = String.format(_A+" ( x %+f )  %+f",  xVertex, yVertex);
        System.out.println(vertexForm);
        //String vertexForm = _A+"(x+"+xVertex+")+"+yVertex; //work out negatives and pluses
        return vertexForm;
    }


    public double[] zeros(){

        double xZero = (_B/2*_A)*-1;
        double yZero = _C;
        double Zeros[] = new double[2];
        Zeros[0] = xZero;
        Zeros[1] = yZero;
        System.out.println("The zero's of this Quadratic are "+xZero+" and "+yZero+ ".");
        return Zeros; //need to also return y zero
    }
}
