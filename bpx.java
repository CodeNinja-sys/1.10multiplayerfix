/*
 * Decompiled with CFR 0.150.
 */
import org.apache.commons.c.am;
import org.apache.commons.c.ao;

public class bpx {
    protected final String a;
    protected final String b;

    protected bpx(int n2, String ... arrstring) {
        this.a = am.a((CharSequence)arrstring[0]) ? "minecraft" : arrstring[0].toLowerCase();
        this.b = arrstring[1];
        ao.a((Object)this.b);
    }

    public bpx(String string) {
        this(0, bpx.b(string));
    }

    public bpx(String string, String string2) {
        this(0, string, string2);
    }

    protected static String[] b(String string) {
        String[] arrstring = new String[]{"minecraft", string};
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            arrstring[1] = string.substring(n2 + 1, string.length());
            if (n2 > 1) {
                arrstring[0] = string.substring(0, n2);
            }
        }
        return arrstring;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return this.a + ':' + this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bpx) {
            bpx bpx2 = (bpx)object;
            return this.a.equals(bpx2.a) && this.b.equals(bpx2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

