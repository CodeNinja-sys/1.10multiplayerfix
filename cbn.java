/*
 * Decompiled with CFR 0.150.
 */
public class cbn {
    private final bpx a;
    private final avo b;
    private final boolean c;
    private final int d;

    public cbn(bpx bpx2, avo avo2, boolean bl2, int n2) {
        this.a = bpx2;
        this.b = avo2;
        this.c = bl2;
        this.d = n2;
    }

    public bpx a() {
        return this.a;
    }

    public avo b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "Variant{modelLocation=" + this.a + ", rotation=" + (Object)((Object)this.b) + ", uvLock=" + this.c + ", weight=" + this.d + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cbn) {
            cbn cbn2 = (cbn)object;
            return this.a.equals(cbn2.a) && this.b == cbn2.b && this.c == cbn2.c && this.d == cbn2.d;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + this.b.hashCode();
        n2 = 31 * n2 + Boolean.valueOf(this.c).hashCode();
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

