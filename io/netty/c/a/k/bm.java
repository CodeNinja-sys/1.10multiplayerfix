/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

public class bm
implements Comparable {
    public static final bm a = new bm(1, "PROTOCOL_ERROR");
    public static final bm b = new bm(2, "INVALID_STREAM");
    public static final bm c = new bm(3, "REFUSED_STREAM");
    public static final bm d = new bm(4, "UNSUPPORTED_VERSION");
    public static final bm e = new bm(5, "CANCEL");
    public static final bm f = new bm(6, "INTERNAL_ERROR");
    public static final bm g = new bm(7, "FLOW_CONTROL_ERROR");
    public static final bm h = new bm(8, "STREAM_IN_USE");
    public static final bm i = new bm(9, "STREAM_ALREADY_CLOSED");
    public static final bm j = new bm(10, "INVALID_CREDENTIALS");
    public static final bm k = new bm(11, "FRAME_TOO_LARGE");
    private final int l;
    private final String m;

    public static bm a(int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("0 is not a valid status code for a RST_STREAM");
        }
        switch (n2) {
            case 1: {
                return a;
            }
            case 2: {
                return b;
            }
            case 3: {
                return c;
            }
            case 4: {
                return d;
            }
            case 5: {
                return e;
            }
            case 6: {
                return f;
            }
            case 7: {
                return g;
            }
            case 8: {
                return h;
            }
            case 9: {
                return i;
            }
            case 10: {
                return j;
            }
            case 11: {
                return k;
            }
        }
        return new bm(n2, "UNKNOWN (" + n2 + ')');
    }

    public bm(int n2, String string) {
        if (n2 == 0) {
            throw new IllegalArgumentException("0 is not a valid status code for a RST_STREAM");
        }
        if (string == null) {
            throw new NullPointerException("statusPhrase");
        }
        this.l = n2;
        this.m = string;
    }

    public int a() {
        return this.l;
    }

    public String b() {
        return this.m;
    }

    public int hashCode() {
        return this.a();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bm)) {
            return false;
        }
        return this.a() == ((bm)object).a();
    }

    public String toString() {
        return this.b();
    }

    public int a(bm bm2) {
        return this.a() - bm2.a();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bm)object);
    }
}

