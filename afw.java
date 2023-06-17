/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;

public class afw
implements ds {
    private String a;
    private si b;

    public afw() {
    }

    public afw(String string, si si2) {
        this.a = string;
        this.b = si2;
        if (si2.q() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(20);
        int n2 = si2.r();
        if (n2 < 0 || n2 > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.b = new si(si2.y(n2));
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.b(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public String a() {
        return this.a;
    }

    public si b() {
        return this.b;
    }
}

