/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bce
extends ck {
    private final cwp a;
    private hx b;
    private int c;
    private boolean d;

    public bce(cwp cwp2) {
        this.a = cwp2;
        this.a(3);
    }

    @Override
    public boolean b() {
        if (this.a.aL() >= 0) {
            return false;
        }
        if (!this.a.aQ.h()) {
            return false;
        }
        List list = this.a.aQ.a(hx.class, this.a.cD().b(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (hx hx2 : list) {
            if (hx2.C() <= 0) continue;
            this.b = hx2;
            break;
        }
        return this.b != null;
    }

    @Override
    public boolean a() {
        return this.b.C() > 0;
    }

    @Override
    public void c() {
        this.c = this.a.aW().nextInt(320);
        this.d = false;
        this.b.ap().n();
    }

    @Override
    public void d() {
        this.b = null;
        this.a.ap().n();
    }

    @Override
    public void e() {
        this.a.am().a(this.b, 30.0f, 30.0f);
        if (this.b.C() == this.c) {
            this.a.ap().a(this.b, 0.5);
            this.d = true;
        }
        if (this.d && this.a.l(this.b) < 4.0) {
            this.b.a(false);
            this.a.ap().n();
        }
    }
}

