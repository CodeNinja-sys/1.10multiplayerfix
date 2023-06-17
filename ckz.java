/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class ckz
extends cjm {
    protected ckz() {
        super(new bpx("random_chance_with_looting"), mu.class);
    }

    public void a(z z2, mu mu2, ad ad2) {
        z2.a("chance", Float.valueOf(mu.a(mu2)));
        z2.a("looting_multiplier", Float.valueOf(mu.b(mu2)));
    }

    public mu a(z z2, u u2) {
        return new mu(cwe.i(z2, "chance"), cwe.i(z2, "looting_multiplier"));
    }

    @Override
    public /* synthetic */ cfv b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

