/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import org.apache.commons.c.am;
import org.apache.commons.c.ao;

public class bp {
    protected final String a;
    protected final String b;

    protected bp(int n2, String ... arrstring) {
        this.a = am.a((CharSequence)arrstring[0]) ? "minecraft" : arrstring[0].toLowerCase();
        this.b = arrstring[1];
        ao.a((Object)this.b);
    }

    public bp(String string) {
        this(0, bp.b(string));
    }

    public bp(String string, String string2) {
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
        return String.valueOf(this.a) + ':' + this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bp)) {
            return false;
        }
        bp bp2 = (bp)object;
        return this.a.equals(bp2.a) && this.b.equals(bp2.b);
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

