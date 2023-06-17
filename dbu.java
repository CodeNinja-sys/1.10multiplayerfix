/*
 * Decompiled with CFR 0.150.
 */
public class dbu
extends cef {
    private static final bcz a = bwm.a(dbu.class, cbf.d);
    private static final bcz b = bwm.a(dbu.class, cbf.e);
    private final cxh c = new cuc(this);
    private int d;

    public dbu(iu iu2) {
        super(iu2);
    }

    public dbu(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        cef.b(cgy2, "MinecartCommandBlock");
        cgy2.a(bst.e, (cui)new lk());
    }

    @Override
    protected void a() {
        super.a();
        this.bY().a(a, "");
        this.bY().a(b, new aym(""));
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.c.b(bvp2);
        this.bY().b(a, this.p().l());
        this.bY().b(b, this.p().k());
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        this.c.a(bvp2);
    }

    @Override
    public cta bd_() {
        return cta.g;
    }

    @Override
    public dbk be_() {
        return blg.bX.s();
    }

    public cxh p() {
        return this.c;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.by - this.d >= 4) {
            this.p().a(this.aQ);
            this.d = this.by;
        }
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        this.c.a(bdl2);
        return false;
    }

    @Override
    public void a(bcz bcz2) {
        super.a(bcz2);
        if (b.equals(bcz2)) {
            try {
                this.c.b((cbg)this.bY().a(b));
            }
            catch (Throwable throwable) {}
        } else if (a.equals(bcz2)) {
            this.c.a((String)this.bY().a(a));
        }
    }

    @Override
    public boolean O_() {
        return true;
    }

    static /* synthetic */ bcz M() {
        return a;
    }

    static /* synthetic */ bcz O() {
        return b;
    }
}

