public class Cuenta {
        private String titular;
        private double monto;

        public Cuenta(String titular) {
            this(titular, 0); //Sobrecarga
        }

        public Cuenta(String titular, double cantidad) {
            this.titular = titular;

            if (cantidad < 0) {
                this.monto = 0;
            } else {
                this.monto = cantidad;
            }
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getMonto() {
            return monto;
        }

        public void setMonto(double cantidad) {
            this.monto = cantidad;
        }

        public void ingresar(double cantidad) {
            if(cantidad > 0){
                this.monto += cantidad;
            }
        }

        public void retirar(double cantidad) {
            if (this.monto - cantidad < 0) {
                this.monto = 1300;
            } else {
                this.monto -= cantidad;
            }
        }

        public String toString() {
            return "El titular " + titular + " tiene " + monto + " soles en la cuenta";
        }

    }
