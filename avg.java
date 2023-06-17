/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

class avg
extends st {
    private final List b;
    final /* synthetic */ bjs a;

    public avg(bjs bjs2, bxy bxy2) {
        this.a = bjs2;
        super(bxy2, bjs2.w, bjs2.x, 32, bjs2.x - 64, bjs.m((bjs)bjs2).a * 4);
        this.b = ov.a();
        this.a(false);
        for (qb qb2 : vb.a.values()) {
            if (bjs.b(bjs2).a(qb2.d) <= 0 && bjs.b(bjs2).a(qb2.e) <= 0) continue;
            this.b.add(qb2);
        }
    }

    @Override
    protected int a() {
        return this.b.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int e() {
        return this.a() * bjs.n((bjs)this.a).a * 4;
    }

    @Override
    protected void b() {
        this.a.aH_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        qb qb2 = (qb)this.b.get(n2);
        String string = bf.a("entity." + qb2.a + ".name", new Object[0]);
        int n8 = bjs.b(this.a).a(qb2.d);
        int n9 = bjs.b(this.a).a(qb2.e);
        String string2 = bf.a("stat.entityKills", n8, string);
        String string3 = bf.a("stat.entityKilledBy", string, n9);
        if (n8 == 0) {
            string2 = bf.a("stat.entityKills.none", string);
        }
        if (n9 == 0) {
            string3 = bf.a("stat.entityKilledBy.none", string);
        }
        this.a.b(bjs.o(this.a), string, n3 + 2 - 10, n4 + 1, 0xFFFFFF);
        this.a.b(bjs.p(this.a), string2, n3 + 2, n4 + 1 + bjs.q((bjs)this.a).a, n8 == 0 ? 0x606060 : 0x909090);
        this.a.b(bjs.r(this.a), string3, n3 + 2, n4 + 1 + bjs.s((bjs)this.a).a * 2, n9 == 0 ? 0x606060 : 0x909090);
    }
}

