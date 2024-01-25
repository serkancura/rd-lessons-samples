package org.rd.lessons.lessons15.DesingPattern;

public class Bilgisayar {
    private String marka;
    private String islemci;
    private int ram;
    private int depolama;

    public static final class BilgisayarBuilder {
        private String marka;
        private String islemci;
        private int ram;
        private int depolama;

        private BilgisayarBuilder() {
        }

        public static BilgisayarBuilder aBilgisayar() {
            return new BilgisayarBuilder();
        }

        public BilgisayarBuilder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public BilgisayarBuilder withIslemci(String islemci) {
            this.islemci = islemci;
            return this;
        }

        public BilgisayarBuilder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public BilgisayarBuilder withDepolama(int depolama) {
            this.depolama = depolama;
            return this;
        }

        public Bilgisayar build() {
            Bilgisayar bilgisayar = new Bilgisayar();
            bilgisayar.depolama = this.depolama;
            bilgisayar.ram = this.ram;
            bilgisayar.marka = this.marka;
            bilgisayar.islemci = this.islemci;
            return bilgisayar;
        }
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "marka='" + marka + '\'' +
                ", islemci='" + islemci + '\'' +
                ", ram=" + ram +
                ", depolama=" + depolama +
                '}';
    }
}
