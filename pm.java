/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;

public class pm
implements ds {
    private String a;
    private si b;

    public pm() {
    }

    public pm(String string, si si2) {
        this.a = string;
        this.b = si2;
        if (si2.q() > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(20);
        int n2 = si2.r();
        if (n2 < 0 || n2 > 32767) {
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
        this.b = new si(si2.y(n2));
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.b(this.b);
    }

    public void a(bws bws2) {
        bws2.a(this);
        if (this.b != null) {
            this.b.ad();
        }
    }

    public String a() {
        return this.a;
    }

    public si b() {
        return this.b;
    }
}

