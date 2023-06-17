/*
 * Decompiled with CFR 0.150.
 */
public class xp
implements Comparable {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public xp(String string, String string2, String string3, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bl2;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.d;
    }

    public String toString() {
        return String.format("%s (%s)", this.c, this.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xp)) {
            return false;
        }
        return this.a.equals(((xp)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int a(xp xp2) {
        return this.a.compareTo(xp2.a);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((xp)object);
    }
}

