abstract class Tanaman {
    public int masaHidup;
    public int lamaHidup;
    public int berbuah;
    public int buah;
    public double perkembangan;
    public double prosesBerbuah;

    public Tanaman(int masaHidup) {
        this.masaHidup = masaHidup;
        this.lamaHidup = 0;
        this.buah = 0;
        this.prosesBerbuah = 0;
    }

    public abstract void berkembang();

    public String status() {
        return (lamaHidup >= masaHidup) ? "Tewas" : "Hidup";
    }

    @Override
    public String toString() {
        return "Masa Hidup: " + masaHidup + ", Umur Tanaman: " + lamaHidup +
               ", Buah yang Dihasilkan: " + buah + ", Status: " + status();
    }
    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
}