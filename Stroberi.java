class Stroberi extends Tanaman implements Perawatan {
    public Stroberi(int masaHidup) {
        super(masaHidup);
    }

    @Override
    public void berkembang() {
        this.lamaHidup += 30;
        this.prosesBerbuah += 21;
        this.perkembangan += 12;
        this.buah += 21;
        if (this.lamaHidup > this.masaHidup) {
            this.masaHidup = 0;
        }
    }

    @Override
    public void treatment() {
        this.lamaHidup +=10;
    }
}