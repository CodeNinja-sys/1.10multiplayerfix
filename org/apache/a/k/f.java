/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ag;
import org.apache.a.g;
import org.apache.a.k.t;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class f
implements t {
    public static final f a = new f();
    public static final f b = new f();
    public static final String c = " ;,:@()<>\\\"/[]?={}\t";
    public static final String d = "\"\\";

    public static String a(g[] arrg, boolean bl2, t t2) {
        return (t2 != null ? t2 : b).a(null, arrg, bl2).toString();
    }

    public d a(d d2, g[] arrg, boolean bl2) {
        org.apache.a.o.a.a(arrg, "Header element array");
        int n2 = this.a(arrg);
        d d3 = d2;
        if (d3 == null) {
            d3 = new d(n2);
        } else {
            d3.b(n2);
        }
        for (int i2 = 0; i2 < arrg.length; ++i2) {
            if (i2 > 0) {
                d3.a(", ");
            }
            this.a(d3, arrg[i2], bl2);
        }
        return d3;
    }

    protected int a(g[] arrg) {
        if (arrg == null || arrg.length < 1) {
            return 0;
        }
        int n2 = (arrg.length - 1) * 2;
        for (g g2 : arrg) {
            n2 += this.a(g2);
        }
        return n2;
    }

    public static String a(g g2, boolean bl2, t t2) {
        return (t2 != null ? t2 : b).a(null, g2, bl2).toString();
    }

    public d a(d d2, g g2, boolean bl2) {
        int n2;
        org.apache.a.o.a.a(g2, "Header element");
        int n3 = this.a(g2);
        d d3 = d2;
        if (d3 == null) {
            d3 = new d(n3);
        } else {
            d3.b(n3);
        }
        d3.a(g2.a());
        String string = g2.b();
        if (string != null) {
            d3.a('=');
            this.a(d3, string, bl2);
        }
        if ((n2 = g2.d()) > 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                d3.a("; ");
                this.a(d3, g2.a(i2), bl2);
            }
        }
        return d3;
    }

    protected int a(g g2) {
        int n2;
        if (g2 == null) {
            return 0;
        }
        int n3 = g2.a().length();
        String string = g2.b();
        if (string != null) {
            n3 += 3 + string.length();
        }
        if ((n2 = g2.d()) > 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                n3 += 2 + this.a(g2.a(i2));
            }
        }
        return n3;
    }

    public static String a(ag[] arrag, boolean bl2, t t2) {
        return (t2 != null ? t2 : b).a(null, arrag, bl2).toString();
    }

    public d a(d d2, ag[] arrag, boolean bl2) {
        org.apache.a.o.a.a(arrag, "Header parameter array");
        int n2 = this.a(arrag);
        d d3 = d2;
        if (d3 == null) {
            d3 = new d(n2);
        } else {
            d3.b(n2);
        }
        for (int i2 = 0; i2 < arrag.length; ++i2) {
            if (i2 > 0) {
                d3.a("; ");
            }
            this.a(d3, arrag[i2], bl2);
        }
        return d3;
    }

    protected int a(ag[] arrag) {
        if (arrag == null || arrag.length < 1) {
            return 0;
        }
        int n2 = (arrag.length - 1) * 2;
        for (ag ag2 : arrag) {
            n2 += this.a(ag2);
        }
        return n2;
    }

    public static String a(ag ag2, boolean bl2, t t2) {
        return (t2 != null ? t2 : b).a(null, ag2, bl2).toString();
    }

    public d a(d d2, ag ag2, boolean bl2) {
        org.apache.a.o.a.a(ag2, "Name / value pair");
        int n2 = this.a(ag2);
        d d3 = d2;
        if (d3 == null) {
            d3 = new d(n2);
        } else {
            d3.b(n2);
        }
        d3.a(ag2.a());
        String string = ag2.b();
        if (string != null) {
            d3.a('=');
            this.a(d3, string, bl2);
        }
        return d3;
    }

    protected int a(ag ag2) {
        if (ag2 == null) {
            return 0;
        }
        int n2 = ag2.a().length();
        String string = ag2.b();
        if (string != null) {
            n2 += 3 + string.length();
        }
        return n2;
    }

    protected void a(d d2, String string, boolean bl2) {
        int n2;
        boolean bl3 = bl2;
        if (!bl3) {
            for (n2 = 0; n2 < string.length() && !bl3; ++n2) {
                bl3 = this.a(string.charAt(n2));
            }
        }
        if (bl3) {
            d2.a('\"');
        }
        for (n2 = 0; n2 < string.length(); ++n2) {
            char c2 = string.charAt(n2);
            if (this.b(c2)) {
                d2.a('\\');
            }
            d2.a(c2);
        }
        if (bl3) {
            d2.a('\"');
        }
    }

    protected boolean a(char c2) {
        return c.indexOf(c2) >= 0;
    }

    protected boolean b(char c2) {
        return d.indexOf(c2) >= 0;
    }
}

