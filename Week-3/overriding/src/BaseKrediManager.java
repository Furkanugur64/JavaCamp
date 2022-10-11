public class BaseKrediManager {


    // Java dilinde classlar default olarak overridable
    // Bunu kaldırmak için class türünün (double) önüne final anahtar sözcüğü koyulur
    public double hesapla(double tutar){
        return tutar*1.18;
    }
}
