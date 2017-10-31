

public class Project{
    private String name;
    private String description;
    private Double initialCost;

    public Project(){}
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, Double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public Double getInitialCost(){
        return this.initialCost;
    }
    public String getPitch(){
        return "Project name " + this.name + " : " + this.description;
    }

}