package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

     private final Deth8 deth8;

     @Autowired
     public Needle7(Deth8 deth8) {
        this.deth8 = deth8;
     }

    @Override
    public String toString() {
        return ",\n смерть Кощея на игле :( " + deth8.toString();
    }
}
