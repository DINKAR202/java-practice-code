public abstract class Bank {
    String name;


    abstract void readData();
    abstract void writeData();
}

class Admin extends Bank{
    void readData(){

    }

    void writeData(){

    }
}

class Marketing extends Bank{
    @Override
    void readData(){
        
    }
}
