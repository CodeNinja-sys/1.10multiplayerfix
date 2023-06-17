/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.Serializable;

public class x
implements Serializable {
    public static final x a = new x("timeQuality", null, new String[]{"tzKnown", "isSynced", "syncAccuracy"});
    public static final x b = new x("origin", null, new String[]{"ip", "enterpriseId", "software", "swVersion"});
    public static final x c = new x("meta", null, new String[]{"sequenceId", "sysUpTime", "language"});
    public static final int d = -1;
    private static final long e = 9031746276396249990L;
    private static final int f = 32;
    private final String g;
    private final int h;
    private final String[] i;
    private final String[] j;

    protected x(String string, String[] arrstring, String[] arrstring2) {
        int n2 = -1;
        if (string != null) {
            if (string.length() > 32) {
                throw new IllegalArgumentException(String.format("Length of id %s exceeds maximum of %d characters", string, 32));
            }
            n2 = string.indexOf("@");
        }
        if (n2 > 0) {
            this.g = string.substring(0, n2);
            this.h = Integer.parseInt(string.substring(n2 + 1));
        } else {
            this.g = string;
            this.h = -1;
        }
        this.i = arrstring;
        this.j = arrstring2;
    }

    public x(String string, int n2, String[] arrstring, String[] arrstring2) {
        String string2;
        if (string == null) {
            throw new IllegalArgumentException("No structured id name was supplied");
        }
        if (string.contains("@")) {
            throw new IllegalArgumentException("Structured id name cannot contain an '@");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("No enterprise number was supplied");
        }
        this.g = string;
        this.h = n2;
        String string3 = string2 = n2 < 0 ? string : string + "@" + n2;
        if (string2.length() > 32) {
            throw new IllegalArgumentException("Length of id exceeds maximum of 32 characters: " + string2);
        }
        this.i = arrstring;
        this.j = arrstring2;
    }

    public x a(x x2) {
        if (x2 == null) {
            return this;
        }
        return this.a(x2.c(), x2.d());
    }

    public x a(String string, int n2) {
        String[] arrstring;
        String[] arrstring2;
        String string2;
        if (n2 <= 0) {
            return this;
        }
        if (this.g != null) {
            string2 = this.g;
            arrstring2 = this.i;
            arrstring = this.j;
        } else {
            string2 = string;
            arrstring2 = null;
            arrstring = null;
        }
        return new x(string2, n2, arrstring2, arrstring);
    }

    public String[] a() {
        return this.i;
    }

    public String[] b() {
        return this.j;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public boolean e() {
        return this.h <= 0;
    }

    public String toString() {
        return this.e() ? this.g : this.g + "@" + this.h;
    }
}

