package org.rd.lessons.lesson15.solid.openClosed;

class Circle implements Shape
{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double radius;

    public double Area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
}

/*
Bu örnekte, Shape arayüzü herhangi bir şeklin alanını hesaplamak için kullanılır.
Rectangle ve Circle sınıfları bu arayüzü uygulayarak kendi alan hesaplama yöntemlerini sağlar.
Eğer yeni bir şekil eklemek istenirse, sadece Shape arayüzünü uygulayan yeni bir sınıf oluşturmak yeterlidir.
Mevcut kodu değiştirmek gerekmez.
 */