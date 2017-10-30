class Bus {
  private String name;
  private Person[] passengers;

  public Bus(String name, int seats ){
    this.name = name;
    this.passengers = new Person[seats];
  }

  public String getName() {
    return this.name;
  }

  public int passengerCount() {
    int count = 0;
    for(Person person : passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person person) {
    int seatsLeft = passengerCount();
    passengers[seatsLeft]= person;
  }

}
