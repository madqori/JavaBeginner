package InnerNonStatic;
public class Linux {
    String tipe,versi;
    double kernel=0;
    class JenisLinux extends Linux{
       void UbuntuLinux(){};
       void TeaLinux(){};
       public void Perbandingan(double a,double b){
           System.out.println("Perbandingan : \t");
       if(a>b){
           System.out.println("Ubuntu Lebih Bagus");
       }else if(b>a){
           System.out.println("TeaLinux Lebih Bagus");
       }
       };
       public double kernel(double x){return 0;};
    }

    class DistroUbuntuLinux extends JenisLinux {
       
        public DistroUbuntuLinux(String tipe)
        {
            this.tipe=tipe;this.kernel=3.0;
        }
        @Override
        public void UbuntuLinux()
        {
            this.kernel=3.0;this.versi="12.0";
            System.out.println(this.tipe +" Versi "+this.versi +" Kernel "+this.kernel);
        }
        @Override
        public double kernel(double x){
        return (int) kernel;
        }
        @Override
        public void TeaLinux(){}
        
        
    }
   abstract class DistroLinuxTealinux extends JenisLinux{
        public DistroLinuxTealinux(String tipe)
        {
            this.tipe=tipe;this.kernel=0;
        }
        
        @Override
        public void UbuntuLinux(){}     
        @Override
        public void TeaLinux()
        {
            this.kernel=4.0;this.versi="5.0";
            System.out.println(this.tipe +" Versi "+this.versi +" Kernel "+this.kernel);
        }
        @Override
         public double kernel(double x){
        return (int) kernel;
        }
   }
    public static void main(String[] args) {
       Linux.JenisLinux Inti = new Linux().new JenisLinux();
        Linux.DistroUbuntuLinux Ubuntu = new Linux().new DistroUbuntuLinux("Ubuntu"){};
        Ubuntu.UbuntuLinux();
        Ubuntu.kernel(3.0);
        Linux.DistroLinuxTealinux Tea= new Linux().new DistroLinuxTealinux("OolongTea"){};
       Tea.TeaLinux();  
       Tea.kernel(4.0);
       Inti.Perbandingan(Ubuntu.kernel(3.0),Tea.kernel(4.0));      
    }
}        
