/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.c.g;
import com.c.a.c.h;

class agr
implements bbu {
    final /* synthetic */ bae a;

    agr(bae bae2) {
        this.a = bae2;
    }

    @Override
    public void a(h h2, bpx bpx2, g g2) {
        switch (h2) {
            case a: {
                this.a.a.put(h.a, bpx2);
                bae.a(this.a, g2.a("model"));
                if (bae.a(this.a) != null) break;
                bae.a(this.a, "default");
                break;
            }
            case b: {
                this.a.a.put(h.b, bpx2);
                break;
            }
            case c: {
                this.a.a.put(h.c, bpx2);
            }
        }
    }
}

