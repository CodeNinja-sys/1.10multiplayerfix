/*
 * Decompiled with CFR 0.150.
 */
class bnl
extends st {
    final /* synthetic */ qn a;

    public bnl(qn qn2) {
        this.a = qn2;
        super(qn2.u, qn2.w, qn2.x, 80, qn2.x - 40, qn2.B.a + 1);
    }

    @Override
    protected int a() {
        return qn.a(this.a).size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void b() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.B.a((String)qn.a(this.a).get(n2), 10, n4, 0xFFFFFF);
        this.a.B.a((String)qn.b(this.a).get(n2), 230, n4, 0xFFFFFF);
    }

    @Override
    protected int c() {
        return this.d - 10;
    }
}

