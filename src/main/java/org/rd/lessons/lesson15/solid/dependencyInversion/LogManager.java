package org.rd.lessons.lesson15.solid.dependencyInversion;


class LogManager
{
    private final Logger _logger;

    public LogManager(Logger logger)
    {
        _logger = logger;
    }

    public void LogMessage(String message)
    {
        _logger.log(message);
    }
}


/*
Bu örnekte, Logger arayüzü loglama işlemini temsil ederken,
FileLogger ve DatabaseLogger sınıfları bu arayüzü uygulayarak farklı loglama yöntemlerini sağlar.
LogManager sınıfı, loglama işlemini gerçekleştirmek için bir Logger nesnesine bağımlıdır.
Bu sayede, LogManager sınıfının loglama yöntemini değiştirmek istediğimizde,
sadece bağımlılığı değiştirmemiz yeterlidir.
 */