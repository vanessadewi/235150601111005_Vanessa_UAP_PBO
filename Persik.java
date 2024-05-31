class Persik extends Tanaman implements Perawatan {
    public Persik(int masaHidup) {
        super(masaHidup);
    }

    @Override
    public void berkembang() {
        this.lamaHidup += 30;
        this.prosesBerbuah += 9;
        this.perkembangan += 5;
        this.buah += 9;
        if (this.lamaHidup > this.masaHidup) {
            this.masaHidup = 0; 
        }
    }

    @Override
    public void treatment() {
        this.lamaHidup +=10;
    }
}