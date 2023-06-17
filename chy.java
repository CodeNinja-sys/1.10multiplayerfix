/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class chy
extends ck {
    private final ha a;

    public chy(ha ha2) {
        this.a = ha2;
        this.a(1);
    }

    @Override
    public boolean b() {
        double d2;
        double d3;
        cel cel2 = this.a.an();
        if (!cel2.b()) {
            return true;
        }
        double d4 = cel2.d() - this.a.aU;
        double d5 = d4 * d4 + (d3 = cel2.e() - this.a.aV) * d3 + (d2 = cel2.f() - this.a.aW) * d2;
        return d5 < 1.0 || d5 > 3600.0;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void c() {
        Random random = this.a.aW();
        double d2 = this.a.aU + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d3 = this.a.aV + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d4 = this.a.aW + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.a.an().a(d2, d3, d4, 1.0);
    }
}

