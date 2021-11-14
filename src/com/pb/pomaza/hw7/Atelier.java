package com.pb.pomaza.hw7;

public class Atelier{
    public void dressMale(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}

