public class Fish implements Pet{
    String name;
    public Fish(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play(){
        String fish = "Fish playing";
    }
    public void walk() throws Exception{
        String hh = "Fish can't walk";
    }
    public void eat(){
        String oo = "Fish eating";
    }
}
