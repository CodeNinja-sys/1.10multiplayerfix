/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.u.bp;
import org.apache.commons.c.am;

public class ag
extends bp {
    private final String c;

    protected ag(int n2, String ... arrstring) {
        super(0, arrstring[0], arrstring[1]);
        this.c = am.a((CharSequence)arrstring[2]) ? "normal" : arrstring[2].toLowerCase();
    }

    public ag(String string) {
        this(0, ag.a(string));
    }

    public ag(bp bp2, String string) {
        this(bp2.toString(), string);
    }

    public ag(String string, String string2) {
        this(0, ag.a(String.valueOf(string) + '#' + (string2 == null ? "normal" : string2)));
    }

    protected static String[] a(String string) {
        String[] arrstring = new String[3];
        arrstring[1] = string;
        String[] arrstring2 = arrstring;
        int n2 = string.indexOf(35);
        String string2 = string;
        if (n2 >= 0) {
            arrstring2[2] = string.substring(n2 + 1, string.length());
            if (n2 > 1) {
                string2 = string.substring(0, n2);
            }
        }
        System.arraycopy(bp.b(string2), 0, arrstring2, 0, 2);
        return arrstring2;
    }

    public String a() {
        return this.c;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ag && super.equals(object)) {
            ag ag2 = (ag)object;
            return this.c.equals(ag2.c);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.c.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(super.toString()) + '#' + this.c;
    }
}

