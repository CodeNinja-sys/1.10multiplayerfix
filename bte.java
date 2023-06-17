/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class bte {
    private static final bpx a = new bpx("textures/map/map_icons.png");
    private final bnm b;
    private final Map c = sz.c();

    public bte(bnm bnm2) {
        this.b = bnm2;
    }

    public void a(aph aph2) {
        blc.a(this.b(aph2));
    }

    public void a(aph aph2, boolean bl2) {
        blc.a(this.b(aph2), bl2);
    }

    private blc b(aph aph2) {
        blc blc2 = (blc)this.c.get(aph2.a);
        if (blc2 == null) {
            blc2 = new blc(this, aph2, null);
            this.c.put(aph2.a, blc2);
        }
        return blc2;
    }

    public void a() {
        for (blc blc2 : this.c.values()) {
            this.b.c(blc.b(blc2));
        }
        this.c.clear();
    }

    static /* synthetic */ bnm a(bte bte2) {
        return bte2.b;
    }

    static /* synthetic */ bpx b() {
        return a;
    }
}

