/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class tu
implements bpi {
    private final int a;
    private final List b;
    private final bpi c;

    public tu(List list) {
        this.b = list;
        this.a = ctt.a(list);
        this.c = ((bdd)list.get((int)0)).a;
    }

    private bpi a(long l2) {
        return ((bdd)ctt.a((List)this.b, (int)(Math.abs((int)((int)l2 >> 16)) % this.a))).a;
    }

    @Override
    public List a(dbk dbk2, bqk bqk2, long l2) {
        return this.a(l2).a(dbk2, bqk2, l2);
    }

    @Override
    public boolean a() {
        return this.c.a();
    }

    @Override
    public boolean b() {
        return this.c.b();
    }

    @Override
    public boolean c() {
        return this.c.c();
    }

    @Override
    public ars d() {
        return this.c.d();
    }

    @Override
    public dfk e() {
        return this.c.e();
    }

    @Override
    public clv f() {
        return this.c.f();
    }
}

