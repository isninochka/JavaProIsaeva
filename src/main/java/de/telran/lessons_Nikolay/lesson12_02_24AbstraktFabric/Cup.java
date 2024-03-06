package de.telran.lessons_Nikolay.lesson12_02_24AbstraktFabric;

interface Cup {
    void keep();
}

interface Cap{
    void close();
}

class Coffee implements Cup, Cap{

    @Override
    public void keep() {

    }

    @Override
    public void close() {

    }
}
