/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class dbg {
    private final Map a = sz.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final wm d;

    public dbg(wm wm2) {
        this.d = wm2;
    }

    public ars a(azg azg2) {
        return this.a(azg2, 0);
    }

    public ars a(azg azg2, int n2) {
        return this.a(new bhl(azg2, 1, n2)).d();
    }

    public bpi a(bhl bhl2) {
        bkz bkz2;
        azg azg2 = bhl2.a();
        bpi bpi2 = this.b(azg2, this.b(bhl2));
        if (bpi2 == null && (bkz2 = (bkz)this.c.get(azg2)) != null) {
            bpi2 = this.d.a(bkz2.a(bhl2));
        }
        if (bpi2 == null) {
            bpi2 = this.d.a();
        }
        return bpi2;
    }

    protected int b(bhl bhl2) {
        return bhl2.i() > 0 ? 0 : bhl2.h();
    }

    protected bpi b(azg azg2, int n2) {
        return (bpi)this.b.get(this.c(azg2, n2));
    }

    private int c(azg azg2, int n2) {
        return azg.a(azg2) << 16 | n2;
    }

    public void a(azg azg2, int n2, up up2) {
        this.a.put(this.c(azg2, n2), up2);
        this.b.put(this.c(azg2, n2), this.d.a(up2));
    }

    public void a(azg azg2, bkz bkz2) {
        this.c.put(azg2, bkz2);
    }

    public wm a() {
        return this.d;
    }

    public void b() {
        this.b.clear();
        for (Map.Entry entry : this.a.entrySet()) {
            this.b.put(entry.getKey(), this.d.a((up)entry.getValue()));
        }
    }
}

