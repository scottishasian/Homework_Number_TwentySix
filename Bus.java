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
    if(busIsFull()){
      return;
    }
    int seatsLeft = passengerCount();
    passengers[seatsLeft]= person;
  }

  public boolean busIsFull() {
    return passengerCount() == passengers.length;
    // System.out.println("The bus is full!");
    }

  /* Adding a bus stop. If bus interacts with a bus stop,
    if passengerCount == 10 and busStop   -- if the bus is full and the bus stop is true.
      for(int i =0; i < passengers.length; i++) {
        passengers[i] = null;
    }else if {passengerCount == 0 and busStop -- if the bus is empty and the bus top is full.
      addPassenger();
    } */
}
