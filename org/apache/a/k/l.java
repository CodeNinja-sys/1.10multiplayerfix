/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ac;
import org.apache.a.ai;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.an;
import org.apache.a.f;
import org.apache.a.k.o;
import org.apache.a.k.p;
import org.apache.a.k.r;
import org.apache.a.k.w;
import org.apache.a.k.x;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class l
implements w {
    public static final l a = new l();
    public static final l b = new l();
    protected final ak c;

    public l(ak ak2) {
        this.c = ak2 != null ? ak2 : ac.d;
    }

    public l() {
        this(null);
    }

    public static ak a(String string, w w2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (w2 != null ? w2 : b).a(d2, x2);
    }

    public ak a(d d2, x x2) {
        int n2;
        int n3;
        int n4;
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        String string = this.c.a();
        int n5 = string.length();
        int n6 = x2.c();
        int n7 = x2.b();
        this.e(d2, x2);
        int n8 = x2.c();
        if (n8 + n5 + 4 > n7) {
            throw new ai("Not a valid protocol version: " + d2.a(n6, n7));
        }
        boolean bl2 = true;
        for (n4 = 0; bl2 && n4 < n5; ++n4) {
            bl2 = d2.a(n8 + n4) == string.charAt(n4);
        }
        if (bl2) {
            boolean bl3 = bl2 = d2.a(n8 + n5) == '/';
        }
        if (!bl2) {
            throw new ai("Not a valid protocol version: " + d2.a(n6, n7));
        }
        n4 = d2.a(46, n8 += n5 + 1, n7);
        if (n4 == -1) {
            throw new ai("Invalid protocol version number: " + d2.a(n6, n7));
        }
        try {
            n3 = Integer.parseInt(d2.b(n8, n4));
        }
        catch (NumberFormatException numberFormatException) {
            throw new ai("Invalid protocol major version number: " + d2.a(n6, n7));
        }
        n8 = n4 + 1;
        int n9 = d2.a(32, n8, n7);
        if (n9 == -1) {
            n9 = n7;
        }
        try {
            n2 = Integer.parseInt(d2.b(n8, n9));
        }
        catch (NumberFormatException numberFormatException) {
            throw new ai("Invalid protocol minor version number: " + d2.a(n6, n7));
        }
        x2.a(n9);
        return this.a(n3, n2);
    }

    protected ak a(int n2, int n3) {
        return this.c.a(n2, n3);
    }

    public boolean b(d d2, x x2) {
        int n2;
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        String string = this.c.a();
        int n3 = string.length();
        if (d2.e() < n3 + 4) {
            return false;
        }
        if (n2 < 0) {
            n2 = d2.e() - 4 - n3;
        } else if (n2 == 0) {
            for (n2 = x2.c(); n2 < d2.e() && org.apache.a.n.f.a(d2.a(n2)); ++n2) {
            }
        }
        if (n2 + n3 + 4 > d2.e()) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = 0; bl2 && i2 < n3; ++i2) {
            bl2 = d2.a(n2 + i2) == string.charAt(i2);
        }
        if (bl2) {
            bl2 = d2.a(n2 + n3) == '/';
        }
        return bl2;
    }

    public static am b(String string, w w2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (w2 != null ? w2 : b).c(d2, x2);
    }

    public am c(d d2, x x2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        int n2 = x2.c();
        int n3 = x2.b();
        try {
            this.e(d2, x2);
            int n4 = x2.c();
            int n5 = d2.a(32, n4, n3);
            if (n5 < 0) {
                throw new ai("Invalid request line: " + d2.a(n2, n3));
            }
            String string = d2.b(n4, n5);
            x2.a(n5);
            this.e(d2, x2);
            n4 = x2.c();
            n5 = d2.a(32, n4, n3);
            if (n5 < 0) {
                throw new ai("Invalid request line: " + d2.a(n2, n3));
            }
            String string2 = d2.b(n4, n5);
            x2.a(n5);
            ak ak2 = this.a(d2, x2);
            this.e(d2, x2);
            if (!x2.d()) {
                throw new ai("Invalid request line: " + d2.a(n2, n3));
            }
            return this.a(string, string2, ak2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new ai("Invalid request line: " + d2.a(n2, n3));
        }
    }

    protected am a(String string, String string2, ak ak2) {
        return new o(string, string2, ak2);
    }

    public static an c(String string, w w2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (w2 != null ? w2 : b).d(d2, x2);
    }

    public an d(d d2, x x2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        int n2 = x2.c();
        int n3 = x2.b();
        try {
            int n4;
            ak ak2 = this.a(d2, x2);
            this.e(d2, x2);
            int n5 = x2.c();
            int n6 = d2.a(32, n5, n3);
            if (n6 < 0) {
                n6 = n3;
            }
            String string = d2.b(n5, n6);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (Character.isDigit(string.charAt(i2))) continue;
                throw new ai("Status line contains invalid status code: " + d2.a(n2, n3));
            }
            try {
                n4 = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                throw new ai("Status line contains invalid status code: " + d2.a(n2, n3));
            }
            n5 = n6;
            String string2 = n5 < n3 ? d2.b(n5, n3) : "";
            return this.a(ak2, n4, string2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new ai("Invalid status line: " + d2.a(n2, n3));
        }
    }

    protected an a(ak ak2, int n2, String string) {
        return new p(ak2, n2, string);
    }

    public static f d(String string, w w2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        return (w2 != null ? w2 : b).a(d2);
    }

    public f a(d d2) {
        return new r(d2);
    }

    protected void e(d d2, x x2) {
        int n2;
        int n3 = x2.b();
        for (n2 = x2.c(); n2 < n3 && org.apache.a.n.f.a(d2.a(n2)); ++n2) {
        }
        x2.a(n2);
    }
}

