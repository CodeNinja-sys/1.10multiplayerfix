/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class au
extends cjm {
    protected au() {
        super(new bpx("random_chance"), cwq.class);
    }

    public void a(z z2, cwq cwq2, ad ad2) {
        z2.a("chance", Float.valueOf(cwq.a(cwq2)));
    }

    public cwq a(z z2, u u2) {
        return new cwq(cwe.i(z2, "chance"));
    }

    @Override
    public /* synthetic */ cfv b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

