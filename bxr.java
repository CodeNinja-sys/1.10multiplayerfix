/*
 * Decompiled with CFR 0.150.
 */
public class bxr
extends bql {
    public final cbg[] a = new cbg[]{new aym(""), new aym(""), new aym(""), new aym("")};
    public int b = -1;
    private boolean c = true;
    private bdl d;
    private final bsv e = new bsv();

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = zf.a(this.a[i2]);
            bvp2.a("Text" + (i2 + 1), string);
        }
        this.e.b(bvp2);
        return bvp2;
    }

    @Override
    protected void b(iu iu2) {
        this.a(iu2);
    }

    @Override
    public void a(bvp bvp2) {
        this.c = false;
        super.a(bvp2);
        cuj cuj2 = new cuj(this);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = bvp2.l("Text" + (i2 + 1));
            cbg cbg2 = zf.a(string);
            try {
                this.a[i2] = apa.a(cuj2, cbg2, null);
                continue;
            }
            catch (kx kx2) {
                this.a[i2] = cbg2;
            }
        }
        this.e.a(bvp2);
    }

    @Override
    public hv a_() {
        return new hv(this.l, 9, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    @Override
    public boolean h_() {
        return true;
    }

    public boolean f() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
        if (!bl2) {
            this.d = null;
        }
    }

    public void a(bdl bdl2) {
        this.d = bdl2;
    }

    public bdl g() {
        return this.d;
    }

    public boolean b(bdl bdl2) {
        lt lt2 = new lt(this, bdl2);
        for (cbg cbg2 : this.a) {
            cxk cxk2;
            bcc bcc2;
            bcc bcc3 = bcc2 = cbg2 == null ? null : cbg2.h();
            if (bcc2 == null || bcc2.h() == null || (cxk2 = bcc2.h()).a() != nc.c) continue;
            bdl2.o_().N().a(lt2, cxk2.b());
        }
        return true;
    }

    public bsv h() {
        return this.e;
    }

    static /* synthetic */ bsv a(bxr bxr2) {
        return bxr2.e;
    }
}

