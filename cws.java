/*
 * Decompiled with CFR 0.150.
 */
public class cws
extends ck {
    private final it a;
    private final double b;
    private double c;
    private double d;
    private double e;

    public cws(it it2, double d2) {
        this.a = it2;
        this.b = d2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (this.a.D() || !this.a.cq()) {
            return false;
        }
        amj amj2 = ble.a(this.a, 5, 4);
        if (amj2 == null) {
            return false;
        }
        this.c = amj2.b;
        this.d = amj2.c;
        this.e = amj2.d;
        return true;
    }

    @Override
    public void c() {
        this.a.ap().a(this.c, this.d, this.e, this.b);
    }

    @Override
    public boolean a() {
        return !this.a.ap().m() && this.a.cq();
    }

    @Override
    public void e() {
        if (this.a.aW().nextInt(50) == 0) {
            cpk cpk2 = (cpk)this.a.cH().get(0);
            if (cpk2 == null) {
                return;
            }
            if (cpk2 instanceof bdl) {
                int n2 = this.a.O();
                int n3 = this.a.V();
                if (n3 > 0 && this.a.aW().nextInt(n3) < n2) {
                    this.a.e((bdl)cpk2);
                    this.a.aQ.a((cpk)this.a, (byte)7);
                    return;
                }
                this.a.f(5);
            }
            this.a.cl();
            this.a.ab();
            this.a.aQ.a((cpk)this.a, (byte)6);
        }
    }
}

