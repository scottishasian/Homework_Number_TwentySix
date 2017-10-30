class Bus {
  private String name;
  private Passengers[] chairs;

  public Bus(String name, int seats ){
    this.name = name;
    this.chairs = new Passengers[seats];
  }

  public String getName() {
    return this.name;
  }

  public int seatCount() {
    return chairs.length;
  }

}
