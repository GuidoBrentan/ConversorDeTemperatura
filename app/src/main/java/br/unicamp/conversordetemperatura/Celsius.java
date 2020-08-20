package br.unicamp.conversordetemperatura;

public class Celsius
{
    double celsius;

    public Celsius(double celsius)
    {
        this.setCelsius(celsius);
    }

    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }

    public double getCelsius() { return this.celsius; }

    public double ConverterParaFahrenheit()
    {
        double fahrenheit;

        fahrenheit = (this.celsius * 9/5) + 32;

        return fahrenheit;
    }

    public double ConverterParaKelvin()
    {
        double kelvin;

        kelvin = celsius + 273.15;

        return kelvin;
    }
}

