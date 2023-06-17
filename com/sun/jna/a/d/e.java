/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.f;
import com.sun.jna.a.d.gd;
import com.sun.jna.ay;
import java.util.ArrayList;

public class e {
    private gd a = null;
    private String b;
    private byte[] c;
    private String[] d;

    public gd a() {
        return this.a;
    }

    public int b() {
        return this.a.H.intValue();
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a.H.intValue() & 0xFFFF;
    }

    public int e() {
        return this.a.c.intValue();
    }

    public int f() {
        return this.a.a.intValue();
    }

    public String[] g() {
        return this.d;
    }

    public f h() {
        switch (this.a.I.intValue()) {
            case 0: 
            case 4: {
                return f.c;
            }
            case 16: {
                return f.e;
            }
            case 8: {
                return f.d;
            }
            case 1: {
                return f.a;
            }
            case 2: {
                return f.b;
            }
        }
        throw new RuntimeException("Invalid type: " + this.a.I.intValue());
    }

    public byte[] i() {
        return this.c;
    }

    public e(ay ay2) {
        this.a = new gd(ay2);
        this.b = ay2.a((long)this.a.e(), true);
        if (this.a.Q.intValue() > 0) {
            this.c = ay2.b((long)this.a.R.intValue(), this.a.Q.intValue());
        }
        if (this.a.J.intValue() > 0) {
            ArrayList<String> arrayList = new ArrayList<String>();
            long l2 = this.a.N.intValue();
            for (int i2 = this.a.J.intValue(); i2 > 0; --i2) {
                String string = ay2.a(l2, true);
                arrayList.add(string);
                l2 += (long)(string.length() * Native.c);
                l2 += (long)Native.c;
            }
            this.d = arrayList.toArray(new String[0]);
        }
    }
}

