/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.aa;
import com.ibm.icu.d.jd;
import com.ibm.icu.d.jg;
import com.ibm.icu.d.jk;
import com.ibm.icu.d.jn;
import com.ibm.icu.d.jp;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.dn;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashSet;
import java.util.Set;

public class jf {
    int a;
    int b;
    jp c;
    final lf d = new lf(0, 0x10FFFF);
    final Set e = new LinkedHashSet();
    private jn f;

    public jf() {
        this.a = 944111087;
        this.b = -1;
        this.c = null;
        this.f = jn.b;
    }

    public jf(jd jd2) {
        this.a = jd.a(jd2);
        this.b = jd.b(jd2);
        this.c = null;
        this.d.b(jd.c(jd2));
        this.e.addAll(jd.d(jd2));
        this.f = jd.e(jd2);
    }

    public jd a() {
        if (this.c == null) {
            try {
                this.c = jp.a();
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (!jp.a(this.c.a)) {
            return null;
        }
        jd jd2 = new jd(null);
        jd.a(jd2, this.a);
        jd.b(jd2, this.b);
        jd.a(jd2, this.c);
        jd.a(jd2, (lf)this.d.clone());
        jd.c(jd2).l();
        jd.a(jd2, this.e);
        jd.a(jd2, this.f);
        return jd2;
    }

    public jf a(Reader reader, Reader reader2) {
        this.c = new jp();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        jg.a(this.c, reader);
        jk.a(this.c, dataOutputStream, reader2);
        return this;
    }

    public jf a(int n2) {
        if (0 != (n2 & 0)) {
            throw new IllegalArgumentException("Bad Spoof Checks value.");
        }
        this.b = n2 & 0xFFFFFFFF;
        return this;
    }

    public jf a(Set set) {
        this.d.g();
        for (dn dn2 : set) {
            this.a(dn2, this.d);
        }
        this.e.clear();
        if (set.size() == 0) {
            this.d.b(0, 0x10FFFF);
            this.b &= 0xFFFFFFBF;
            return this;
        }
        lf lf2 = new lf();
        lf2.j(4106, 0);
        this.d.f(lf2);
        lf2.j(4106, 1);
        this.d.f(lf2);
        this.e.addAll(set);
        this.b |= 0x40;
        return this;
    }

    private void a(dn dn2, lf lf2) {
        int[] arrn = aa.a(dn2);
        lf lf3 = new lf();
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            lf3.j(4106, arrn[i2]);
            lf2.f(lf3);
        }
    }

    public jf a(lf lf2) {
        this.d.b(lf2);
        this.e.clear();
        this.b |= 0x40;
        return this;
    }

    public jf a(jn jn2) {
        this.f = jn2;
        this.b |= 0x10;
        return this;
    }
}

