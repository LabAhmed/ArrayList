public class Smartphone implements Comparable<Smartphone>{

    private String brand = "";
    private String model = "";
    private int storageCapacity = 0;
    private double price = 0.0;

    public Smartphone() {   }

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    public Smartphone(Smartphone other) {
        if (other != null) {
            this.brand = other.brand;
            this.model = other.model;
            this.storageCapacity = other.storageCapacity;
            this.price = other.price;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Storage Capacity: " + storageCapacity + "GB, Price: "+ price;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ugualianza = true;
        if (this != obj) {
            if (obj instanceof Smartphone) {
                Smartphone other = (Smartphone) obj;
                if (!(this.brand.equals(other.brand) && this.model.equals(other.model)
                        && this.storageCapacity == other.storageCapacity && this.price == other.price)) {
                    ugualianza = false;
                }
            } else {
                ugualianza = false;
            }
        }
        return ugualianza;
    }

    public int compareTo(Smartphone s){       
        int result = 0;
        if(this.price < s.price){
            result = -1;
        }else if (this.price > s.price) {
            result = 1;
        }
        return result;
    }

}
