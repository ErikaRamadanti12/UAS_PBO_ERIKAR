public class PersegiPanjang {
  float panjang, lebar;

  public PersegiPanjang(float panjang, float lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public float hitungLuas(){
    return panjang * lebar;
  }

  public float hitungKeliling(){
    return 2 * (panjang+lebar);
  }
  public static void main(String[] args) {
    PersegiPanjang persegipanjang1 = new PersegiPanjang(10,5);

    System.out.println(persegipanjang1.hitungLuas());
    System.out.println(persegipanjang1.hitungKeliling());

  }
}
