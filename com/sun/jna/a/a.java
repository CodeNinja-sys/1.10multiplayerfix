/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.b;
import com.sun.jna.a.c;
import com.sun.jna.a.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 48;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 511;
    private final Map l = new HashMap();
    private List m = new ArrayList();

    protected abstract void a(File var1, int var2, boolean var3);

    protected abstract void a(File var1);

    public abstract void a();

    public void b(File file) {
        this.a(file, 511);
    }

    public void a(File file, int n2) {
        this.b(file, n2, file.isDirectory());
    }

    public void b(File file, int n2, boolean bl2) {
        this.l.put(file, new Integer(n2));
        this.a(file, n2, bl2);
    }

    public void c(File file) {
        if (this.l.remove(file) != null) {
            this.a(file);
        }
    }

    protected void a(b b2) {
        for (c c2 : this.m) {
            c2.a(b2);
        }
    }

    public synchronized void a(c c2) {
        ArrayList<c> arrayList = new ArrayList<c>(this.m);
        arrayList.add(c2);
        this.m = arrayList;
    }

    public synchronized void b(c c2) {
        ArrayList arrayList = new ArrayList(this.m);
        arrayList.remove(c2);
        this.m = arrayList;
    }

    protected void finalize() {
        for (File file : this.l.keySet()) {
            this.c(file);
        }
        this.a();
    }

    public static a b() {
        return com.sun.jna.a.d.a;
    }
}

