package com.pb.pomaza.hw7;


    public class Start {
        public static void main(String[] args) {
            Clothes[] clothes = {
                    new TeeShirt(Sizes.XS, "темно-серый", 450),
                    new TeeShirt(Sizes.L, "черный", 150),
                    new Trousers(Sizes.M, "голубой", 600),
                    new Trousers(Sizes.XXS, "синий", 305),
                    new Skirt(Sizes.S, "розовый", 100),
                    new Skirt(Sizes.M, "красный", 200),

            };

            Atelier studio = new Atelier();
            studio.dressMale(clothes);
            System.out.println();
            studio.dressFemale(clothes);
        }
    }
