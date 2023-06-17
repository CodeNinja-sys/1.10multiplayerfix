/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ew;
import com.ibm.icu.d.fa;
import com.ibm.icu.d.fg;
import com.ibm.icu.d.fi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fc
extends fg {
    private ew a;
    private double b;
    private boolean c;
    private List d = new ArrayList();

    public ew a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public double c() {
        return this.b;
    }

    public List d() {
        return this.d;
    }

    public fi a(List list, List list2) {
        if (list != null) {
            list.clear();
        }
        list2.clear();
        fi fi2 = null;
        for (fi fi3 : this.d) {
            if (fi3.b()) {
                list.add(fi3);
                continue;
            }
            if ("other".equals(fi3.a())) {
                if (fi2 != null) continue;
                fi2 = fi3;
                continue;
            }
            list2.add(fi3);
        }
        return fi2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(').append(this.a.toString()).append(" style) ");
        if (this.b()) {
            stringBuilder.append("offset:").append(this.b).append(' ');
        }
        return stringBuilder.append(this.d.toString()).toString();
    }

    private fc(ew ew2) {
        super(null);
        this.a = ew2;
    }

    private void a(fi fi2) {
        this.d.add(fi2);
    }

    private fc e() {
        this.d = Collections.unmodifiableList(this.d);
        return this;
    }

    /* synthetic */ fc(ew ew2, fa fa2) {
        this(ew2);
    }

    static /* synthetic */ void a(fc fc2, fi fi2) {
        fc2.a(fi2);
    }

    static /* synthetic */ fc a(fc fc2) {
        return fc2.e();
    }

    static /* synthetic */ boolean a(fc fc2, boolean bl2) {
        fc2.c = bl2;
        return fc2.c;
    }

    static /* synthetic */ double a(fc fc2, double d2) {
        fc2.b = d2;
        return fc2.b;
    }
}

