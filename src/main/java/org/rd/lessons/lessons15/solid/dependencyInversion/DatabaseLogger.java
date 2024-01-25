package org.rd.lessons.lessons15.solid.dependencyInversion;


class DatabaseLogger implements Logger
{
    @Override
    public void log(String message)
    {
        // Mesajı veritabanına kaydetme işlemi
    }
}

