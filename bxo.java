/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.ArrayList;

public class bxo
extends cnw {
    public bxo() {
        super(new bpx("enchant_randomly"), chq.class);
    }

    public void a(z z2, chq chq2, ad ad2) {
        if (chq.a(chq2) != null && !chq.a(chq2).isEmpty()) {
            t t2 = new t();
            for (dad dad2 : chq.a(chq2)) {
                bpx bpx2 = (bpx)dad.b.b(dad2);
                if (bpx2 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize enchantment " + dad2);
                }
                t2.a(new ac(bpx2.toString()));
            }
            z2.a("enchantments", t2);
        }
    }

    public chq a(z z2, u u2, cfv[] arrcfv) {
        ArrayList arrayList = null;
        if (z2.b("enchantments")) {
            arrayList = ov.a();
            t t2 = cwe.l(z2, "enchantments");
            for (w w2 : t2) {
                String string = cwe.a(w2, "enchantment");
                dad dad2 = (dad)dad.b.c(new bpx(string));
                if (dad2 == null) {
                    throw new ag("Unknown enchantment '" + string + "'");
                }
                arrayList.add(dad2);
            }
        }
        return new chq(arrcfv, arrayList);
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

