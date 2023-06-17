/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class qn
extends cjn {
    private final cjn a;
    private final cmx b;
    private final List c = ov.a();
    private final List d = ov.a();
    private String e;
    private String[] f;
    private bnl g;
    private cwv h;

    public qn(cjn cjn2, cmx cmx2) {
        this.a = cjn2;
        this.b = cmx2;
    }

    @Override
    public void cH_() {
        this.e = bf.a("options.snooper.title", new Object[0]);
        String string = bf.a("options.snooper.desc", new Object[0]);
        ArrayList arrayList = ov.a();
        for (Iterator iterator : this.B.c(string, this.w - 30)) {
            arrayList.add(iterator);
        }
        this.f = arrayList.toArray(new String[arrayList.size()]);
        this.c.clear();
        this.d.clear();
        this.h = this.b(new cwv(1, this.w / 2 - 152, this.x - 30, 150, 20, this.b.c(oi.u)));
        this.y.add(new cwv(2, this.w / 2 + 2, this.x - 30, 150, 20, bf.a("gui.done", new Object[0])));
        boolean bl2 = this.u.H() != null && this.u.H().ar() != null;
        for (Map.Entry entry : new TreeMap(this.u.J().c()).entrySet()) {
            this.c.add((bl2 ? "C " : "") + (String)entry.getKey());
            this.d.add(this.B.a((String)entry.getValue(), this.w - 220));
        }
        if (bl2) {
            for (Map.Entry entry : new TreeMap(((et)((Object)this.u.H().ar())).c()).entrySet()) {
                this.c.add("S " + (String)entry.getKey());
                this.d.add(this.B.a((String)entry.getValue(), this.w - 220));
            }
        }
        this.g = new bnl(this);
    }

    @Override
    public void p_() {
        super.p_();
        this.g.i();
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 2) {
            this.b.b();
            this.b.b();
            this.u.a(this.a);
        }
        if (cwv2.j == 1) {
            this.b.a(oi.u, 1);
            this.h.i = this.b.c(oi.u);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.g.a(n2, n3, f2);
        this.a(this.B, this.e, this.w / 2, 8, 0xFFFFFF);
        int n4 = 22;
        for (String string : this.f) {
            this.a(this.B, string, this.w / 2, n4, 0x808080);
            n4 += this.B.a;
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ List a(qn qn2) {
        return qn2.c;
    }

    static /* synthetic */ List b(qn qn2) {
        return qn2.d;
    }
}

