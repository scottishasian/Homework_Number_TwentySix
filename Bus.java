class Bus {
  private String name;
  private Passengers[] people;

  public Bus(String name, int seats ){
    this.name = name;
    this.people = new Passengers[seats];
  }

  public String getName() {
    return this.name;
  }

}
