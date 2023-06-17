/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;

public class cjc
extends cjm {
    protected cjc() {
        super(new bpx("killed_by_player"), avs.class);
    }

    public void a(z z2, avs avs2, ad ad2) {
        z2.a("inverse", avs.a(avs2));
    }

    public avs a(z z2, u u2) {
        return new avs(cwe.a(z2, "inverse", false));
    }

    @Override
    public /* synthetic */ cfv b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

