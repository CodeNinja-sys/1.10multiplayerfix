/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bhh {
    private static final d a = org.apache.logging.log4j.c.c();
    private final brd b;
    private final ajd[] c = new ajd[baw.c()];
    private ajd d;

    public bhh(brd brd2) {
        this.b = brd2;
        this.a(baw.k);
    }

    public void a(baw baw2) {
        if (this.d != null && baw2 == this.d.d()) {
            return;
        }
        if (this.d != null) {
            this.d.i();
        }
        this.d = this.b(baw2);
        if (!this.b.aQ.C) {
            this.b.bY().b(brd.a, baw2.b());
        }
        a.a("Dragon is now in phase {} on the {}", baw2, this.b.aQ.C ? "client" : "server");
        this.d.b();
    }

    public ajd a() {
        return this.d;
    }

    public ajd b(baw baw2) {
        int n2 = baw2.b();
        if (this.c[n2] == null) {
            this.c[n2] = baw2.a(this.b);
        }
        return this.c[n2];
    }
}

