/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InnerStatic;

/**
 *
 * @author nick
 */
public class uji {
    public static void main(String[] args)
  {
     kampus.mahasiswa Indun = new kampus.mahasiswa(" Indun ");
     kampus.dosenwali Eko = new kampus().new dosenwali("Pak. EKo");
     kampus.dosen Isna = new kampus.dosen ("Isna");
     kampus.bendahara Kaliri =new kampus().new bendahara("Kaliri");

     Indun.setNIM(" A11.2011.06299");
     System.out.println("NIM " +  Indun.Nama+ " adalah "   + Indun.getNIM());
     System.out.println("dengan dosen wali "  + Eko.Nama);
     Indun.setNilai(50);
      System.out.println("  nilai " +  Indun.Nama  + "  adalah  "   + Indun.getNilai());
       Isna.setNID("d4150");
      System.out.println("  NID "   +  Eko.Nama +  "  adalah  "  +   Isna.getNID());
     Isna.setGaji(50000000);
      System.out.println("  gaji  "  +  Eko.Nama   +  "  adalah  "  +  Isna.getGaji()  +   "   dengan bendahara  "  + Kaliri.Nama);

  }


}
