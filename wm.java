/*
 * Decompiled with CFR 0.150.
 */
public class wm
implements aoi {
    private avt a;
    private final dam b;
    private final bax c;
    private bpi d;

    public wm(dam dam2) {
        this.b = dam2;
        this.c = new bax(this);
    }

    @Override
    public void a(akx akx2) {
        yf yf2 = new yf(akx2, this.b, this.c);
        this.a = yf2.a();
        this.d = (bpi)this.a.c(yf.a);
        this.c.c();
    }

    public bpi a(up up2) {
        if (up2 == null) {
            return this.d;
        }
        bpi bpi2 = (bpi)this.a.c(up2);
        return bpi2 == null ? this.d : bpi2;
    }

    public bpi a() {
        return this.d;
    }

    public dam b() {
        return this.b;
    }

    public bax c() {
        return this.c;
    }
}

