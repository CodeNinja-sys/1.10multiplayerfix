/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ac;
import com.sun.jna.aw;
import com.sun.jna.ay;
import com.sun.jna.bw;
import com.sun.jna.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bc
extends ac
implements q {
    private boolean b;
    private List c = new ArrayList();
    private Object[] d;

    public bc(String[] arrstring) {
        this(arrstring, false);
    }

    public bc(String[] arrstring, boolean bl2) {
        this((Object[])arrstring, bl2);
    }

    public bc(bw[] arrbw) {
        this(arrbw, true);
    }

    private bc(Object[] arrobject, boolean bl2) {
        super((arrobject.length + 1) * ay.H);
        this.d = arrobject;
        this.b = bl2;
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            ay ay2 = null;
            if (arrobject[i2] != null) {
                aw aw2 = new aw(arrobject[i2].toString(), bl2);
                this.c.add(aw2);
                ay2 = aw2.a();
            }
            this.a((long)(ay.H * i2), ay2);
        }
        this.a((long)(ay.H * arrobject.length), (ay)null);
    }

    public void a() {
        boolean bl2 = this.d instanceof bw[];
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            ay ay2 = this.i(i2 * ay.H);
            CharSequence charSequence = null;
            if (ay2 != null) {
                charSequence = ay2.a(0L, this.b);
                if (bl2) {
                    charSequence = new bw((String)charSequence);
                }
            }
            this.d[i2] = charSequence;
        }
    }

    public String toString() {
        String string = this.b ? "const wchar_t*[]" : "const char*[]";
        string = string + Arrays.asList(this.d);
        return string;
    }
}

