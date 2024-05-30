import java.util.ArrayList;

public class MagazzinoSmartphone {
    private ArrayList<Smartphone> smartphones = new ArrayList<>();

    public MagazzinoSmartphone() {
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        this.smartphones = (ArrayList<Smartphone>) other.smartphones.clone();
    }

    public void addSmartphone(Smartphone smartphone) {
        if (smartphone != null) {
            smartphones.add(new Smartphone(smartphone));
        }
    }

    public void removeSmartphone(Smartphone smartphone) {
        smartphones.remove(smartphone);
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[smartphones.size()];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, smartphones.size());
        return smartphoneArray;
    }

    public Smartphone getSmartphoneByBrand(String brand) {
        int i = 0;
        boolean trovato = false;
        while (i < smartphones.size() && trovato == false) {
            if (smartphones.get(i).getBrand().equalsIgnoreCase(brand)) {
                trovato = true;
            } else {
                i++;
            }
        }
        return smartphones.get(i);
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (int i = 0; i < smartphones.size(); i++) {
            if (smartphones.get(i).getStorageCapacity() == storageCapacity) {
                magazzinoSmartphone.addSmartphone(new Smartphone(smartphones.get(i)));
            }
        }
        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        for (int i = 0; i < smartphones.size(); i++) {
            if (smartphones.get(i).getPrice() <= maxPrice && smartphones.get(i).getPrice() >= minPrice) {
                magazzinoSmartphone.addSmartphone(new Smartphone(smartphones.get(i)));
            }
        }
        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (int i = 0; i < smartphones.size(); i++) {
            result += smartphones.get(i) + "\n";
        }
        return result;
    }

    public int getCount() {
        return smartphones.size();
    }

    public boolean equals(Object obj) {
        boolean verifica = false;
        if(this == obj)
         verifica = true;
        else{
         if( obj instanceof MagazzinoSmartphone){
             MagazzinoSmartphone m = (MagazzinoSmartphone)obj;
             if(m.smartphones.size() == this.smartphones.size()){
                 if(this.smartphones.containsAll(m.smartphones))
                     verifica=true;
             }
         }
        }
 
         return verifica;
     }
 
 }


