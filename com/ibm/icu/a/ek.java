/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.el;
import com.ibm.icu.a.em;
import com.ibm.icu.a.r;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.iz;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import com.ibm.icu.util.n;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.MissingResourceException;
import java.util.TreeSet;

public class ek
extends cu {
    private static final long aW = 1131984966440549435L;
    private cu aX;
    private cu aY;
    private eo aZ;
    private iz ba = null;
    private String bb = null;
    private String bc = null;
    int a;
    int b;
    dn c;
    private transient em[] bd = null;

    public ek(int n2, int n3, dn dn2) {
        this.c = dn2;
        this.b = n2;
        this.a = n3;
        if (this.a != -1) {
            int n4 = this.a & 0xFFFFFF7F;
            cu cu2 = cu.b(n4, dn2);
            if (!(cu2 instanceof iz)) {
                throw new IllegalArgumentException("Can't create SimpleDateFormat for date style");
            }
            this.ba = (iz)cu2;
            this.bb = this.ba.l();
            if (this.b != -1 && (cu2 = cu.a(n4 = this.b & 0xFFFFFF7F, dn2)) instanceof iz) {
                this.bc = ((iz)cu2).l();
            }
        } else {
            int n5 = this.b & 0xFFFFFF7F;
            cu cu3 = cu.a(n5, dn2);
            if (!(cu3 instanceof iz)) {
                throw new IllegalArgumentException("Can't create SimpleDateFormat for time style");
            }
            this.ba = (iz)cu3;
            this.bc = this.ba.l();
        }
        this.a(null, this.c);
        this.k();
        this.b(this.d, this.c);
    }

    public StringBuffer a(n n2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String string = null;
        if (this.a != -1) {
            int n3 = ek.c(n2);
            string = this.c(n3);
        }
        if (this.ba != null && (this.bb != null || this.bc != null)) {
            if (this.bb == null) {
                this.ba.c(this.bc);
                this.ba.a(n2, stringBuffer, fieldPosition);
            } else if (this.bc == null) {
                if (string != null) {
                    stringBuffer.append(string);
                } else {
                    this.ba.c(this.bb);
                    this.ba.a(n2, stringBuffer, fieldPosition);
                }
            } else {
                String string2 = this.bb;
                if (string != null) {
                    string2 = "'" + string.replace("'", "''") + "'";
                }
                StringBuffer stringBuffer2 = new StringBuffer("");
                this.aZ.a(new Object[]{this.bc, string2}, stringBuffer2, new FieldPosition(0));
                this.ba.c(stringBuffer2.toString());
                this.ba.a(n2, stringBuffer, fieldPosition);
            }
        } else if (this.aX != null) {
            if (string != null) {
                stringBuffer.append(string);
            } else {
                this.aX.a(n2, stringBuffer, fieldPosition);
            }
        }
        return stringBuffer;
    }

    public void a(String string, n n2, ParsePosition parsePosition) {
        throw new UnsupportedOperationException("Relative Date parse is not implemented yet");
    }

    private String c(int n2) {
        if (this.bd == null) {
            this.k();
        }
        for (int i2 = 0; i2 < this.bd.length; ++i2) {
            if (this.bd[i2].a != n2) continue;
            return this.bd[i2].b;
        }
        return null;
    }

    private synchronized void k() {
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", this.c);
        bc bc3 = bc2.b("fields/day/relative");
        TreeSet<em> treeSet = new TreeSet<em>(new el(this));
        dy dy2 = bc3.D();
        while (dy2.d()) {
            dv dv2 = dy2.a();
            String string = dv2.k();
            String string2 = dv2.A();
            em em2 = new em(string, string2);
            treeSet.add(em2);
        }
        this.bd = treeSet.toArray(new em[0]);
    }

    private static int c(n n2) {
        n n3 = (n)n2.clone();
        Date date = new Date(System.currentTimeMillis());
        n3.i();
        n3.a(date);
        int n4 = n2.b(20) - n3.b(20);
        return n4;
    }

    private n a(dj dj2, dn dn2) {
        if (this.d == null) {
            this.d = dj2 == null ? com.ibm.icu.util.n.a(dn2) : com.ibm.icu.util.n.a(dj2, dn2);
        }
        return this.d;
    }

    private eo b(n n2, dn dn2) {
        String string = "{1} {0}";
        try {
            r r2 = new r(dn2, n2.b());
            String[] arrstring = r2.a();
            if (arrstring != null && arrstring.length >= 9) {
                int n3 = 8;
                if (arrstring.length >= 13) {
                    switch (this.a) {
                        case 0: 
                        case 128: {
                            ++n3;
                            break;
                        }
                        case 1: 
                        case 129: {
                            n3 += 2;
                            break;
                        }
                        case 2: 
                        case 130: {
                            n3 += 3;
                            break;
                        }
                        case 3: 
                        case 131: {
                            n3 += 4;
                            break;
                        }
                    }
                }
                string = arrstring[n3];
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        this.aZ = new eo(string, dn2);
        return this.aZ;
    }
}

