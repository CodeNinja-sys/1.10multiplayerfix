/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.b.a;

import d.c.a;

public class b
implements d.a.b {
    private long a = 0L;

    public long b() {
        long l2 = 0L;
        for (String string : d.c.a.a("vm_stat")) {
            String[] arrstring;
            if (string.startsWith("Pages free:")) {
                arrstring = string.split(":\\s+");
                l2 += new Long(arrstring[1].replace(".", "")).longValue();
                continue;
            }
            if (!string.startsWith("Pages speculative:")) continue;
            arrstring = string.split(":\\s+");
            l2 += new Long(arrstring[1].replace(".", "")).longValue();
        }
        return l2 *= 4096L;
    }

    public long a() {
        if (this.a == 0L) {
            this.a = new Long(d.c.a.b("sysctl -n hw.memsize"));
        }
        return this.a;
    }
}

