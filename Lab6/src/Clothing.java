import java.util.*;

public class Clothing {
    private String type;
    private String material;
    private String size;

    public Clothing(String type, String material, String size) {
        this.type = type;
        this.material = material;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return Objects.equals(type, clothing.type) &&
                Objects.equals(material, clothing.material) &&
                Objects.equals(size, clothing.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, material, size);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Clothing shirt = new Clothing("Shirt", "Cotton", "Medium");
        Clothing pants = new Clothing("Pants", "Denim", "Large");
        Clothing hat = new Clothing("Hat", "Wool", "Small");

        // List
        List<Clothing> clothesList = new ArrayList<>();
        clothesList.add(shirt);
        clothesList.add(pants);
        clothesList.add(hat);
        clothesList.add(shirt);
        System.out.println("ArrayList: " + clothesList);

        // HashSet
        Set<Clothing> clothesSet = new HashSet<>(clothesList);
        System.out.println("HashSet: " + clothesSet);

        Collections.sort(clothesList, new Comparator<Clothing>() {
            @Override
            public int compare(Clothing c1, Clothing c2) {
                return c1.getSize().compareTo(c2.getSize());
            }
        });
        System.out.println("Sorted ArrayList: " + clothesList);

        // Tree
        TreeSet<Clothing> sortedClothesSet = new TreeSet<>(new Comparator<Clothing>() {
            @Override
            public int compare(Clothing c1, Clothing c2) {
                return c1.getSize().compareTo(c2.getSize());
            }
        });
        sortedClothesSet.addAll(clothesList);
        System.out.println("TreeSet: " + sortedClothesSet);

        // Map
        Map<String, Clothing> clothesMap = new HashMap<>();
        for (Clothing clothing : clothesList) {
            clothesMap.put(clothing.getType(), clothing);
        }
        System.out.println("HashMap: " + clothesMap);
    }
}
