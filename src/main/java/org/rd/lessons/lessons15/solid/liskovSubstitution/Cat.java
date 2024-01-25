package org.rd.lessons.lessons15.solid.liskovSubstitution;

class Cat extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("cat is miaving.");
    }
}

/*
Bu örnekte, Animal sınıfı bir hayvanın sesini çıkarmak için bir MakeSound metodu sağlar.
Dog ve Cat sınıfları bu metodu override ederek kendi seslerini çıkarmak için kullanır.
Bu sayede, Animal tipinde bir nesne beklenen herhangi bir yerde,
Dog veya Cat nesneleri kullanılabilir.
 */