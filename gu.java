/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class gu {
    private static final gu a = new gu();
    private final Map b = sz.c();
    private final Map c = sz.c();

    public static gu a() {
        return a;
    }

    private gu() {
        this.a(blg.p, new bhl(hp.l), 0.7f);
        this.a(blg.o, new bhl(hp.m), 1.0f);
        this.a(blg.ag, new bhl(hp.k), 1.0f);
        this.a(blg.m, new bhl(blg.w), 0.1f);
        this.a(hp.an, new bhl(hp.ao), 0.35f);
        this.a(hp.bp, new bhl(hp.bq), 0.35f);
        this.a(hp.br, new bhl(hp.bs), 0.35f);
        this.a(hp.bv, new bhl(hp.bw), 0.35f);
        this.a(hp.bt, new bhl(hp.bu), 0.35f);
        this.a(blg.e, new bhl(blg.b), 0.1f);
        this.a(new bhl(blg.bf, 1, bbt.b), new bhl(blg.bf, 1, bbt.d), 0.1f);
        this.a(hp.aP, new bhl(hp.aO), 0.3f);
        this.a(blg.aL, new bhl(blg.cz), 0.35f);
        this.a(blg.aK, new bhl(hp.bd, 1, dck.n.c()), 0.2f);
        this.a(blg.r, new bhl(hp.j, 1, 1), 0.15f);
        this.a(blg.s, new bhl(hp.j, 1, 1), 0.15f);
        this.a(blg.bP, new bhl(hp.bY), 1.0f);
        this.a(hp.cc, new bhl(hp.cd), 0.35f);
        this.a(blg.aV, new bhl(hp.cp), 0.1f);
        this.a(new bhl(blg.v, 1, 1), new bhl(blg.v, 1, 0), 0.15f);
        this.a(hp.cS, new bhl(hp.cT), 0.1f);
        for (aty aty2 : aty.values()) {
            if (!aty2.g()) continue;
            this.a(new bhl(hp.bb, 1, aty2.a()), new bhl(hp.bc, 1, aty2.a()), 0.35f);
        }
        this.a(blg.q, new bhl(hp.j), 0.1f);
        this.a(blg.aC, new bhl(hp.aE), 0.7f);
        this.a(blg.x, new bhl(hp.bd, 1, dck.l.c()), 0.2f);
        this.a(blg.co, new bhl(hp.cq), 0.2f);
    }

    public void a(bfa bfa2, bhl bhl2, float f2) {
        this.a(azg.a(bfa2), bhl2, f2);
    }

    public void a(azg azg2, bhl bhl2, float f2) {
        this.a(new bhl(azg2, 1, 32767), bhl2, f2);
    }

    public void a(bhl bhl2, bhl bhl3, float f2) {
        this.b.put(bhl2, bhl3);
        this.c.put(bhl3, Float.valueOf(f2));
    }

    public bhl a(bhl bhl2) {
        for (Map.Entry entry : this.b.entrySet()) {
            if (!this.a(bhl2, (bhl)entry.getKey())) continue;
            return (bhl)entry.getValue();
        }
        return null;
    }

    private boolean a(bhl bhl2, bhl bhl3) {
        return bhl3.a() == bhl2.a() && (bhl3.h() == 32767 || bhl3.h() == bhl2.h());
    }

    public Map b() {
        return this.b;
    }

    public float b(bhl bhl2) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (!this.a(bhl2, (bhl)entry.getKey())) continue;
            return ((Float)entry.getValue()).floatValue();
        }
        return 0.0f;
    }
}

