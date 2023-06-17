/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.z;

public class cki
extends cnw {
    public cki() {
        super(new bpx("set_nbt"), adv.class);
    }

    public void a(z z2, adv adv2, ad ad2) {
        z2.a("tag", adv.a(adv2).toString());
    }

    public adv a(z z2, u u2, cfv[] arrcfv) {
        try {
            bvp bvp2 = bdg.a(cwe.f(z2, "tag"));
            return new adv(arrcfv, bvp2);
        }
        catch (aoo aoo2) {
            throw new ag(aoo2);
        }
    }

    @Override
    public /* synthetic */ azp b(z z2, u u2, cfv[] arrcfv) {
        return this.a(z2, u2, arrcfv);
    }
}

