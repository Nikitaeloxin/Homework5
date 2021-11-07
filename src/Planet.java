public class Planet {
    private String name;
    private double gravity;
    
    Planet(String n,double g){
        name = n;
        gravity = g;
    }

    Planet changeValue(String n,double g){
        name = n;
        gravity = g;
        return this;
    }

    double exchengeGrav(double weight){
        return weight*gravity;
    }

    String getName(){return name;}
}
