/*
 * Decompiled with CFR 0.150.
 */
package b.b;

public final class c {
    public final String a;
    public final String b;

    private c(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static c a(String string) {
        int n2 = string.indexOf(61);
        if (n2 == -1) {
            return new c(string, "");
        }
        String string2 = string.substring(0, n2);
        String string3 = n2 == string.length() - 1 ? "" : string.substring(n2 + 1);
        return new c(string2, string3);
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        return this.a.equals(c2.a) && this.b.equals(c2.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return this.a + '=' + this.b;
    }
}

