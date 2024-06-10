/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author nazar
 */

public class Clothing {
    private String type;
    private Material material;
    private Size size;

    public class Material {
        private String name;

        public Material(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Size {
        private String size;

        public Size(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }
    }

    public Clothing(String type, Material material, Size size) {
        this.type = type;
        this.material = material;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    public static void main(String[] args) {
        Material material = new Clothing("Shirt", new Clothing("Shirt", null, null).new Material("Cotton"), null).new Material("Cotton");
        Size size = new Clothing("Shirt", null, new Clothing("Shirt", null, null).new Size("Medium")).new Size("Medium");

        System.out.println("Clothing Type: " + new Clothing("Shirt", material, size).getType());
        System.out.println("Material: " + material.getName());
        System.out.println("Size: " + size.getSize());

        class Color {
            private String color;

            public Color(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }
        }

        Color color = new Color("Blue");
        System.out.println("Color: " + color.getColor());
    }
}


