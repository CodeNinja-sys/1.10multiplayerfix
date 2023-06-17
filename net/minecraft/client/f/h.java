/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

public class h
implements Comparable {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public h(String string, String string2, String string3, boolean bl2) {
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
        return this == object ? true : (!(object instanceof h) ? false : this.a.equals(((h)object).a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int a(h h2) {
        return this.a.compareTo(h2.a);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((h)object);
    }
}

