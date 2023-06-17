/*
 * Decompiled with CFR 0.150.
 */
import org.apache.commons.c.am;

public class aas
implements ds {
    private String a;
    private boolean b;
    private cmz c;

    public aas() {
    }

    public aas(String string, cmz cmz2, boolean bl2) {
        this.a = string;
        this.c = cmz2;
        this.b = bl2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(32767);
        this.b = si2.D();
        boolean bl2 = si2.D();
        if (bl2) {
            this.c = si2.c();
        }
    }

    @Override
    public void b(si si2) {
        si2.a(am.a(this.a, 0, 32767));
        si2.a(this.b);
        boolean bl2 = this.c != null;
        si2.a(bl2);
        if (bl2) {
            si2.a(this.c);
        }
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public String a() {
        return this.a;
    }

    public cmz b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }
}

