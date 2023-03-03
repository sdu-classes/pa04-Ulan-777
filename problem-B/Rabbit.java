class Cat extends Animal implements Pet {
    String name;

    protected Cat(int legs) {
        super(legs);
    }
    public void Cat(String name) {
        this.name = name;
    }
    public void walk(){
    String adf = "Cat walking";
    }
@Override
    public void setName(String name) {
     this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override

    public void play() {
        String caty = "Cat playing";
    }
    @Override

    public void eat() {
        String caty = "Cat eating";
    }
}
