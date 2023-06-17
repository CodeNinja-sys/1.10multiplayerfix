/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import java.util.Collection;
import java.util.Random;

public class hs
extends aoe {
    protected final azg a;
    protected final azp[] b;

    public hs(azg azg2, int n2, int n3, azp[] arrazp, cfv[] arrcfv) {
        super(n2, n3, arrcfv);
        this.a = azg2;
        this.b = arrazp;
    }

    @Override
    public void a(Collection collection, Random random, abe abe2) {
        bhl bhl2 = new bhl(this.a);
        for (azp azp2 : this.b) {
            if (!bsf.a(azp2.a(), random, abe2)) continue;
            bhl2 = azp2.a(bhl2, random, abe2);
        }
        if (bhl2.b > 0) {
            if (bhl2.b < this.a.i()) {
                collection.add(bhl2);
            } else {
                bhl bhl3;
                for (int i2 = bhl2.b; i2 > 0; i2 -= bhl3.b) {
                    bhl3 = bhl2.j();
                    bhl3.b = Math.min(bhl2.b(), i2);
                    collection.add(bhl3);
                }
            }
        }
    }

    @Override
    protected void a(z z2, ad ad2) {
        bpx bpx2;
        if (this.b != null && this.b.length > 0) {
            z2.a("functions", ad2.a(this.b));
        }
        if ((bpx2 = (bpx)azg.g.b(this.a)) == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + this.a);
        }
        z2.a("name", bpx2.toString());
    }

    public static hs a(z z2, u u2, int n2, int n3, cfv[] arrcfv) {
        azg azg2 = cwe.g(z2, "name");
        azp[] arrazp = z2.b("functions") ? (azp[])cwe.a(z2, "functions", u2, azp[].class) : new azp[0];
        return new hs(azg2, n2, n3, arrazp, arrcfv);
    }
}

