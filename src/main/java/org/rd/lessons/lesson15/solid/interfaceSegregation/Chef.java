package org.rd.lessons.lesson15.solid.interfaceSegregation;

class Chef implements Worker, Eater
{
    public void work()
    {
        System.out.println("Chef is working.");
    }

    public void eat()
    {
        System.out.println("Chef is eating.");
    }
}


/*
Bu örnekte, Worker arayüzü çalışanları temsil ederken,
Eater arayüzü yemek yiyenleri temsil eder.
Engineer sınıfı yalnızca çalışanların işlevini yerine getirirken,
Chef sınıfı hem çalışan hem de yemek yiyen rollerini üstlenir.
Böylece, her sınıf sadece ihtiyaç duyduğu metotları uygular.
 */