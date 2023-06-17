/*
 * Decompiled with CFR 0.150.
 */
public class api
implements Comparable {
    private static long d;
    private final bfa e;
    public final cmz a;
    public long b;
    public int c;
    private final long f = d++;

    public api(cmz cmz2, bfa bfa2) {
        this.a = cmz2;
        this.e = bfa2;
    }

    public boolean equals(Object object) {
        if (object instanceof api) {
            api api2 = (api)object;
            return this.a.equals(api2.a) && bfa.a(this.e, api2.e);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public api a(long l2) {
        this.b = l2;
        return this;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public int a(api api2) {
        if (this.b < api2.b) {
            return -1;
        }
        if (this.b > api2.b) {
            return 1;
        }
        if (this.c != api2.c) {
            return this.c - api2.c;
        }
        if (this.f < api2.f) {
            return -1;
        }
        if (this.f > api2.f) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return bfa.c(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
    }

    public bfa a() {
        return this.e;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((api)object);
    }
}

