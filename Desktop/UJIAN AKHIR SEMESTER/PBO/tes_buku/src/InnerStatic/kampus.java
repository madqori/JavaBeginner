/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InnerStatic;

/**
 *
 * @author nick
 */
public class kampus {

String Nama;

    static class mahasiswa
    extends kampus
    {
        String NIM;
        public mahasiswa(String nama)
        {
            this.Nama=nama;
        }
        void setNIM(String NIM)
        {
            this.NIM=NIM;
        }
        String getNIM()
        {
            return this.NIM;
        }

        int Nilai;
       void setNilai(int hasil )
        {
           this.Nilai=hasil;
        }

       int getNilai()
        {
         return this.Nilai;
        }
    
    }

     static class dosen
    extends kampus
    {
        String NID;
        public dosen(String nama)
        {
            this.Nama=nama;
        }
        void setNID(String NID)
        {
            this.NID=NID;
        }
        String getNID()
        {
            return this.NID;
        }

        int gaji;
       void setGaji(int pendapatan )
        {
           this.gaji=pendapatan;
        }

       int getGaji()
        {
         return this.gaji;
        }

    }

class dosenwali extends mahasiswa
    {
        public dosenwali (String nama)
        {
            super (nama);
        }
    }

class bendahara extends dosen


{
    public bendahara (String nama)
    {
      super (nama);
    }

}


}
