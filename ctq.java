/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ctq {
    private static final d a = org.apache.logging.log4j.c.c();
    private final dcy b;
    private final ui c;
    private final int d;
    private final int e;

    public ctq(int n2, dcy dcy2, ui ui2, int n3) {
        if (this.a(n2, ui2)) {
            this.c = ui2;
        } else {
            a.f("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.c = ui.d;
        }
        this.b = dcy2;
        this.d = n2;
        this.e = n3;
    }

    private final boolean a(int n2, ui ui2) {
        return n2 == 0 || ui2 == ui.d;
    }

    public final dcy a() {
        return this.b;
    }

    public final ui b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public String toString() {
        return this.e + "," + this.c.a() + "," + this.b.b();
    }

    public final int e() {
        return this.b.a() * this.e;
    }

    public final boolean f() {
        return this.c == ui.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ctq ctq2 = (ctq)object;
        if (this.e != ctq2.e) {
            return false;
        }
        if (this.d != ctq2.d) {
            return false;
        }
        if (this.b != ctq2.b) {
            return false;
        }
        return this.c == ctq2.c;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + this.e;
        return n2;
    }
}

