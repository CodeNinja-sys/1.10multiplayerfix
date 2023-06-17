/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.c.a;

import com.sun.jna.Native;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.di;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.gp;
import com.sun.jna.a.d.hi;
import d.b.a.b;

public class d
implements b {
    private gp a;

    public d() {
        this.a = new gp();
        if (!ac.g.a(this.a)) {
            throw new dy(ac.g.f());
        }
    }

    public int a() {
        return this.a.b.intValue();
    }

    public int b() {
        return this.a.c.intValue();
    }

    public int c() {
        return this.a.F.intValue();
    }

    public int d() {
        return this.a.G.intValue();
    }

    public String e() {
        return Native.a(this.a.H);
    }

    public int f() {
        return this.a.K.intValue();
    }

    public byte g() {
        return this.a.L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        String string = null;
        if (this.d() == 2) {
            if (this.a() == 6 && this.b() == 3 && this.g() == 1) {
                string = "8.1";
            } else if (this.a() == 6 && this.b() == 3 && this.g() != 1) {
                string = "Server 2012 R2";
            } else if (this.a() == 6 && this.b() == 2 && this.g() == 1) {
                string = "8";
            } else if (this.a() == 6 && this.b() == 2 && this.g() != 1) {
                string = "Server 2012";
            } else if (this.a() == 6 && this.b() == 1 && this.g() == 1) {
                string = "7";
            } else if (this.a() == 6 && this.b() == 1 && this.g() != 1) {
                string = "Server 2008 R2";
            } else if (this.a() == 6 && this.b() == 0 && this.g() != 1) {
                string = "Server 2008";
            } else if (this.a() == 6 && this.b() == 0 && this.g() == 1) {
                string = "Vista";
            } else if (this.a() == 5 && this.b() == 2 && this.g() != 1 && di.g.c(89) != 0) {
                string = "Server 2003";
            } else if (this.a() == 5 && this.b() == 2 && this.g() != 1 && di.g.c(89) == 0) {
                string = "Server 2003 R2";
            } else if (this.a() == 5 && this.b() == 2 && this.g() == 1) {
                string = "XP";
            } else if (this.a() == 5 && this.b() == 1) {
                string = "XP";
            } else if (this.a() == 5 && this.b() == 0) {
                string = "2000";
            } else {
                if (this.a() != 4) throw new RuntimeException("Unsupported Windows NT version: " + this.a.toString());
                string = "NT 4";
                if ("Service Pack 6".equals(this.e()) && com.sun.jna.a.d.b.a(hi.i, "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Hotfix\\Q246009")) {
                    return "NT4 SP6a";
                }
            }
            if (this.a.I.intValue() <= 0) return string;
            return string + " SP" + this.a.I.intValue();
        }
        if (this.d() != 1) throw new RuntimeException("Unsupported Windows platform: " + this.a.toString());
        if (this.a() == 4 && this.b() == 90) {
            return "ME";
        }
        if (this.a() == 4 && this.b() == 10) {
            if (this.a.H[1] != 'A') return "98";
            return "98 SE";
        }
        if (this.a() != 4) throw new RuntimeException("Unsupported Windows 9x version: " + this.a.toString());
        if (this.b() != 0) throw new RuntimeException("Unsupported Windows 9x version: " + this.a.toString());
        if (this.a.H[1] == 'C') return "95 OSR2";
        if (this.a.H[1] != 'B') return "95";
        return "95 OSR2";
    }

    public d(gp gp2) {
        this.a = gp2;
    }
}

