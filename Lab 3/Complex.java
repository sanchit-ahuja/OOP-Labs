/**
 * Complex
 */
public class Complex {

    private double realPart;
    private double imaginaryPart;
    Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    Complex(double realPart,double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(double ...C) {
            if(C.length==1) {
                this.realPart = C[0];
                this.imaginaryPart = 0;
            }
            else {
                this.realPart = C[0];
                this.imaginaryPart = C[1];
            }
    }
    public void setRealPart(double realPart) {
            this.realPart = realPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
            return this.realPart;
    }
    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public String toString() {
        return "RealPart: " + this.realPart + " " + "ImagPart: " + this.imaginaryPart;
    }

    public Complex add(Complex other) {
        double real = this.realPart + other.getRealPart();
        double imag = this.imaginaryPart + other.getImaginaryPart();
        Complex ans = new Complex(real,imag);
        return ans;
    }


    public Complex subtract(Complex other) {
        double real = this.realPart - other.getRealPart();
        double imag = this.imaginaryPart - other.getImaginaryPart();
        Complex ans = new Complex(real,imag);
        return ans;
    }


    public Complex multiply(Complex other) {
        double real = this.realPart*other.getRealPart() -this.imaginaryPart*other.getImaginaryPart();
        double imag = this.realPart*other.imaginaryPart + this.imaginaryPart*other.getRealPart();
        Complex ans = new Complex(real,imag);
        return ans;
    }


    public Complex divide(Complex other) {
        double prod = other.getRealPart()*other.getRealPart() + other.getImaginaryPart()*other.getImaginaryPart();
        double real = (this.realPart*other.getRealPart() + this.imaginaryPart*other.getImaginaryPart())/prod;
        double imag = (this.realPart*other.imaginaryPart - this.imaginaryPart*other.getRealPart())/prod;
        Complex ans = new Complex(real,imag);
        return ans;
    }

}